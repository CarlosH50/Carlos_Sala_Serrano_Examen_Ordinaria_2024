package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Asignatura> asignaturas;

    private Curso(Builder builder) {
        this.nombre = builder.nombre;
        this.asignaturas = builder.asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        return nombre + " (" + asignaturas.size() + " asignaturas)";
    }

    public static class Builder {
        private String nombre;
        private List<Asignatura> asignaturas = new ArrayList<>();

        public Builder(String nombre) {
            this.nombre = nombre;
        }

        public Builder agregarAsignatura(Asignatura asignatura) {
            asignaturas.add(asignatura);
            return this;
        }

        public Curso build() {
            return new Curso(this);
        }
    }
}



