import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        if (userInput1 > userInput2){
            System.out.println("The first number you entered was bigger");
        }else if(userInput1 < userInput2){
            System.out.println("The second number you entered is bigger");
        }else{
            System.out.println("The two numbers are equal");
        }

    }
}
