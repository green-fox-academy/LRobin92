package sum;

import java.util.ArrayList;

public class Sum {
    //Create a sum method in your class which has an ArrayList of Integers as parameter
    //It should return the sum of the elements in the list
    //Follow these steps:
    //Add a new test case
    //Instantiate your class
    //create a list of integers
    //use the assertEquals to test the result of the created sum method
    //Run them
    //Create different tests where you test your method with:
    //an empty list
    //a list that has one element in it
    //a list that has multiple elements in it
    //a null
    //Run them
    //Fix your code if needed
    public int sum(ArrayList<Integer> list){
        int sumAll = 0;
        if(list.contains(null)){
            return 0;
        }
        for(int i : list){
            sumAll += i;
        }

        return sumAll;
    }
}
