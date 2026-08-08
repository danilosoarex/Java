package br.com.alura.screenmatch.desafios;

//15 - Tomando o mesmo código do desafio anterior como base,
//     modifique o código para que a saída mostre apenas os três produtos mais baratos da categoria "Eletrônicos"

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class desafio15 {
    static void main() {

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
            .sorted(Comparator.comparing(desafioProduto::getPreco))
            .limit(3)
            .collect(Collectors.toList());

        produtosOrdenados.forEach(System.out::println);
    }
}
