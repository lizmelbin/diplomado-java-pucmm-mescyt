package com.eudriscabrera.java.fundamentos;

import java.util.Scanner;

/**
 * Un ejemplo sencillo que trata de demostrar la comparacion de variables
 * numericas y tambien la comparacion de cadena de caracteres, asi como tambien
 * el uso de las sentencias IF/ELSE y WHILE
 */public class EstructurasControl {
    
    public static double calcularTotal(double subtotal){
    
           // Calcular el importe del descuento y el total
            double discountPercent;
            
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            
            double discountAmount = subtotal * discountPercent;
            
            return subtotal - discountAmount;
    }
    

    public static void main(String[] args) {
        // La bienvenida al usuario con el programa
        System.out.println("Bienvenido a la calculadora de la factura total");
        System.out.println();  // imprimir una linea en blanco

        // crear un objeto de la clase Scanner llamado sc
        Scanner sc = new Scanner(System.in);

        // Realizar los calculos de la factura hasta que la eleccion no sea igual a "y" o "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // Obtener el subtotal de la factura del usuario
            System.out.print("Escriba el subtotal:   ");
            double subtotal = sc.nextDouble();

            double total = calcularTotal(subtotal);
    
               //Mostrar la cantidad de descuento y el total 
            System.out.println(String.format("Total de la factura:   %.2f \n  ", total));

            // Si el usuario quiere seguir
            System.out.print("Continuar ? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
