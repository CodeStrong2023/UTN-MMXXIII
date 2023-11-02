package org.example.EjerciciosCiclos8y9;

import java.util.Scanner;

public class EjerciciosCiclos8ConScanner {
    //pedir un numero N y mostrar todos los numeros del 1 al N. con Scanner
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("i = " + i);
        }
    }

}
