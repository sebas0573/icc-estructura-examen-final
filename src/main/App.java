package main;

import main.controllers.EstudianteController;
import test.EjerciciosTest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EjerciciosTest ej = new EjerciciosTest();
        EstudianteController est = new EstudianteController();
    }
}
