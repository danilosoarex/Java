package br.com.alura.minhasmusicas.modelo;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public java.lang.String getApresentador() {
        return apresentador;
    }

    public void setApresentador(java.lang.String apresentador) {
        this.apresentador = apresentador;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    @java.lang.Override
    public double getClassficacao() {
        if(this.getTotalCurtidas() > 150){
            return 10;
        }else {
            return 8;
        }
    }
}
