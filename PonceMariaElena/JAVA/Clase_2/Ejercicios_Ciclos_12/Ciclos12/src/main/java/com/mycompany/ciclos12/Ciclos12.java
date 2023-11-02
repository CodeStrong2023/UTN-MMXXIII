/*Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane*/
package com.mycompany.ciclos12;

import java.util.Scanner;



public class Ciclos12 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        scanner.close();//cerrar scaner es una buena practica

        long factorial = 1;

        // Calcula el factorial utilizando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
