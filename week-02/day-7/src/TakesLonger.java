public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder builder = new StringBuilder(quote);

        quote = builder.insert(builder.indexOf("you"), "always takes longer than ").toString();
        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        System.out.println(quote);
    }
}
