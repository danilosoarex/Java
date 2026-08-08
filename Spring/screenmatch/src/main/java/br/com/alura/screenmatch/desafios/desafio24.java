package br.com.alura.screenmatch.desafios;

// 24 - Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e armazene o resultado em um Map<String, Double>.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class desafio24 {
    public static void main(String[] args) {
        List<desafioProduto> produtos = Arrays.asList(
                new desafioProduto("Smartphone", 800.0, "Eletrônicos"),
                new desafioProduto("Notebook", 1500.0, "Eletrônicos"),
                new desafioProduto("Teclado", 200.0, "Eletrônicos"),
                new desafioProduto("Cadeira", 300.0, "Móveis"),
                new desafioProduto("Monitor", 900.0, "Eletrônicos"),
                new desafioProduto("Mesa", 700.0, "Móveis")
        );

        Map<String, Double> precoTotalCategoria = produtos.stream()
                .collect(Collectors.groupingBy(desafioProduto::getCategoria,
                        Collectors.summingDouble(desafioProduto::getPreco)));

        System.out.println(precoTotalCategoria);

    }
}
