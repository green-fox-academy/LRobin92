package streamexercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
  //Create a Stream expression which reads all text from this file,
  //and prints the 100 most common words in descending order.
  //Keep in mind that the text contains punctuation characters which should be ignored.
  // The result should be something like this:
  public static void main(String[] args) {
    Path path = Paths.get("wiki.txt");
    try (Stream<String> lines = Files.lines(path)) {
      lines
          .flatMap(line -> Arrays.stream(line.split(" ")))//splitteltük a sorokat " "-enként
          .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
          //Az összes "érdekes karakter kiszedjük, azzal, hogy lecseréljük ""-re,
          // majd a tolowercase-el kisbetűssé tesszük őket, s a trimmel eltűntetjük a whitespaceket
          .filter(word -> word.length() > 0) //kiszedjük a szóközöket, már csak a szavak maradtak
          .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
          //összeszedjük a szavakat, majd megszámolja melyikből mennyi van
          .entrySet()//"elérhetővé teszem a hashmappet, hogy tudjam streamelni"
          .stream()
          .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
          //legnagyobbtól a legkisebbig sortoljuk
          .limit(100)//az első 100 szót írja csak ki
          .forEach(System.out::println);//kiírjuk a szavakat
    } catch (IOException ex) {
      System.out.println("Can not read the file");
    }
  }
}
