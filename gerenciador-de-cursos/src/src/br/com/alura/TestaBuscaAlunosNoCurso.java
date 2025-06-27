package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando dom ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        Aluno a1 = new Aluno("Danilo Soares", 2262206);
        Aluno a2 = new Aluno("Albert Einstein", 556506);
        Aluno a3 = new Aluno("Machado de Assis", 1910);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com a matrícula 2262206?");
        Aluno aluno = javaColecoes.buscaMatriculado(2262206);
        System.out.println("Aluno: " + aluno);

    }
}
