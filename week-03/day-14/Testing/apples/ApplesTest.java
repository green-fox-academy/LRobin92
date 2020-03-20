package apples;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @org.junit.jupiter.api.Test
    void getApple() {
        Apples apples = new Apples();
        assertEquals("apple", apples.getApple());
    }
}