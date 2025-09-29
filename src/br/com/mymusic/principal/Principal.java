package br.com.mymusic.principal;

import br.com.mymusic.model.Musica;
import br.com.mymusic.model.Podcast;

public class Principal {


    public static void main(String[] args) {

            Musica myMusic = new Musica();
            myMusic.setAlbum("Michael jackson ");
            myMusic.setTitulo("Billie Jean");
            myMusic.setArtista("Michael Jackson");
            myMusic.setAlbum("Thriller");
            myMusic.setAnoLancamento(1982);
            myMusic.setGenero("Pop");
            myMusic.setDuracao(4.54);


            for (int i = 0; i < 1000; i++) {
                myMusic.reproduzir();
            }

            for (int i = 0; i < 50; i++) {
                myMusic.curtir();
            }


            Podcast myPodcast = new Podcast();
            myPodcast.setTitulo("Flow Podcast");
            myPodcast.setApresentador("Igor 3K");
            myPodcast.setConvidados("Monark");
            myPodcast.setDuracao(145); // em minutos
            myPodcast.setClassificacao(16);


        for (int i = 0; i < 2000; i++) {
            myPodcast.reproduzir();

        }
        for (int i = 0; i < 1000; i++) {
            myPodcast.curtir();

        }

    }

    }



