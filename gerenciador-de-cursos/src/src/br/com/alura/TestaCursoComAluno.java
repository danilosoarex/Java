package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando dom ArrayList",21));
        javaColecoes.adiciona(new Aula("Trabalhando dom ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        Aluno a1 = new Aluno("Danilo Soares", 2262206);
        Aluno a2 = new Aluno("Albert Einstein", 556506);
        Aluno a3 = new Aluno("Machado de Assis", 1910);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        //javaColecoes.getAlunos().forEach(a -> {
        //    System.out.println(a);
        //});
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        System.out.println("O aluno " + a3  + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno machado = new Aluno("Machado de Assis", 1910);
        System.out.println("E esse Machado de Assis, está matriculado");
        System.out.println(javaColecoes.estaMatriculado(machado));

        //System.out.println("o a3 é == machado?");
        //System.out.println(a3 == machado);

        System.out.println("o a3 é equals machado?");
        System.out.println(a3.equals(machado));

    }
}
