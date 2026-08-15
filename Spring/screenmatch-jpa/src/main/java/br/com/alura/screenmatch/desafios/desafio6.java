package br.com.alura.screenmatch.desafios;

// 6 - Crie um enum Mes que represente os meses do ano. 
// Adicione um método que retorna o número de dias de cada mês, considerando anos não bissextos.

public class desafio6 {
    public static void main(String[] args) {
        System.out.println("Fevereiro: ");
        System.out.println(desafio6Enum.FEVEREIRO.getNumeroDeDias()); // 28

        System.out.println("Meses de 30 dias");
        System.out.println(desafio6Enum.ABRIL.getNumeroDeDias());
        System.out.println(desafio6Enum.JUNHO.getNumeroDeDias());
        System.out.println(desafio6Enum.SETEMBRO.getNumeroDeDias());
        System.out.println(desafio6Enum.NOVEMBRO.getNumeroDeDias());

        System.out.println("Meses de 31 dias");
        System.out.println(desafio6Enum.JANEIRO.getNumeroDeDias());
        System.out.println(desafio6Enum.MARCO.getNumeroDeDias());
        System.out.println(desafio6Enum.MAIO.getNumeroDeDias());
        System.out.println(desafio6Enum.JULHO.getNumeroDeDias()); // 31
        System.out.println(desafio6Enum.AGOSTO.getNumeroDeDias());
        System.out.println(desafio6Enum.OUTUBRO.getNumeroDeDias());
        System.out.println(desafio6Enum.DEZEMBRO.getNumeroDeDias());
    }
    
}
