package br.com.alura.screenmatch.desafios;

// 23 - Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o resultado em um Map<String, Optional<Produto>>.

import org.springframework.expression.spel.ast.OpOr;

import java.util.*;
import java.util.stream.Collectors;

public class desafio23 {
    public static void main(String[] args) {
        List<desafioProduto> produtos = Arrays.asList(
                new desafioProduto("Smartphone", 800.0, "Eletrônicos"),
                new desafioProduto("Notebook", 1500.0, "Eletrônicos"),
                new desafioProduto("Teclado", 200.0, "Eletrônicos"),
                new desafioProduto("Cadeira", 300.0, "Móveis"),
                new desafioProduto("Monitor", 900.0, "Eletrônicos"),
                new desafioProduto("Mesa", 700.0, "Móveis")
        );

        Map<String, Optional<desafioProduto>> produtosAgrupados = produtos.stream()
                .collect(Collectors.groupingBy(desafioProduto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(desafioProduto::getPreco))));

        System.out.println(produtosAgrupados);

    }
}
