package org.example.classes;

import java.util.Arrays;

public class Pilha {
    static final int MAX = 10;
    int top;
    int size = 0;
    int[] a = new int[MAX]; // Define tamanho máximo da pilha

    // Construtor
    public Pilha() {
        top = -1;
    }

    // Métodos da pilha
    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= (MAX-1)) {
            System.out.println("Estouro de Pilha!");
            return false;
        }
        else {
            a[++top] = x;
            ++size;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        }
        else {
            size--;
            return a[top--];
        }
    }

    public int top() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        }
        else {
            return a[top];
        }
    }

    public int size() {
        return size;
    }
}
