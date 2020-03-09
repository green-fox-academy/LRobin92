import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber;
        randomNumber = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");

        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Congratulation");
                break;
            } else if (userInput > randomNumber) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
        }
    }
}