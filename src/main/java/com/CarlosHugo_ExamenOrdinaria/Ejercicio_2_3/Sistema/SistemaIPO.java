package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Sistema;
import com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaIPO {
    private List<Documento> documentos;
    private List<Requisito> requisitos;
    private List<Hito> hitos;
    private List<ActorInvolucrado> actores;

    private static SistemaIPO instancia;

    private SistemaIPO() {
        this.documentos = new ArrayList<>();
        this.requisitos = new ArrayList<>();
        this.hitos = new ArrayList<>();
        this.actores = new ArrayList<>();
    }

    public static SistemaIPO getInstancia() {
        if (instancia == null) {
            instancia = new SistemaIPO();
        }
        return instancia;
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void agregarRequisito(Requisito requisito) {
        requisitos.add(requisito);
    }

    public void agregarHito(Hito hito) {
        hitos.add(hito);
    }

    public void agregarActor(ActorInvolucrado actor) {
        actores.add(actor);
    }

    public void completarHito(String descripcion) {
        for (Hito hito : hitos) {
            if (hito.getDescripcion().equals(descripcion)) {
                hito.setCompletado(true);
                break;
            }
        }
    }

    public void cumplirRequisito(String descripcion) {
        for (Requisito requisito : requisitos) {
            if (requisito.getDescripcion().equals(descripcion)) {
                requisito.setCumplido(true);
                break;
            }
        }
    }

    public void mostrarAvances() {
        System.out.println("Documentos:");
        for (Documento documento : documentos) {
            System.out.println(documento);
        }

        System.out.println("\nRequisitos:");
        for (Requisito requisito : requisitos) {
            System.out.println(requisito);
        }

        System.out.println("\nHitos:");
        for (Hito hito : hitos) {
            System.out.println(hito);
        }

        System.out.println("\nActores Involucrados:");
        for (ActorInvolucrado actor : actores) {
            System.out.println(actor);
        }
    }

    public static void main(String[] args) {
        // Creación del sistema de IPO
        SistemaIPO sistemaIPO = SistemaIPO.getInstancia();

        // Agregar documentos
        sistemaIPO.agregarDocumento(new Documento("Prospecto", "Legal", "Contenido del prospecto..."));
        sistemaIPO.agregarDocumento(new Documento("Informe Financiero", "Financiero", "Contenido del informe financiero..."));

        // Agregar requisitos
        sistemaIPO.agregarRequisito(new Requisito("Aprobación del consejo de administración"));
        sistemaIPO.agregarRequisito(new Requisito("Registro en la Comisión de Valores"));

        // Agregar hitos
        sistemaIPO.agregarHito(new Hito("Presentación del prospecto", LocalDate.of(2023, 7, 1)));
        sistemaIPO.agregarHito(new Hito("Aprobación de la Comisión de Valores", LocalDate.of(2023, 8, 15)));

        // Agregar actores
        sistemaIPO.agregarActor(new Proveedor("Empresa Auditora", "Auditoría Financiera"));
        sistemaIPO.agregarActor(new Inversionista("Juan Perez", 500000.0));

        // Completar hito y cumplir requisito
        sistemaIPO.completarHito("Presentación del prospecto");
        sistemaIPO.cumplirRequisito("Aprobación del consejo de administración");

        // Mostrar avances
        sistemaIPO.mostrarAvances();
    }
}

