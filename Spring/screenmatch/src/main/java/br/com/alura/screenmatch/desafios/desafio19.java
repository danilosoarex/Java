package br.com.alura.screenmatch.desafios;

// 19 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.summingInt(n -> n * n));

        System.out.println(resultado);
    }
}
