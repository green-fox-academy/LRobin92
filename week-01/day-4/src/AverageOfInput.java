import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Give me 5 numbers: ");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();
        int userInput5 = scanner.nextInt();
        int inPutSummary = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double inPutAverage = (double)inPutSummary / 5;
        System.out.println("Your number summary is: " + inPutSummary);
        System.out.println("Your number average is: " + inPutAverage);

    }

}
