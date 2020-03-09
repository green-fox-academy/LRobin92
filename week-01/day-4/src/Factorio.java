import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        System.out.println("Give me the number you want to get its factorial: ");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();

        System.out.println(factorio(givenNumber));
    }
    public static int factorio(int factorio){
        int number = 1;
        for (int i = 1; i <= factorio ; i++) {
            number *=i;
        }
        return number;
    }

    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
}
