package com.taller;

import java.util.Scanner;

public class MainP10 {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Entradas del usuario
            System.out.print("Ingrese el monto inicial de la inversión: ");
            double capitalInicial = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaAnual = scanner.nextDouble();

            System.out.print("Ingrese el número de años de inversión: ");
            int años = scanner.nextInt();

            System.out.println("Seleccione la frecuencia de capitalización:");
            System.out.println("1. Mensual\n2. Trimestral\n3. Semestral\n4. Anual");
            int opcion = scanner.nextInt();

            // Asignar frecuencia según la opción
            int[] frecuencias = {12, 4, 2, 1}; // Corresponden a las opciones 1, 2, 3, 4
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida.");
                return;
            }
            int frecuencia = frecuencias[opcion - 1];

            // Cálculo del interés compuesto
            double tasaDecimal = tasaAnual / 100;
            double montoFinal = capitalInicial * Math.pow(1 + tasaDecimal / frecuencia, frecuencia * años);

            // Salida
            System.out.printf("El monto final después de %d años es: %.2f%n", años, montoFinal);
        }
    }
}
