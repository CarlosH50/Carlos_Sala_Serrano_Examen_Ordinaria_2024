package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;

public class Empleado {
    private String nombre;
    private RegistroAcademico registroAcademico;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.registroAcademico = new RegistroAcademico();
    }

    public String getNombre() {
        return nombre;
    }

    public RegistroAcademico getRegistroAcademico() {
        return registroAcademico;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

