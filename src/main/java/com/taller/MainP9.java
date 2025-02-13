package com.taller;
import java.util.Scanner;

public class MainP9 {
  public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el monto del préstamo: ");
            double monto = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaAnual = scanner.nextDouble();

            System.out.print("Ingrese el plazo del préstamo (en años): ");
            int años = scanner.nextInt();

            // Cálculos iniciales
            double tasaMensual = (tasaAnual / 100) / 12;
            int numeroPagos = años * 12;
            double cuotaMensual = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -numeroPagos));

            double saldo = monto;

            // Mostrar el resumen
            System.out.println("Cuota Mensual: " + cuotaMensual);

            for (int i = 1; i <= numeroPagos; i++) {
                double interes = saldo * tasaMensual;
                double capital = cuotaMensual - interes;
                saldo -= capital;

                // Mostrar información de cada pago
                System.out.printf("Pago %d: Interés: %.2f, Capital: %.2f, Saldo restante: %.2f%n", 
                                  i, interes, capital, saldo);
            }
        }  
    }

}
