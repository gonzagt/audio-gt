package com.audiogt.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalDeMegusta = 0;
    private int clasificacion;

    public void meGusta() {
        this.totalDeMegusta++;
    }

    public void reproducir() {
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
