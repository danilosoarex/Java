package br.com.alura.screenmatch.desafios;

// 14 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String).
// Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000,
// ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class desafio14 {
    public static void main(String[] args) {
        List<desafioProduto> produtos = Arrays.asList(
                new desafioProduto("Smartphone", 800.0, "Eletrônicos"),
                new desafioProduto("Notebook", 1500.0, "Eletrônicos"),
                new desafioProduto("Teclado", 200.0, "Eletrônicos"),
                new desafioProduto("Cadeira", 300.0, "Móveis"),
                new desafioProduto("Monitor", 900.0, "Eletrônicos"),
                new desafioProduto("Mesa", 700.0, "Móveis")
        );

        List<desafioProduto> produtosOrdenados = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos"))
                .filter(p -> p.getPreco() <= 1000)
                .sorted(Comparator.comparing(desafioProduto::getPreco))
                .collect(Collectors.toList());

        produtosOrdenados.forEach(System.out::println);
    }
}
