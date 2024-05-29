package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public class Documento {
    private String nombre;
    private String tipo; // Legal, Financiero, Operativo, etc.
    private String contenido;

    public Documento(String nombre, String tipo, String contenido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}

