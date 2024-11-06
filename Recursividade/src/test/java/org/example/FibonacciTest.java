package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        long result = Fibonacci.encontrarElementoPD(7);

        assertEquals(13, result);
    }

    @Test
    public void testFibonacciOfZero() {
        long result = Fibonacci.encontrarElementoPD(0);

        assertEquals(0, result);
    }

    @Test
    public void testFibonacciOfOne() {
        long result = Fibonacci.encontrarElementoPD(1);

        assertEquals(1, result);
    }
}
