import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        //Create a list with the following items.
        //500, 1000, 1250, 175, 800 and 120
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(500,1000, 1250, 175, 800, 120));
        //Create an application which solves the following problems.
        //How much did we spend?
        System.out.println("How much did we spend? ");
        System.out.println(sumAll(list));
        //Which was our greatest expense?
        Object object = Collections.max(list);
        System.out.println("Which was our greatest expense?");
        System.out.println(object);

        //Which was our cheapest spending?
        object = Collections.min(list);
        System.out.println("Which was our cheapest spending?");
        System.out.println(object);
        //What was the average amount of our spendings?


    }
    public static int sumAll(ArrayList<Integer> inputList) {
        int sum = 0;
        for (int i : inputList) {
            sum += i;
        }
        return sum;
    }

}
