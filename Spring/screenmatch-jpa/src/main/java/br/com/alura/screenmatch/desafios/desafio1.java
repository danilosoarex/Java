package br.com.alura.screenmatch.desafios;

// 1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não.
// Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor.
// Por exemplo, na lista a seguir, a saída deve ser [10, 20]:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<String> saida = input.stream()
                .filter(t -> {
                    try {
                        Integer.parseInt(t);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(saida);;

    }
}
