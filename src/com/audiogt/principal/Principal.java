package com.audiogt.principal;

import com.audiogt.modelos.Cancion;
import com.audiogt.modelos.MisFavs;
import com.audiogt.modelos.Podcast;
import com.audiogt.modelos.Audio;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Stormwind");
        miCancion.setCantante("Bits & Hits");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Sirena de Comarca");
        miPodcast.setPresentador("Luz Sirena");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 4230; i++) {
            miCancion.reproducir();
        }

        for (int i = 0; i < 82; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 2634; i++) {
            miPodcast.reproducir();
        }

        System.out.println("La canción "+miCancion.getTitulo());
        System.out.println("Tiene un total de "+miCancion.getTotalDeMegusta()+" likes");
        System.out.println("y de "+miCancion.getTotalDeReproducciones()+" reproducciones");

        MisFavs favs = new MisFavs();
        favs.adicione(miCancion);
        favs.adicione(miPodcast);
    }
}
