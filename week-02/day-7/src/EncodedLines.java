import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
  decryptFunction("encoded-lines.txt");

  }
  private static void decryptFunction(String filename) {
    List<String> lines = new ArrayList<>();
    Path filePath = Paths.get(filename);
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
  }
}
