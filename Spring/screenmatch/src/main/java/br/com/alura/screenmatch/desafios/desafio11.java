package br.com.alura.screenmatch.desafios;

// 11 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.

import java.util.Arrays;
import java.util.List;

public class desafio11 {public static void main(String[] args) {
    List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

    palavras.stream().distinct().forEach(System.out::println);
}

}
