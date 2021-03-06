import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;

public class WriteSingleLine {
    public static void main(String[] args) {
        try{
            manipulator();
        }catch(Exception e){
            System.out.println("Unable to write file: my-file.txt");
        }
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

    }
    public static void manipulator() throws IOException {
        String myName = "Robin Laszlo";
        Path filePath = Paths.get("my-file.txt");
        Files.write(filePath, Collections.singleton(myName));

    }
}