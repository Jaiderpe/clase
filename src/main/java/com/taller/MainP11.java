package com.taller;

import java.util.Scanner;

public class MainP11 {
   public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Entradas del usuario
            System.out.print("Ingrese el saldo inicial de la cuenta: ");
            double saldo = scanner.nextDouble();

            System.out.print("Ingrese el depósito mensual fijo: ");
            double depositoMensual = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaAnual = scanner.nextDouble();

            System.out.print("Ingrese el número de meses de simulación: ");
            int meses = scanner.nextInt();

            // Cálculo de la tasa mensual
            double tasaMensual = tasaAnual / 100 / 12;

            System.out.println("--Mes--|-SaldoInicial-|--Depósito--|--Interés--|-SaldoFinal-");
           
           

            // Simulación mes a mes
            for (int i = 1; i <= meses; i++) {
                double interes = saldo * tasaMensual;
                saldo += depositoMensual + interes;

                // Mostrar resultados
                System.out.printf("- d -|- %.2f -|- %.2f -|- %.2f -|- %.2f%n -",i,saldo, depositoMensual, interes, saldo);
            }
        }
    } 
}
