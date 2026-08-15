package br.com.alura.screenmatch.desafios;

// 4 - Implemente um método que verifica se uma frase é um palíndromo. 
// Um palíndromo é uma palavra/frase que, quando lida de trás pra frente, é igual à leitura normal

public class desafio4 {

    public static void main(String[] args) {
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false
    }

    public static boolean ehPalindromo(String palavra) {
        // Remove espaços e converte para minúsculas
        String normalized = palavra.replaceAll("\\s", "").toLowerCase();
        
        // Verifica se a string é igual à sua versão invertida
        String reversed = new StringBuilder(normalized).reverse().toString();
        
        return normalized.equals(reversed);
    }
    
}
