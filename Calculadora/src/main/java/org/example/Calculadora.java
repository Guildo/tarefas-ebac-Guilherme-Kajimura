package org.example;

/**
 *  Classe que simula funções básicas de uma calculadora
 */
public class Calculadora {

    /**
     * Função que calcula a soma dois números inteiros
     * @param a O primeiro número da adição
     * @param b O segundo número da adição
     * @return O resultado da soma
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Função que calcula a subtração entre dois números inteiros
     * @param a O primeiro número da subtração
     * @param b O segundo número da subtração
     * @return O resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Função que calcula a multiplicação entre dois números inteiros
     * @param a O primeiro número da multiplicação
     * @param b O segundo número da multiplicação
     * @return O resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Função que calcula a divisão entre dois números inteiros
     * @param a O primeiro número da divisão
     * @param b O segundo número da divisão
     * @return O resultado da divisão
     * @throws InvalidInputException Gera uma mensagem de erro caso o usuário tente múltiplicar um número por 0
     */
    public int dividir(int a, int b) throws InvalidInputException {
        if (b == 0) {
            throw new InvalidInputException("Não é possível dividir por 0");
        }
        return a / b;
    }
}
