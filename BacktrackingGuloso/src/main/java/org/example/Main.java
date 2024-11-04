package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;

        List<List<Integer>> result = new ArrayList<>();
        subconjuntos(S, n, 0, new ArrayList<>(), result);
        imprimeSubconjuntos(result);

        int[] coins = {5,2,1};
        System.out.println(troco(18, coins));
    }

    public static void subconjuntos(int[] elements, int size, int index, List<Integer> current, List<List<Integer>> result) {
        // Se o tamanho do subconjunto atual for igual a n, adicione-o ao resultado
        if (current.size() == size) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Se o índice atingir o tamanho do conjunto de elementos, retorne
        if (index >= elements.length) {
            return;
        }

        // Incluir o elemento atual no subconjunto
        current.add(elements[index]);
        subconjuntos(elements, size, index + 1, current, result);

        // Não incluir o elemento atual no subconjunto
        current.remove(current.size() - 1);
        subconjuntos(elements, size, index + 1, current, result);
    }

    public static void imprimeSubconjuntos(List<List<Integer>> result) {
        // Imprimir os subconjuntos encontrados
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    public static int troco(int change, int[] coins) {
        int current = 0; // Para guardar o atual valor total das moedas usadas
        int count = 0; // Para guardar a quantidade de moedas usadas
        Arrays.sort(coins);

        for (int i = coins.length - 1; i > -1; i--) { // Loop para adicionar moedas no troco
            while ((current + coins[i]) <= change) { // Verifica se o valor atual é válido para ser adicionado ao troco
                current += coins[i]; // Adiciona o valor da moeda atual ao valor total do troco
                count++; // Adiciona mais uma unidade de moeda ao total do troco
            }
        }

        return count;
    }
}