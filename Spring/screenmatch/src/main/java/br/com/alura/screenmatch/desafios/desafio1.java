package br.com.alura.screenmatch.desafios;

// 1 - Crie uma expressão lambda que multiplique dois números inteiros.
// A expressão deve ser implementada dentro de uma interface funcional com o método multiplicacao(int a, int b).

public class desafio1 {

    @FunctionalInterface
    public interface Operacao {
        int executar(int a, int b);  // Um método abstrato
    }

    static void main() {
        Operacao multiplicar = (a, b) -> a * b;
        System.out.println(multiplicar.executar(5,3));
    }
}
