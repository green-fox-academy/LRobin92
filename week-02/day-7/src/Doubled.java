import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    System.out.println(decryptFunction());
    //decryptFunction();

  }
  protected static List<String> decryptFunction(){
    List<String> lines = new ArrayList<>();
    List<String> theDecryptedList = new ArrayList<>();

    Path filePath = Paths.get("duplicated-chars.txt");
    try {
      lines = Files.readAllLines(filePath);
    } catch (NoSuchFileException e) {
      System.out.println("No such file");
    } catch (IOException e) {
      System.out.println("Unable to read the file");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    for (String line: lines) {
      //2 új character alapú listák kreáltam, hogy ezekbe először a szétszedett charactereket tároljam,
      //majd a másikba a már duplikálódás mentes karaktereket tegyem bele, illetve egy üres stringet
      //amibe majd a karaktereket töltöm vissza
      List<Character> theDuplicatedChars = new ArrayList<>();
      List<Character> theDecryptedChars = new ArrayList<>();
      String charsBackToString = "";
      //itt szedem szét karakterekre a sorokat egy foreach-el
      for (char c: line.toCharArray()) {
        theDuplicatedChars.add(c);
      }
      //
      for (int i = 0; i < theDuplicatedChars.size(); i++) {
        if (i > 1) {
          theDuplicatedChars.remove(i - 1);
        }
        theDecryptedChars.add(theDuplicatedChars.get(i));
      }
      for (int i = 1; i < theDecryptedChars.size() ; i++) {
        charsBackToString +=theDecryptedChars.get(i);
      }
      theDecryptedList.add(charsBackToString);
    }
    return  theDecryptedList;
  }
}
