
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    System.out.println(ticTacResult("draw.txt"));
  }

  private static String ticTacResult(String filename) {
    List<String> lines = new ArrayList<>();
    Path filePath = Paths.get(filename);
    String result = "";
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
    if (lines.get(0).charAt(0) == lines.get(1).charAt(1) &&
        lines.get(0).charAt(0) == lines.get(2).charAt(2)
        || lines.get(0).charAt(2) == lines.get(1).charAt(1) &&
        lines.get(0).charAt(2) == lines.get(2).charAt(0)) {
      result += lines.get(1).charAt(1);
    } else if (lines.get(0).charAt(0) == lines.get(0).charAt(1) &&
        lines.get(0).charAt(0) == lines.get(0).charAt(2)
        || lines.get(1).charAt(0) == lines.get(1).charAt(1) &&
        lines.get(1).charAt(0) == lines.get(1).charAt(2)
        || lines.get(2).charAt(0) == lines.get(2).charAt(1) &&
        lines.get(2).charAt(0) == lines.get(2).charAt(2)) {
      result += lines.get(0).charAt(0);
    } else if (lines.get(0).charAt(0) == lines.get(1).charAt(0) &&
        lines.get(0).charAt(0) == lines.get(2).charAt(0)
        || lines.get(0).charAt(1) == lines.get(1).charAt(1) &&
        lines.get(0).charAt(1) == lines.get(2).charAt(1)
        || lines.get(0).charAt(2) == lines.get(1).charAt(2) &&
        lines.get(0).charAt(2) == lines.get(2).charAt(2)) {
      result += lines.get(0).charAt(0);
    } else {
      result += "Draw";
    }
    return result;
  }
}

