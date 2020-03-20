package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciFunction() {
        Fibonacci fibonacci = new Fibonacci();
        int [] index = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int result = fibonacci.fibonacciFunction(6);
        assertEquals(index[6],result);
    }
    @Test
    void fibonacciFunctionContainsThatNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacciFunction(10);
        assertEquals(55,result);

    }
    @Test
    void fibonacciMinusIndex() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacciFunction(-2);
        assertEquals(-1,result);

    }

}