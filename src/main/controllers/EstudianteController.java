package main.controllers;

import main.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EstudianteController {
    public HashMap<String, List<Estudiante>> procesarEstudiantes(Estudiante[] estudiantes) {
        HashMap<String, List<Estudiante>> resultado = new HashMap<>();

        for (Estudiante estudiante : estudiantes) {
            String categoria = obtenerCategoria(estudiante.getCalificacion());

            resultado.computeIfAbsent(categoria, k -> new ArrayList<>()).add(estudiante);
        }

        return resultado;
    }

    public String obtenerCategoria(int calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


