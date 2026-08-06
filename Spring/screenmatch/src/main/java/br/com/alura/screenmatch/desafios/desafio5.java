package br.com.alura.screenmatch.desafios;

//5 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista onde cada número foi multiplicado por 3.
// Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

import java.util.ArrayList;
import java.util.List;

public class desafio5 {

    @FunctionalInterface
    interface Multiplicador {
        List<Integer> multiplicar(List<Integer> numeros);
    }

    public static void main(String[] args) {

        Multiplicador multiplicador = lista -> {
            List<Integer> novaLista = new ArrayList<>(lista);
            novaLista.replaceAll(numero -> numero * 3);
            return novaLista;
        };

        System.out.println(multiplicador.multiplicar(List.of(1, 2, 3)));
        System.out.println(multiplicador.multiplicar(List.of(5, 10, 20)));
        System.out.println(multiplicador.multiplicar(List.of(7, 8, 9, 100)));
    }
}