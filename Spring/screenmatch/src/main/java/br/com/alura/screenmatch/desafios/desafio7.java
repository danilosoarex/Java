package br.com.alura.screenmatch.desafios;

// 7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo.
// A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

public class desafio7 {

    @FunctionalInterface
    public interface Operacao {
        int divisao(int a, int b);  // Um método abstrato
    }

    static void main() {
        Operacao dividir = (a, b) -> {

            try {
                return a / b;
            } catch (ArithmeticException e) {
                return Integer.parseInt(e.getMessage());
            }
        };

        System.out.println(dividir.divisao(7,0));
    }
}
