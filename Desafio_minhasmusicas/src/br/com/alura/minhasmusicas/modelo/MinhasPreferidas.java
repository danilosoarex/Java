package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassficacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        }else{
            System.out.println(audio.getTitulo() + " é uma opção mais ou menos");
        }
    }
}
