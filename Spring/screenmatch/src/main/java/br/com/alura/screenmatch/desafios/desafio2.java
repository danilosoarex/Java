package br.com.alura.screenmatch.desafios;

// 2 - Implemente uma expressão lambda que verifique se um número é primo.

import java.util.function.Predicate;

public class desafio2 {

    static void main() {
        Predicate<Integer> ehPrimo = numero -> {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(ehPrimo.test(17));
    }
}
