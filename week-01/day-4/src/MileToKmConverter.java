import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How many miles you want to convert to KM?");
        int userInput1 = scanner.nextInt();
        System.out.println("It's: " + userInput1 * 0.621371 + " KM");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
