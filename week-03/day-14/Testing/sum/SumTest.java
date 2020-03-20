package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sumList() {
        Sum sum = new Sum();
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,5,3));
        //sum.sum(listOfNumbers);
        assertEquals(9,sum.sum(listOfNumbers));
    }
    @Test
    void sumListIsEmpty() {
        Sum sum = new Sum();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        //sum.sum(listOfNumbers);
        assertEquals(0,sum.sum(listOfNumbers));
    }
    @Test
    void sumListOneElement() {
        Sum sum = new Sum();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        //sum.sum(listOfNumbers);
        assertEquals(2,sum.sum(listOfNumbers));
    }
    @Test
    void sumListMultipleElements() {
        Sum sum = new Sum();
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,5,3));
        assertEquals(9,sum.sum(listOfNumbers));
    }
    @Test
    void sumListIsNull() {
        Sum sum = new Sum();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(null);
        assertEquals(0,sum.sum(listOfNumbers));
    }
}