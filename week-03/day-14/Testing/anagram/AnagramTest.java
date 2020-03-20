package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void anagramOrNot() {
        String firstWord = "alma";
        String secondWord = "mala";
        Anagram anagram = new Anagram();
        
        boolean result = anagram.anagramOrNot(firstWord,secondWord);
        assertEquals(true, result);
    }
}