package br.com.alura.screenmatch.desafios;

// 4 - Crie uma expressão lambda que verifique se uma string é um palíndromo.
// A expressão deve ser implementada dentro de uma interface funcional com o método boolean verificarPalindromo(String str).
//  Dica: utilize o método reverse da classe StringBuilder.

import java.util.function.Function;

public class desafio4 {

    @FunctionalInterface
    public interface Palindromo {
        String verificaPalindromo (String str);
    }

    static void main() {
        Palindromo palindromo = texto -> {
            String palavraReversa = new StringBuilder(texto).reverse().toString();
            texto = texto.replaceAll(" ", "");
            palavraReversa = palavraReversa.replaceAll(" ", "");

            if (texto.equals(palavraReversa)) {
                return "É palíndromo";
            } else {
                return "Não é palíndromo";
            }
        };
        System.out.println(palindromo.verificaPalindromo("subi no onibus"));
    }
}
