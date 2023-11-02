/*Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al introducidos.*/
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int Arreglo[] = new int [5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar 5 números para introducirlos en el arreglo");
        for (int I = 0; I < 5; I++){
            System.out.println("Ingrese un número para el espacio " + I + " del arreglo: ");
            Arreglo[I] = entrada.nextInt();
        }
        for (int I = 4; I >= 0; I--) { //Se muestra el arreglo de forma inversa.
            System.out.println("Arreglo " + I + " = " + Arreglo[I]);
        }
    }
}
