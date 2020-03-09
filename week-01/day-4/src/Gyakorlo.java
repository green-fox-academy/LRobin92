import javax.print.MultiDocPrintService;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Gyakorlo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for the square:");
        int squares = scanner.nextInt();
        for (int i = 1; i <= squares; i++) {
            for (int j = 1; j <= squares; j++) {
                if (i == 1 || i == squares)
                    System.out.print("%");
                else if (j == 1 || j == squares)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
            for (int k = 0; k < squares ; k++) {
                //if ()
            }
        }
    }
    }
