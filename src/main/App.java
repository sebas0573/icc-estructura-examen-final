package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.controllers.Ejercicios;
import main.controllers.EstudianteController;
import main.models.Estudiante;


public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicios = new Ejercicios();


        String texto = "Esta prueba es solo una prueba";
        HashMap<String, Integer> frecuencia = ejercicios.contarFrecuenciaDePalabras(texto);
        System.out.println("Frecuencia de palabras: " + frecuencia);

        
        String input = "abcdefg";
        boolean sonUnicos = ejercicios.verificarCaracteresUnicos(input);
        System.out.println("¿El string tiene caracteres únicos?: " + sonUnicos);

        
        Estudiante[] estudiantes = {
            new Estudiante("Juan", 85),
            new Estudiante("Ana", 88),
            new Estudiante("Luis", 75),
            new Estudiante("María", 92),
            new Estudiante("Pedro", 78)
        };

        
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return Integer.compare(e1.getCalificacion(), e2.getCalificacion());
            }
        });

        System.out.println("Estudiantes ordenados por calificación:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        
        EstudianteController estudianteController = new EstudianteController();
        HashMap<String, List<Estudiante>> resultadoEstudiantes = estudianteController.procesarEstudiantes(estudiantes);

        
        System.out.println("\nAgrupación por categorías:");
        for (Map.Entry<String, List<Estudiante>> entry : resultadoEstudiantes.entrySet()) {
            System.out.print(entry.getKey() + ": [");
            List<Estudiante> lista = entry.getValue();
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i).getNombre());
                if (i < lista.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
