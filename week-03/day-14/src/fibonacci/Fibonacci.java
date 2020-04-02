package fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
  //Write a function that computes a member of the fibonacci sequence by a given index
  //Create tests for multiple test cases.

  public int fibonacciFunction(int index) {

    try {
      ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(0, 1));
      for (int i = 1; i <= index; i++) {
        listOfNumbers.add(listOfNumbers.get(i) + listOfNumbers.get(i - 1));
      }
      return listOfNumbers.get(index);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Invalid index inserted");
    }
    return -1;
  }

}
