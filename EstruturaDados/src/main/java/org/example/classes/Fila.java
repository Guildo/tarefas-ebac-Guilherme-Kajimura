package org.example.classes;

public class Fila {
    private int lista[];
    private int inicio;
    private int fim;
    private int size;

    public Fila() {
        this.lista = new int[10];
        this.inicio = 0;
        this.fim = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int n) {
        lista[fim] = n;
        fim++;
        ++size;
    }

    public int dequeue() {
        int valorAtual = lista[inicio];
        inicio++;
        size--;

        return valorAtual;
    }

    public int front() {
        return lista[inicio];
    }

    public int rear() {
        return lista[fim - 1];
    }

    public int size() {
        return size;
    }

}
