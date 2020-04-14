package fox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  //Write a Stream Expression to find the foxes with green color!
  //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
  //Write a Stream Expression to find the frequency of foxes by color!
  public static void main(String[] args) {
    Fox fox1 = new Fox("Márk", "red", 3);
    Fox fox2 = new Fox("Zsombor", "green", 2);
    Fox fox3 = new Fox("Szebi", "green", 6);
    Fox fox4 = new Fox("Gabriel", "blue", 5);
    Fox fox5 = new Fox("Robin", "green", 3);

    List<Fox> listOfFoxes = new ArrayList<>(Arrays.asList(fox1,fox2,fox3,fox4,fox5));
    listOfFoxes.stream()
        .filter(f -> f.color.equals("green"))
        .forEach(f -> System.out.println(f.getName()));
    listOfFoxes.stream()
        .filter(f -> f.color.equals("green"))
        .filter(fox -> fox.age < 3)
        .forEach(f -> System.out.println(f.getName()));

    System.out.println(listOfFoxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting())));
  }
}
