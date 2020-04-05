import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFile {
    public static void main(String[] args) throws Exception {
        try{
            fileCopier();
        }catch(NoSuchFileException e){
            //System.out.println("No file founded");
            throw new IOException("No file");
        }catch (Exception e){
            throw new Exception("Something went wrong");
        }
        // Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    }
    public static void fileCopier() throws IOException {
        Path filePath = Paths.get("my-file.txt"); //create a Path object
        FileReader fileReader = new FileReader("my-file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("copyofmyfile.txt");
        String copyString;

        while((copyString =bufferedReader.readLine()) != null){
            fileWriter.write(copyString);
            fileWriter.flush();
        }
        bufferedReader.close();
        fileWriter.close();
    }
}
