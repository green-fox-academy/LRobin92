import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        int spaceCount = numberOfLines/2 -1;
        int stars = 1;
        if(numberOfLines % 2 !=0){
            spaceCount= numberOfLines/2;
        }
        for (int i = 0; i < numberOfLines / 2; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print("1");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            spaceCount--;
        }

        if (numberOfLines%2!=0){
            for (int m = 0; m < numberOfLines ; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        spaceCount++;
        stars-=2;

        for (int i = 0; i < (numberOfLines/2); i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println("");
            stars -= 2;
            spaceCount++;
        }

    }
}
