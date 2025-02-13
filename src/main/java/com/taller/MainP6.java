package com.taller;

import java.util.Scanner;

public class MainP6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        // Inicializar la variable del contador
        int i = 1;

        // Usar un bucle while para imprimir la tabla de multiplicar
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++; // Incrementar el contador
        }

        // Cerrar el Scanner
        scanner.close();
    }
    
}
