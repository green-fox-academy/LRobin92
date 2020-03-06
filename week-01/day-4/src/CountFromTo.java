import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        if(userInput1 > userInput2){
            System.out.println("The second number should be bigger");
        }else{
            while (userInput1 +1 < userInput2 ) {
            userInput1++;
            System.out.println(userInput1);
            }

        }

        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
    }
}
