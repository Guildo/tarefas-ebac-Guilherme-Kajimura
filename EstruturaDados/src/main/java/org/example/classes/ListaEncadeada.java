package org.example.classes;

import org.example.Exception.UserDefinedError;

public class ListaEncadeada {

    private static class Node {
        public Node next; // Próximo nó na lista
        public int element; // Rlemento (valor) armazenado na lista

        public Node(int val) { // Construtor do nó da lista
            element = val; next = null;
        }
    }

    private Node head; // Representa a cabeça (head) da lista
    private int size; // Representa o tamanho da lista

    public ListaEncadeada() {   // Construtor da lista
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int elementAt(int index) {
        if (index < 0 || index >= size || head == null) { // Verifica indice válido
            throw new UserDefinedError("Indice inválido!");
        }

        Node local = head;
        for (int i = 0; i < index; i++) { // Percorre lista até o indice correto
            local = local.next;
        }

        return local.element;
    }

    public void pushHead(int node) { // Insere no início da lista
        Node newNode = new Node(node);
        newNode.next = head; // newNode -> inicio antigo
        head = newNode;      // head -> novoNo
        size++;
    }

    public void push(int node) {
        Node newNode = new Node(node);

        if (head == null) { // Verifica se é a lista está vazia
            newNode.next = null;
            head = newNode; // Adiciona o 1º no da lista
        } else {
            Node local = head;
            while (local.next != null) { // Percorre até o último nó da lista
                local = local.next;
            }
            local.next = newNode; // Adiciona nó ao fim da lista
            newNode.next = null;
        }
        size++;
    }

    public Integer pop() {
        if (head == null) { // Verifica se a lista está vazia
            return null;
        }

        Node local = head;

        // Caso a lista tenha mais de 1 elemento
        while (local.next != null) { // Percorre lista até o último nó
            Node aux = local;
            local = local.next;

            if (local.next == null) { // Remove último nó da lista
                aux.next = null;
                size--;
                return local.element; // Retorna elemento removido
            }
        }

        // Caso a lista tenho somente 1 elemento
        head = null; // Remove o único nó na lista
        size--;
        return local.element; // Retorna elemento removido
    }

    public void removeHead(){ //elimina o primiro item da lista
        head = head.next; // elimina o elemento e reposiciona o início
        size--;
    }

    public void insert(int index, int node) {
        if (index <= 0) {
            pushHead(node);
        } else if (index >= size) {
            push(node);
        } else {
            Node local = head;
            for (int i = 0; i < index - 1; i++) {
                local = local.next;
            }

            Node newNode = new Node(node);
            newNode.next = local.next;
            local.next = newNode;
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size || head == null) {
            throw new UserDefinedError("Indice inválido!");
        }

        if (index == 0) {
            removeHead();
        } else if (index == size - 1) {
            pop();
        }

        Node local = head;
        for (int i = 0; i < index - 1; i++) {
            local = local.next;
        }

        local.next = local.next.next;
        size--;
    }

    public String exibeLista() {
        if (isEmpty()) {
            return "Lista vazia\n"; //teste de lista vazia
        }

        StringBuilder str = new StringBuilder("Lista Encadeada: ");

        for (Node nodo = head; nodo != null; nodo = nodo.next) {
            str.append(" ").append(nodo.element);
        }
        return str + "\n";
    }

    public int size() {
        return size;
    }
}
