package main.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import main.models.Estudiante;
import java.util.List;

public class EstudianteController {

    public HashMap procesarEstudiantes(Estudiante[] estudiantes){
        HashMap<String, List<Estudiante>> estudiante = new HashMap<>();
        for(Estudiante categorias : estudiantes){
            String cate = obtenerCategoria(estudiante.getCalificacion());
            if(cate.contains(cate)){
                cate.put(new ArrayList<>());

            }
            return estudiante;
        }
    }
    private String obtenerCategoria(int calificacion){
        if(calificacion<70){
            return "C";
        }else if(calificacion<80){
            return "B";
        }else{
            return "A";
        }
    }
    
}
