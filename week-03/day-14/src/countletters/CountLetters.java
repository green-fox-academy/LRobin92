package countletters;

import java.util.HashMap;

public class CountLetters {
  //Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
  // and numbers as values that shows how many occurrences there are.
  //Create a test for that.
  public HashMap<Character, Integer> countingFunction(String word) {
    HashMap<Character, Integer> lettersInWord = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      if (lettersInWord.containsKey(word.charAt(i))) {
        int valueCounter = lettersInWord.get(word.charAt(i));
        lettersInWord.put(word.charAt(i), ++valueCounter);
      } else {
        lettersInWord.put(word.charAt(i), 1);

      }
    }
    return lettersInWord;
  }
}
