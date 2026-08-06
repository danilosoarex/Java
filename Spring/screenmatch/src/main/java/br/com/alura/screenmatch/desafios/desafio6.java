package br.com.alura.screenmatch.desafios;

//6 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética.
// Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

import java.util.ArrayList;
import java.util.List;

public class desafio6 {

    @FunctionalInterface
    interface Ordenar {
        List<String> ordenar(List<String> palavras);
    }

    static void main() {

        Ordenar ordenar = lista -> {
            List<String> novaLista = new ArrayList<>(lista);
            novaLista.sort(null);
            return novaLista;
        };

    System.out.println(ordenar.ordenar(List.of("Danilo", "Castro", "Soares")));

    }
}
