import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        double avg = 0;
        System.out.println("Input the numbers : ");
        int userInput = scanner.nextInt();
        System.out.println("Please enter the " + userInput + " number(s):");
        for (int i = 0; i < userInput; i++) {
            int numbers = scanner.nextInt();
            summ +=numbers;
        }
        avg=summ/userInput;
        System.out.println("The sum of the " + userInput + " number(s) are/is:" + summ + " and the Average is : " +avg);

    }
}



