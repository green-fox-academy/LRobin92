package sharpie;

import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    @Test
    public void use() {
        Sharpie sharpie = new Sharpie("purple", 40);
        sharpie.inkAmount = 60;
        sharpie.use();
        assertEquals(59,sharpie.inkAmount, 0);
    }
}