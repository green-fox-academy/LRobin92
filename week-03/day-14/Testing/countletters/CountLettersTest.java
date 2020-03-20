package countletters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void countingFunction() {
        CountLetters counting = new CountLetters();
        HashMap<Character , Integer> testLettersInWord = new HashMap<>();
        String word = "alma";
        testLettersInWord.put('a',2);
        testLettersInWord.put('l',1);
        testLettersInWord.put('m',1);
        HashMap<Character,Integer> lettersInWord = counting.countingFunction(word);

        assertEquals(testLettersInWord,lettersInWord);


    }
}