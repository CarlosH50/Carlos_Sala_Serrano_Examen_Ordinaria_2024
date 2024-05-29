package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public class Asignatura {
    private String nombre;
    private int creditos;

    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return nombre + " (" + creditos + " créditos)";
    }
}

