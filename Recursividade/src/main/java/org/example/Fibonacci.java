package org.example;

import java.util.Arrays;

public class Fibonacci {

    private static final int MAX_ELEMENTOS = 100;

    private static final long[] elementosFib = new long[MAX_ELEMENTOS];

    public static long encontrarElementoPD(int n) {
        Arrays.fill(elementosFib, -1);

        return encontrarElemento(n);
    }

    public static long encontrarElemento(int n) {
        if (elementosFib[n] == -1) {
            if (n <= 1) {
                elementosFib[n] = n;
            } else {
                elementosFib[n] = encontrarElemento(n - 1) + encontrarElemento(n - 2);
            }
        }

        return elementosFib[n];
    }
}
