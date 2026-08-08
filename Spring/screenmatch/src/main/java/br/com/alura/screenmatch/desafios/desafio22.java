package br.com.alura.screenmatch.desafios;

// 22 - Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class desafio22 {
    public static void main(String[] args) {
        List<desafioProduto> produtos = Arrays.asList(
                new desafioProduto("Smartphone", 800.0, "Eletrônicos"),
                new desafioProduto("Notebook", 1500.0, "Eletrônicos"),
                new desafioProduto("Teclado", 200.0, "Eletrônicos"),
                new desafioProduto("Cadeira", 300.0, "Móveis"),
                new desafioProduto("Monitor", 900.0, "Eletrônicos"),
                new desafioProduto("Mesa", 700.0, "Móveis")
        );

        Map<String, Long> produtosQuantidade = produtos.stream()
                .collect(Collectors.groupingBy(
                        desafioProduto::getCategoria,
                        Collectors.counting()));

        System.out.println(produtosQuantidade);

    }
}
