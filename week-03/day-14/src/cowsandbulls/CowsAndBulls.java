package cowsandbulls;

import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {

  Random random = new Random();
  int randomInteger = random.nextInt(8999)+1000;
  String randomNumber = "";
  boolean isFinished;
  int countGuesses;

  public String randomNumberToString() {
    Integer.toString(randomInteger);
    randomNumber += randomInteger;
    return randomNumber;
  }

  public String userGuess() {
    System.out.print("Guess a number: ");
    Scanner scanner = new Scanner(System.in);
    this.countGuesses++;
    return scanner.next();
  }

  public void compareTheTwoStrings(String targetString, String userGuess) {
    //Compare our two strings
    int cowCounter = 0;
    int bullCounter = 0;

    for (int i = 0; i < targetString.length() ; i++) {
      if (targetString.charAt(i) == userGuess.charAt(i)) {
        cowCounter++;
      } else if ((userGuess.indexOf(targetString.charAt(i))!= -1) ) {
        bullCounter++;
      }
    }
    if (cowCounter == 4) {
      System.out.println("You win!");
      this.isFinished = true;
    }
    System.out.println(cowCounter + " cow, " + bullCounter + " bull");
    System.out.println("You guessed " +this.countGuesses + " time(s).");
  }
}