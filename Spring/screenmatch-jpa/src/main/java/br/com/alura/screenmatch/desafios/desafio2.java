package br.com.alura.screenmatch.desafios;

// 2 -  Implemente um métod_o que recebe um número inteiro dentro de um Optional.
// Se o número estiver presente e for positivo, calcule seu quadrado. Caso contrário, retorne Optional.empty.

import java.util.Optional;

public class desafio2 {
    public static void main(String[] args) {
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty
    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        if (numero.isPresent() && numero.get() >= 1) {
            return Optional.of(numero.get() * numero.get());
        } else {
            return Optional.empty();
        }
    }
}
