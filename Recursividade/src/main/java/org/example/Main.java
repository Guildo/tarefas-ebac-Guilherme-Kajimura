package org.example;

public class Main {
    public static void main(String[] args) {

        int n = 7;

        System.out.println("Fibonacci de " + n + ": " + Fibonacci.encontrarElementoPD(n));
        System.out.println("Fatorial de " + n + ": " + Fatorial.fatorial(n));
        System.out.println("Fatorial Programação Dinâmica Top Down de " + n + ": " + Fatorial.fatorialPDTopDown(n));
        System.out.println("Fatorial Programação Dinâmica Top Down de " + n + ": " + Fatorial.fatorialPDBottomUp(n));
    }
}