package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        double saldo = 50000;
        int opcion;

        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Saldo actual: $" + saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso \n Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad inválida.");
                    }
                }
                case 4 -> System.out.println("Usaste nuestro cajero gracias");
                default -> System.out.println("Opción no aceptada");
            }
        } while (opcion != 4);

        scanner.close();
    }
}


