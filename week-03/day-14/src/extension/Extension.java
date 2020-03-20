package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Extension {
    int add(int a, int b) {
        return 5;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    int median(List<Integer> pool) {
       if (pool.size() % 2 == 0){
           return pool.get((pool.size()-1)/2);
       }else
           return pool.get((pool.size())/2);

    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = "";
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : hungarian.toCharArray()) {
            characters.add(c);
        }
        int length = characters.size();
        for (int i = 0; i < length; i++) {
            char c = characters.get(i);
            if (isVowel(c)) {
                characters.add(i , 'v');
                characters.add(i,c);
                //teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }

        }
        //lista minden egyes karakterét addoljuk a stringre
        for (char c : characters) {
            teve+=c;
        }
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong
//  (You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed