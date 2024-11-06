package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        long result = Fibonacci.encontrarElementoPD(7);

        assertEquals(13, result);
    }
}
