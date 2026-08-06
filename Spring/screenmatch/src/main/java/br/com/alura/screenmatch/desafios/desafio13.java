package br.com.alura.screenmatch.desafios;

// 13 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class desafio13 {
    public static void main(String[] args) {
        List<desafio13Pessoa> pessoas = Arrays.asList(
                new desafio13Pessoa("Alice", 22),
                new desafio13Pessoa("Bob", 17),
                new desafio13Pessoa("Tom Brady", 45),
                new desafio13Pessoa("Danilo", 29),
                new desafio13Pessoa("Charlie", 19)
        );

        pessoas.stream()
                .filter(p -> p.idade >= 18)
                .sorted(Comparator.comparing(desafio13Pessoa::getNome))
                .forEach(System.out::println);

    }
}