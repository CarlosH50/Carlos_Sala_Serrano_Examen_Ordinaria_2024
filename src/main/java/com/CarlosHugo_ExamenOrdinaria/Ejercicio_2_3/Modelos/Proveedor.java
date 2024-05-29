package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public class Proveedor extends ActorInvolucrado {
    private String servicio;

    public Proveedor(String nombre, String servicio) {
        super(nombre, "Proveedor");
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    @Override
    public String toString() {
        return super.toString() + " - Servicio: " + servicio;
    }
}

