package br.com.alura.screenmatch.desafios;

// 3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

import java.util.function.Function;

public class desafio3 {
    static void main() {
        Function<String, String> converteM = texto -> texto.toUpperCase();
        System.out.println(converteM.apply("danilo"));
    }
}
