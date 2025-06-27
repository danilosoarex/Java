package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Memphis Depay");
        alunos.add("Yuri Alberto");
        alunos.add("Hugo Souza");

        System.out.println(alunos);

        alunos.add("Rodrigo Garro");
        alunos.add("Breno Bidon");
        alunos.add("Carrilo");
        alunos.add("Memphis Depay");

        System.out.println(alunos.size());


        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        boolean danEstaMatriculado = alunos.contains("Danilo Soares");
        System.out.println(danEstaMatriculado);

        alunos.remove("Carrilo");
        System.out.println(alunos);

    }
}
