package br.com.alura.screenmatch.desafios;

// 7 - Crie um enum Moeda com valores como DOLAR, EURO, REAL. 
// Cada moeda deve ter uma taxa de conversão para reais. Adicione um método que recebe um valor em reais e retorna o valor convertido para a moeda.

public class desafio7 {
    public static void main(String[] args) {
        System.out.println(desafio7Enum.DOLAR.converterPara(100));
        System.out.println(desafio7Enum.EURO.converterPara(100)); 
        System.out.println(desafio7Enum.REAL.converterPara(50));
    }
}
