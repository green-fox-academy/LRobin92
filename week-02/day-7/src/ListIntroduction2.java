import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> ListA = new ArrayList<String>(Arrays.asList("Apple","Avocado","Blueberries", "Durian", "Lychee")) ;
        //Create a new list ('List B') with the values of List A
        ArrayList<String> ListB = new ArrayList<>(ListA); //itt az ListA elemjeit hívom a ListB stringbe, így ugyan azt fogja tartalmazni itt még
        //de utána már külön listként működik ezért nem jó pl ha úgy írjuk le, hogy ArrayList<String> ListB = ListA;
        //Remove Durian from List B
        ListB.remove("Durian");
        //Add Kiwifruit to List A after the 4th element
        ListA.add(4, "Kiwi");
        //Compare the size of List A and List B
        if (ListA.size() > ListB.size()){
            System.out.println("ListA is bigger");
        }else
            System.out.println("ListB is bigger");
        //Get the index of Avocado from List A
        System.out.println(ListA.indexOf("Avocado"));
        //Get the index of Durian from List B
        System.out.println(ListB.indexOf("Durian"));
    }
}
