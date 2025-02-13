package com.taller;

public class MainP8 {
    public static void main(String[] args) {
        String s = "Hola Mundo"; // Ejemplo de cadena
        int start = 4;  // Índice inicial
        int end = 8;    // Índice final (exclusive)

        // Usando el método substring para obtener la subcadena
        String subcadena = s.substring(start, end);

        // Imprimiendo la subcadena resultante
        System.out.println(subcadena);
    }
    
}
