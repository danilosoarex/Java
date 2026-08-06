package br.com.alura.screenmatch.desafios;

// 9 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class desafio9 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream().map(p -> p.toUpperCase()).forEach(System.out::println);
    }
}
