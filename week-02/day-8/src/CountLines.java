import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        try {
            lineCounter();
        }catch (Exception e){
            System.out.println("Unable to reach the file, or something went wrong");
        }
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    }
    public static void lineCounter() throws IOException {
        Path filePath = Paths.get("my-file.txt");
        List<String> lines = Files.readAllLines(filePath);
        int lineSize = lines.size();
        System.out.println(lineSize);
    }
}
