package com.taller;

import java.util.Scanner;

public class MainP3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar el mensaje con la información capturada
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        // Cerrar el Scanner
        scanner.close();
    }
}
