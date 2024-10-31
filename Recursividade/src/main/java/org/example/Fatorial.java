package org.example;

import java.util.Arrays;

public class Fatorial {

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static long fatorialPDTopDown (int n) {
        long[] elementosFat = new long[n + 1];
        Arrays.fill(elementosFat, -1);

        if (elementosFat[n] == -1) {
            if (n <= 1) {
                elementosFat[n] = n;
            } else {
                elementosFat[n] = n * fatorialPDTopDown(n - 1);
            }
        }

        return elementosFat[n];
    }

    public static long fatorialPDBottomUp (int n) {
        long[] fatorial = new long[n + 1];

        fatorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            fatorial[i] = fatorial[i - 1] * i;
        }

        return fatorial[n];
    }
}
