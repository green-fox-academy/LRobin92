import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Give me a number ");
        Scanner scanner = new Scanner (System.in);
        int numberGiven = scanner.nextInt();
        System.out.println(sum(numberGiven));

    }
    public static int sum(int maximumValue){
        int total = 0;
        for (int i = 0; i <= maximumValue ; i++) {
            total +=i;
        }
        return total;
    }
    // Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
}
