import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int squareNumber = scanner.nextInt();
        int theUglyThing = 1;
        for (int i = 1; i <= squareNumber; i++) {
            if (i == 1 || i == squareNumber){
                //System.out.println("%");
                for (int j = 0; j < squareNumber; j++) {
                    System.out.print("t");

                }

            }else if(i > 1 || i < squareNumber - 1){
                for (int m = 0; m < 1; m++) {
                    System.out.print("q");
                }
                System.out.println("e");
            }
            System.out.println("");
            //System.out.println("a");

            }
            }
        }

