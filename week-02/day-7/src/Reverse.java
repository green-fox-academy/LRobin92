import java.awt.image.TileObserver;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(toBeReversed));

    }
    public static String reverse(String reverseMethod){
        String reverse = new String();
        for(int i = reverseMethod.length() - 1; i >= 0; i--)
        {
            reverse = reverse + reverseMethod.charAt(i);
        }
        return reverse;
    }
}
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
