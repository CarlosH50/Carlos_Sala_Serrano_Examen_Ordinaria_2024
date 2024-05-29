package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2.Modelos;

import java.util.HashMap;
import java.util.Map;

public class RegistroAcademico {
    private Map<Asignatura, Double> notas;
    private Map<Curso, Boolean> certificados;

    public RegistroAcademico() {
        this.notas = new HashMap<>();
        this.certificados = new HashMap<>();
    }

    public void registrarNota(Asignatura asignatura, double nota) {
        notas.put(asignatura, nota);
    }

    public void emitirCertificado(Curso curso) {
        certificados.put(curso, true);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double nota : notas.values()) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public Map<Asignatura, Double> getNotas() {
        return notas;
    }

    public Map<Curso, Boolean> getCertificados() {
        return certificados;
    }
}

