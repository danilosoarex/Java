package br.com.alura.screenmatch.desafios;

public class desafio13Pessoa {
    String nome;
    int idade;

    desafio13Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
