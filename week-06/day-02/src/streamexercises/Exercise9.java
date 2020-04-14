package streamexercises;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  //Write a Stream Expression to find the frequency of characters in a given string!
  public static void main(String[] args) {
      String text = "Almapaprika";

      Character[] chars = new Character[text.length()];

      for (int i = 0; i < text.length(); i++) {
        chars[i] = text.charAt(i);
      }

      Map<Character, Long> frequency = Stream.of(chars)
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      System.out.println(frequency);
    }
}
