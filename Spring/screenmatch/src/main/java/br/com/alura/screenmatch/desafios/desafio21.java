package br.com.alura.screenmatch.desafios;

// 21 - Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<desafioProduto>>.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class desafio21 {
    public static void main(String[] args) {
        List<desafioProduto> produtos = Arrays.asList(
                new desafioProduto("Smartphone", 800.0, "Eletrônicos"),
                new desafioProduto("Notebook", 1500.0, "Eletrônicos"),
                new desafioProduto("Teclado", 200.0, "Eletrônicos"),
                new desafioProduto("Cadeira", 300.0, "Móveis"),
                new desafioProduto("Monitor", 900.0, "Eletrônicos"),
                new desafioProduto("Mesa", 700.0, "Móveis")
        );

        Map<String, List<String>> produtosAgrupados = produtos.stream()
                .collect(Collectors.groupingBy(
                        desafioProduto::getCategoria,
                        Collectors.mapping(desafioProduto::getNome, Collectors.toList())
                ));

        System.out.println(produtosAgrupados);
    }

}
