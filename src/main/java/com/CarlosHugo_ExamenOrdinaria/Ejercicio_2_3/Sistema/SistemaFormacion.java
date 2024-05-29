package com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Sistema;

import com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos.Asignatura;
import com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos.Curso;
import com.CarlosHugo_ExamenOrdinaria.Ejercicio_2_3.Modelos.Empleado;

import java.util.ArrayList;
import java.util.List;

public class SistemaFormacion {
    private List<Curso> cursos;
    private List<Empleado> empleados;

    private static SistemaFormacion instancia;

    private SistemaFormacion() {
        this.cursos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public static SistemaFormacion getInstancia() {
        if (instancia == null) {
            instancia = new SistemaFormacion();
        }
        return instancia;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void inscribirEmpleadoEnCurso(Empleado empleado, Curso curso) {
        System.out.println("Empleado " + empleado.getNombre() + " inscrito en el curso " + curso.getNombre());
    }

    public void registrarNota(Empleado empleado, Asignatura asignatura, double nota) {
        empleado.getRegistroAcademico().registrarNota(asignatura, nota);
    }

    public void emitirCertificado(Empleado empleado, Curso curso) {
        empleado.getRegistroAcademico().emitirCertificado(curso);
    }

    public void mostrarPromedioAcademico(Empleado empleado) {
        double promedio = empleado.getRegistroAcademico().calcularPromedio();
        System.out.println("El promedio académico de " + empleado.getNombre() + " es: " + promedio);
    }

    public static void main(String[] args) {
        // Creación de asignaturas
        Asignatura asignatura1 = new Asignatura("Matemáticas", 5);
        Asignatura asignatura2 = new Asignatura("Economía", 4);

        // Creación de cursos usando el patrón Builder
        Curso curso1 = new Curso.Builder("Curso de Finanzas")
                .agregarAsignatura(asignatura1)
                .agregarAsignatura(asignatura2)
                .build();

        // Creación de empleados
        Empleado empleado1 = new Empleado("Juan Perez");

        // Creación del sistema de formación
        SistemaFormacion sistemaFormacion = SistemaFormacion.getInstancia();
        sistemaFormacion.agregarCurso(curso1);
        sistemaFormacion.registrarEmpleado(empleado1);

        // Inscripción y registro de notas
        sistemaFormacion.inscribirEmpleadoEnCurso(empleado1, curso1);
        sistemaFormacion.registrarNota(empleado1, asignatura1, 8.5);
        sistemaFormacion.registrarNota(empleado1, asignatura2, 7.5);

        // Cálculo del promedio y emisión de certificado
        sistemaFormacion.mostrarPromedioAcademico(empleado1);
        sistemaFormacion.emitirCertificado(empleado1, curso1);
        System.out.println("Certificados emitidos: " + empleado1.getRegistroAcademico().getCertificados().size());
    }
}



