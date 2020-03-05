import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How many chickens do you have?");
        int userInput1 = scanner.nextInt();
        System.out.println("And how many pigs do you have?");
        int userInput2 = scanner.nextInt();
        System.out.println("Your animals legs numbers are: " +( (userInput1 * 2) + (userInput2 * 4) ));
    }
}
