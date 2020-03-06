import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines =scanner.nextInt();
        int spaceCount = numberOfLines -1;
        int stars = 1;

        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars ; k++) {
                System.out.print("*");
            }
            System.out.println("");
            stars+=2;
            spaceCount--;
        }

}
    
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
}
