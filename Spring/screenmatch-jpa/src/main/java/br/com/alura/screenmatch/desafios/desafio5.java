package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 5 - Implemente um método que recebe uma lista de e-mails (String) 
// e retorna uma nova lista onde cada e-mail está convertido para letras minúsculas.

public class desafio5 {
    public static void main(String[] args) {
                List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
        // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]
    }

    public static List<String> converterEmails(List<String> emails) {
        List<String> saida = emails.stream()
        .map(e -> e.toLowerCase())
        .collect(Collectors.toList());

        return saida;
    }
}
    
