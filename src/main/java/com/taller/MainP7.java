package com.taller;

import java.util.Random;
import java.util.Scanner;

public class MainP7 {
     public static void main(String[] args) {
        // Crear un objeto Random para generar el número aleatorio
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int intento;
        int intentos = 0;

        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle para permitir al usuario seguir intentando hasta adivinar el número
        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }

        } while (intento != numeroAleatorio);

        // Cerrar el Scanner
        scanner.close();
    }
}
