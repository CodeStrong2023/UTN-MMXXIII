
package com.mycompany.ciclos10;

import java.util.Scanner;

public class Ciclos10 {

    public static void main(String[] args) {
        /* Ejercicio 10: pedir 10 numeros y escribir la suma total */
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("\n La suma de todos los numeros es: " +suma);
    }
}
