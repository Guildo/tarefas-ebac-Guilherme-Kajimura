package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Adição: 10 + 25 = " + calculadora.adicionar(10, 25));
        System.out.println("Subtração: 20 - 5 = " + calculadora.subtrair(20, 5));
        System.out.println("Multiplicação: 10 * 9 = " + calculadora.multiplicar(10, 9));
        try {
            System.out.println("Divisão: 10 / 2 = " + calculadora.dividir(10, 5));
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}