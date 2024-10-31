package org.example;

import org.example.classes.Fila;
import org.example.classes.ListaEncadeada;
import org.example.classes.Pilha;

public class Main {
    public static void main(String[] args) {
        //PILHA
        System.out.println("PILHA");
        Pilha novaPilha = new Pilha();

        novaPilha.push(66);
        novaPilha.push(77);
        novaPilha.push(88);
        novaPilha.push(99);

        System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
        System.out.println("Item no topo: " + novaPilha.top() + "\n");
        System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
        System.out.println("Item no topo: " + novaPilha.top() + "\n");

        System.out.println("Pilha vazia: " + novaPilha.isEmpty());
        System.out.println("Size: " + novaPilha.size() + "\n");

        //FILA (FIFO)
        System.out.println("==============================================================");
        System.out.println("FILA (FIFO)");
        Fila f = new Fila();

        System.out.println("Vazio? " + f.isEmpty() + "\n");

        f.enqueue(1);
        f.enqueue(5);
        f.enqueue(10);

        System.out.println("Size " + f.size());
        System.out.println("Front: " + f.front());
        System.out.println("Rear: " + f.rear() + "\n");

        System.out.println("Remover: " + f.dequeue() + "\n");

        System.out.println("Size " + f.size());
        System.out.println("Front: " + f.front());
        System.out.println("Rear: " + f.rear() + "\n");

        System.out.println("Vazio? " + f.isEmpty() + "\n");

        //LISTA ENCADEADA
        System.out.println("==============================================================");
        System.out.println("LISTA ENCADEADA SIMPLES ");
        ListaEncadeada listaEncad = new ListaEncadeada();

        listaEncad.push(1);
        listaEncad.push(2);
        listaEncad.push(3);
        listaEncad.push(4);
        listaEncad.pushHead(5);
        System.out.println("Lista encadeada: " + listaEncad.exibeLista());

        listaEncad.insert(1, 22);
        System.out.println("Lista encadeada: " + listaEncad.exibeLista());

        System.out.println("Elemento buscado por indice: " + listaEncad.elementAt(3));

        System.out.println("Tamanho da lista: " + listaEncad.size());

        System.out.println("Nó removido: " + listaEncad.pop());
        System.out.println("Lista encadeada: " + listaEncad.exibeLista());

        listaEncad.removeHead();
        System.out.println("Removendo 1º nó da lista...");
        System.out.println("Lista encadeada: " + listaEncad.exibeLista());

        listaEncad.remove(1);
        System.out.println("Removendo nó indexado da lista...");
        System.out.println("Lista encadeada: " + listaEncad.exibeLista());

        System.out.println("Tamanho da lista: " + listaEncad.size());
    }
}