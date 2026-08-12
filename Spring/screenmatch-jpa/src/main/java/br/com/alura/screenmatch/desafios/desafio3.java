package br.com.alura.screenmatch.desafios;

// 3 - 3 - Implemente um métod_o que recebe uma String representando um nome completo separado por espaços.
// O métod_o deve retornar o primeiro e o último nome após remover os espaços desnecessários.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio3 {
    public static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        return("oi");
//        List<String> nome = Arrays.asList(nomeCompleto.strip().split(" "));
//        String primeroEUltimoNome = nome.stream()
//                .reduce()
    }
}
