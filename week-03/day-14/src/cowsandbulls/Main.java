package cowsandbulls;

public class Main {
  public static void main(String[] args) {
    CowsAndBulls cowsbulls = new CowsAndBulls();
    System.out.println(cowsbulls.randomInteger);
    String guessThis = cowsbulls.randomNumberToString();
    while (!cowsbulls.isFinished) {
      cowsbulls.compareTheTwoStrings(guessThis, cowsbulls.userGuess());
    }
  }
}