package br.com.alura.screenmatch.desafios;

// 18 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.
// No código a seguir, há um exemplo prático do resultado esperado.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio18 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String nomesEsperados = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(nomesEsperados);

        // Resultado Esperado: "Alice, Bob, Charlie"
    }
}
