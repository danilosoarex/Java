package br.com.alura.screenmatch.desafios;

// 12 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio12 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primos = listaDeNumeros.stream()
                .flatMap(sublista -> sublista.stream())
                .filter(desafio12::ehPrimo)
                .collect(Collectors.toList());

        primos.forEach(System.out::println);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        // Testa se o número possui algum divisor além de 1 e dele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se achar um divisor, não é primo
            }
        }
        return true; // Se passar pelo loop sem divisores, é primo
    }

}
