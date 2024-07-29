package test;

import main.controllers.Ejercicios;

import java.util.HashMap;

public class EjerciciosTest {

    public static void testContarFrecuenciaDePalabras() {
        Ejercicios ejercicios = new Ejercicios();
        String texto = "Esta es una prueba. Esta prueba es solo una prueba.";
        HashMap<String, Integer> frecuenciaActual = ejercicios.contarFrecuenciaDePalabras(texto);

        System.out.println("Frecuencia de palabras:");
        for (String palabra : frecuenciaActual.keySet()) {
            System.out.println(palabra + ": " + frecuenciaActual.get(palabra));
        }
    }

    public static void testVerificarCaracteresUnicos_True() {
        Ejercicios ejercicios = new Ejercicios();
        String input = "abcdefg";
        boolean result = ejercicios.verificarCaracteresUnicos(input);

        if (result) {
            System.out.println("testVerificarCaracteresUnicos_True PASSED");
        } else {
            System.out.println("testVerificarCaracteresUnicos_True FAILED");
        }
    }

    public static void testVerificarCaracteresUnicos_False() {
        Ejercicios ejercicios = new Ejercicios();
        String input = "hello";
        boolean result = ejercicios.verificarCaracteresUnicos(input);

        if (!result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    
}

