import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logs {
  public static void main(String[] args) {
    System.out.println(uniqueIPAdresses());
    System.out.println(ratioGetPost());
  }
  // Write a function that returns an array with the unique IP adresses.
  public static List<String> uniqueIPAdresses() {
    List<String> lines = new ArrayList<>();
    HashMap<String , Integer> uniqeIPAdressesHashMap = new HashMap<>();
    List<String> uniqeIPAdresses = new ArrayList<>();
    Path filePath = Paths.get("log.txt");
    try {
      lines = Files.readAllLines(filePath);
    } catch (NoSuchFileException e) {
      System.out.println("No such file");
    } catch (IOException e) {
      System.out.println("Unable to read the file");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    List<String> addressOfIPList = new ArrayList<>();
    for (String line : lines) {
      String[] splitLines = line.split("   ");
      addressOfIPList.add(splitLines[1]);
    }
    for (String adress : addressOfIPList) {
      if (!uniqeIPAdressesHashMap.containsKey(adress)) {
        uniqeIPAdressesHashMap.put(adress, 1);
      }
    }
    for (Map.Entry<String, Integer> hashMapList : uniqeIPAdressesHashMap.entrySet()) {
        uniqeIPAdresses.add(hashMapList.getKey());
    }
    return uniqeIPAdresses;
  }
  // Write a function that returns the GET / POST request ratio.
  public static int ratioGetPost(){
    int getCounter = 0;
    int postCounter = 0;
    List<String> lines = new ArrayList<>();
    Path filePath = Paths.get("log.txt");
    try {
      lines = Files.readAllLines(filePath);
    } catch (NoSuchFileException e) {
      System.out.println("No such file");
    } catch (IOException e) {
      System.out.println("Unable to read the file");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    List<String> getAndPost = new ArrayList<>();
    for (String line : lines) {
      String[] splitLines = line.split("   ");
      getAndPost.add(splitLines[2]);
    }
    for (String word: getAndPost) {
      if (word.equals("POST /")){
        postCounter++;
      }else if(word.equals("GET /")){
        getCounter++;
      }
    }
    int ratio = getCounter / postCounter;
    System.out.println(getAndPost);
    return ratio;
  }

}
