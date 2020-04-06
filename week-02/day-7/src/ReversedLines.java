import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  // Create a method that decrypts reversed-lines.txt
  public static void main(String[] args) {
    System.out.println(reverseFunction());
  }

  protected static List<String> reverseFunction() {
    List<String> lines = new ArrayList<>();
    List<String> theFinalList = new ArrayList<>();
    Path filePath = Paths.get("reversed-lines.txt");
    try {
      lines = Files.readAllLines(filePath);
    } catch (
        NoSuchFileException e) {
      System.out.println("No such file");
    } catch (
        IOException e) {
      System.out.println("Unable to read the file");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    String reversedString = "";
    String spaceBetweenTheLines = " ";
    for (String line : lines) {
      for (int i = line.length() - 1; i >= 0; i--) {
        reversedString = reversedString + line.charAt(i);
      }
      reversedString += spaceBetweenTheLines;
    }
    theFinalList.add(reversedString);
    return theFinalList;
  }

}
