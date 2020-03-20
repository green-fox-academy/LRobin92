package anagram;

import java.util.ArrayList;


public class Anagram {
    //Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
    //Create a test for that.

    public boolean anagramOrNot(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }
        char[] chars = word.toCharArray();
        for (char character : chars) {
            int index = anagram.indexOf(character);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index + 1, anagram.length());
            }else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

}
