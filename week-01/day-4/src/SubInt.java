import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
       //int [] numbers = {1, 11, 34, 52, 61};
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static boolean subInt(int subInt) {
        int [] numbers = {1, 11, 34, 52, 61};
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] != userInput ){
                System.out.print("blabla");
            }else{
                System.out.println("It does not contain it");
                return false;
            }

        }
        return true;
    }


}
