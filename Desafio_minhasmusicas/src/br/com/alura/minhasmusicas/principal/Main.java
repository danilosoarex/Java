package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Main {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("In The End");
        minhaMusica.setCantor("Linkin Park");

        for (int i = 0; i < 300; i++) {
            minhaMusica.reproduz();;
        }
        for (int i = 0; i < 155; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Jovem Nerd");
        meuPodcast.setApresentador("Azaghal");

        for (int i = 0; i < 275 ; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 115; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}