package br.com.alura.screenmatch.desafios;

// 10 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.

import br.com.alura.screenmatch.model.Episodio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numerosMultiplicados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        numerosMultiplicados.forEach(System.out::println);
    }
}
