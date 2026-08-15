package br.com.alura.screenmatch.desafios;

// 3 - Implemente um métod_o que recebe uma String representando um nome completo separado por espaços.
// O métod_o deve retornar o primeiro e o último nome após remover os espaços desnecessários.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio3 {
    public static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
       // Remove espaços desnecessários no início e no fim
        String nomeTrim = nomeCompleto.trim();
        
        // Separa o nome em partes usando espaços como delimitador e usa streams para obter o primeiro e o último nome
        List<String> partes = Arrays.stream(nomeTrim.split("\\s+"))
                                   .filter(part -> !part.isEmpty())
                                   .collect(Collectors.toList());
        
        // Obtém o primeiro e o último nome
        String primeiroNome = partes.get(0);
        String ultimoNome = partes.get(partes.size() - 1);
        
        // Se o primeiro e o último nome forem o mesmo, retorna apenas o primeiro nome
        if (primeiroNome.equals(ultimoNome)) {
            return primeiroNome;
        }
        
        // Retorna o primeiro e o último nome concatenados
        return primeiroNome + " " + ultimoNome;
    }
}
