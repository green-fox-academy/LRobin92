package streamexercises;

public class Exercise6 {
  //Write a Stream Expression to find the uppercase characters in a string!
  public static void main(String[] args) {
    String word = "EsZteR";
    word.chars()
        .filter(Character::isUpperCase)
        .forEach(c -> System.out.print(Character.toString(c)));
  }
}
