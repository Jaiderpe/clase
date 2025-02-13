package com.taller;

import java.util.Scanner;

public class MainP4 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

