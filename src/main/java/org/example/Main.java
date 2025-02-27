package org.example;

/*
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
*/
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int total = 0;
                int cantidadProductos = 5;

                System.out.println("has tu pedido en la maquina expendedora\n");
                System.out.println("1. Agua - $2000\n2. Galletas - $2500\n3. Jugo - $3000\n4. Chocolate - $3500\n5. Papas - $4000");

                System.out.println("Ingresa el número del producto que quieres comprar (5 productos en total):");
                for (int i = 0; i < cantidadProductos; i++) {
                    System.out.print("Producto " + (i + 1) + ": ");
                    int opcion = scanner.nextInt();
                    int precio = switch (opcion) {
                        case 1 -> 2000;
                        case 2 -> 2500;
                        case 3 -> 3000;
                        case 4 -> 3500;
                        case 5 -> 4000;
                        default -> {
                            System.out.println("Selección inválida, intente de nuevo.");
                            i--;
                            yield 0;
                        }
                    };
                    total += precio;
                }

                System.out.println("Total a pagar: $" + total);
                System.out.print("Ingresa la cantidad de dinero con la que pagaras: ");
                int dinero = scanner.nextInt();

                if (dinero < total) {
                    System.out.println("Fondos insuficientes \nCompra cancelada");
                } else {
                    System.out.println("Compra realizada");
                    System.out.println("Cambio: $" + (dinero - total));
                }

                System.out.println("Gracias por su compra");
                scanner.close();
            }
        }

