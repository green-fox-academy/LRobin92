import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {

        try {
            writeFile("apple", 5, "multiple.txt");
        } catch (Exception e){
            System.out.println("Asd");
    }
    }
    private static void writeFile(String word, int number, String path) throws IOException {
        Path pathFile = Paths.get(path);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            lines.add(word);
        }
        Files.write(pathFile, lines);
    }

}
