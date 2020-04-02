package cowsandbulls;

import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  //Create a class what is capable of playing exactly one game of Cows and Bulls (CAB). The player have to guess a 4 digit number.
  // For every digit that the player guessed correctly in the correct place, they have a “cow”.
  // For every digit the player guessed correctly in the wrong place is a “bull.” If the player types a number that does not exist, that guess will not have any result.
  //
  //Example: If the number to be found is "7624" and the player types "7296", the result is: "1 cow, 2 bull".
  //
  //The CAB object should have a random 4 digit number, which is the goal to guess.
  //The CAB object should have a state where the game state is stored (playing, finished).
  //The CAB object should have a counter where it counts the guesses.
  //The CAB object should have a guess method, which returns a string of the guess result
  //All methods, including constructor should be tested
  Scanner scanner = new Scanner(System.in);
  private String secretNumber = "";
  private String guessedNumber = "";
  private boolean isTheSame = false;



  public void addRandomNumbers() {
    Random random = new Random();
    int secretGuess = random.nextInt(8999) + 1000;
    Integer.toString(secretGuess);
    secretNumber += secretGuess;
  }
  public void guessTheNumber(){
    int userInput = scanner.nextInt();
    if (isValidNumber(userInput) == true){
      Integer.toString(userInput);
      guessedNumber += userInput;
    }else{
      userInput = scanner.nextInt();
    }

  }
  public boolean isValidNumber(int userInput){
    boolean isValid;
    if (userInput < 1000 || userInput >= 10000){
      System.out.println("We need 4 numbers");
      isValid = false;
    }else{
      isValid = true;
    }
    return isValid;
  }

  public static void main(String[] args) {
    CowsAndBulls asd = new CowsAndBulls();
    asd.addRandomNumbers();
    asd.guessTheNumber();
    System.out.println(asd.secretNumber);
    System.out.println(asd.guessedNumber);
  }


}
