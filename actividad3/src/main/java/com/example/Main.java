package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de la compra (en pesos): ");
        double cantidadCompra = scanner.nextDouble();

        int puntosAcumulados = (int) (cantidadCompra / 10);

        System.out.println("Puntos acumulados: " + puntosAcumulados);

     
        String nivelFidelizacion;

      
        if (puntosAcumulados >= 0 && puntosAcumulados <= 100) {
            nivelFidelizacion = "Bronce";
        } else if (puntosAcumulados >= 101 && puntosAcumulados <= 500) {
            nivelFidelizacion = "Plata";
        } else if (puntosAcumulados >= 501 && puntosAcumulados <= 1000) {
            nivelFidelizacion = "Oro";
        } else {
            nivelFidelizacion = "Platino";
        }

        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            double descuento = cantidadCompra * 0.10;
            System.out.println("¡Felicitaciones! Has recibido un descuento del 10%: " + descuento + " pesos.");
        }

        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("¡Felicidades! Has recibido un cupón para un producto especial.");
        }

        // Cerrar el scanner
    }
}