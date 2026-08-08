package br.com.alura.screenmatch.desafios;

// 16 - dado a lista de números inteiros a seguir, encontre o maior dela

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        DoubleSummaryStatistics est = numeros.stream()
                .collect(Collectors.summarizingDouble(n -> n));

        System.out.println(est.getMax());
    }
}
