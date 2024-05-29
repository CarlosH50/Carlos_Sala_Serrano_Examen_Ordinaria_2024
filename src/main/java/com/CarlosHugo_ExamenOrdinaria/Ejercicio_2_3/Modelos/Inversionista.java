package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public class Inversionista extends ActorInvolucrado {
    private double montoInversion;

    public Inversionista(String nombre, double montoInversion) {
        super(nombre, "Inversionista");
        this.montoInversion = montoInversion;
    }

    public double getMontoInversion() {
        return montoInversion;
    }

    @Override
    public String toString() {
        return super.toString() + " - Monto de Inversión: $" + montoInversion;
    }
}
