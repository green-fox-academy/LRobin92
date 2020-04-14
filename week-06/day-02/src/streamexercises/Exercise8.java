package streamexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  //Write a Stream Expression to concatenate a Character list to a string!
  public static void main(String[] args) {
    List<Character> listOfChars = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
    String text = listOfChars.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(text);
  }

}
