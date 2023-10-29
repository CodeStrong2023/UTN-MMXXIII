
package com.mycompany.ciclos08;

import java.util.Scanner;

public class Ciclos08 {

    public static void main(String[] args) {
        /* Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = (scanner.nextInt());
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }
}
