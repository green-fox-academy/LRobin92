import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int userInput = scanner.nextInt();
        try{
            int result = 10 / userInput;
            System.out.println("its: " + result);
        }catch (ArithmeticException  e){
            System.out.println("Fail");
        }
        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    }
}
