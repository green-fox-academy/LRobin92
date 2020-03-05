import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello what's your name?!");
        String userInput1 = scanner.nextLine();
        System.out.println(userInput1);
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
    }
}
