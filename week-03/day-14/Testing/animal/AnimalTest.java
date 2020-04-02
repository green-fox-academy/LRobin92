package animal;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void eat() {
        animal.eat();
        assertEquals(49,animal.hunger);
    }

    @Test
    public void drink() {
        animal.drink();
        assertEquals(49,animal.thirst);
    }

    @Test
    public void play() {
        animal.play();
        assertEquals(51,animal.hunger);
        assertEquals(51,animal.thirst);
    }
}