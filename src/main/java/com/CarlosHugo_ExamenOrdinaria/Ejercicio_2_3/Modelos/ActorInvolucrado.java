package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public abstract class ActorInvolucrado {
    private String nombre;
    private String tipo; // Proveedor, Inversionista, etc.

    public ActorInvolucrado(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}

