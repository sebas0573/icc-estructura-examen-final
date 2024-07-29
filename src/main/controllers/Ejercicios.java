package main.controllers;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicios {
    public HashMap<String, Integer> contarFrecuenciaDePalabras(String text) {
        HashMap<String, Integer> frecuencia = new HashMap<>();
        String[] palabras = text.split("\\s+");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        return frecuencia;
    }

    public boolean verificarCaracteresUnicos(String input) {
        HashSet<Character> caracteres = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (caracteres.contains(c)) {
                return false;
            }
            caracteres.add(c);
        }

        return true;
    }
}

