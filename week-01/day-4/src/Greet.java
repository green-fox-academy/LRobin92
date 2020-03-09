import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greetFunction(al));
    }
    public static String greetFunction(String greet){
        greet = "Greetings dear "    + greet;
        return greet;
    }
    //  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`
}
