import java.util.ArrayList;
import java.util.Iterator;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //Create an empty list which will contain names (strings)
        ArrayList<String> nameList = new ArrayList<String>();
        //Print out the number of elements in the list
        int element = nameList.size();
        System.out.println(element);
        //Add William to the list
        nameList.add("William");
        //Print out whether the list is empty or not
        boolean empty = nameList.isEmpty();
        System.out.println(empty);
        //Add John to the list
        //Add Amanda to the list
        nameList.add("John");
        nameList.add("Amanda");
       System.out.println(nameList);
       //Print out the number of elements in the list
       element = nameList.size();
       System.out.println(element);
       //Print out the 3rd element
       System.out.println(nameList.get(2));
       //Iterate through the list and print out each name
        Iterator iterator = nameList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Iterate through the list and print
        int a = 1;
        for (String listing : nameList) {
            System.out.println( a + " " + listing);
            a++;
        }
        //Remove the 2nd element
        nameList.remove(1);
        System.out.println(nameList);
        //Iterate through the list in a reversed order and print out each name(a reverse methodot hívom segítségül, lentebb)
        System.out.println(reverse(nameList));
        //Remove all elements
        nameList.clear();
        System.out.println(nameList);
    }
    public static ArrayList<String> reverse(ArrayList<String> textToReverse){
        ArrayList<String>  reverse = new ArrayList<>();
        for(int i = textToReverse.size() -1; i >= 0; i--)
        {
            reverse.add(textToReverse.get(i));
        }
        return reverse;
    }

}
