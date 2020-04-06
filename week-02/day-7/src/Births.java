import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  // Create a function that
  // - takes the name of a CSV file as a parameter,
  //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
  // - returns the year when the most births happened.
  //   - if there were multiple years with the same number of births then return any one of them
  // You can find such a CSV file in this directory named births.csv
  // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.
  public static void main(String[] args) {
    System.out.println(mostBirthsHappened("births.csv"));
  }

  private static String mostBirthsHappened(String filename) {
    List<String> lines = new ArrayList<>();
    Path filePath = Paths.get(filename);
    List<String> listOfYearsWithDates = new ArrayList<>();
    List<String> listOfYears = new ArrayList<>();
    HashMap<String, Integer> storedYears = new HashMap<>();
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

    for (String line : lines) {
      String[] splitLines = line.split(";");
      listOfYearsWithDates.add(splitLines[1]);
    }

    for (int i = 0; i < listOfYearsWithDates.size(); i++) {
      listOfYears.add(listOfYearsWithDates.get(i).substring(0, 4));
    }
    for (String year : listOfYears) {
      if (!storedYears.containsKey(year)) {
        storedYears.put(year, 0);
      }
    }
    for (String year : listOfYears) {
      for (Map.Entry<String, Integer> entry : storedYears.entrySet()) {
        if (entry.getKey().equals(year)) {
          int valueCounter = entry.getValue();
          valueCounter++;
          entry.setValue(valueCounter);
        }
      }
    }
    List<String> theChosenYear = new ArrayList<>();
    int [] highestOccurenceHolder = new int [1];
    String[] mostCommonYear = new String[1];
    for (int a = 0; a < 1; a++) {
      for (Map.Entry<String, Integer> letterAndOccurence : storedYears.entrySet()) {
        if(letterAndOccurence.getValue() > highestOccurenceHolder[a]){
          highestOccurenceHolder[a] = letterAndOccurence.getValue();
        }
      }
      for (Map.Entry<String, Integer> letterAndOccurence : storedYears.entrySet()) {
        if(letterAndOccurence.getValue() == highestOccurenceHolder[a]){
          mostCommonYear[a] = letterAndOccurence.getKey();
          theChosenYear.add(mostCommonYear[a]);
        }
      }
    }
    result += theChosenYear.get(0); // ha az első legnagyobbat szeretnénk kiiratni csak (itt két legtöbb év volt)
    return result;
  }
}