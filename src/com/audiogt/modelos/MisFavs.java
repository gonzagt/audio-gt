package com.audiogt.modelos;

public class MisFavs {
    public void adicione(Audio audio){
        if (audio.getClasificacion()==8) {
            System.out.println(audio.getTitulo()+" es muy popular!");
        } else {
            System.out.println(audio.getTitulo()+" es nuevo.");
        }
    }
}
