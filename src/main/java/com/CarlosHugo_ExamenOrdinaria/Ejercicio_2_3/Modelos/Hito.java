package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

import java.time.LocalDate;

public class Hito {
    private String descripcion;
    private LocalDate fecha;
    private boolean completado;

    public Hito(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.completado = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return descripcion + " (Fecha: " + fecha + ", Completado: " + completado + ")";
    }
}
