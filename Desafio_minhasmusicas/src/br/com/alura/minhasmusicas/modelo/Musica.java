package br.com.alura.minhasmusicas.modelo;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public java.lang.String getAlbum() {
        return album;
    }

    public void setAlbum(java.lang.String album) {
        this.album = album;
    }

    public java.lang.String getCantor() {
        return cantor;
    }

    public void setCantor(java.lang.String cantor) {
        this.cantor = cantor;
    }

    public java.lang.String getGenero() {
        return genero;
    }

    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassficacao() {
        if(this.getTotalReproducoes() > 200){
            return 10;
        } else{
            return 7;
        }
    }
}
