/* Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducidos.*/
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int Arreglo[] = new int [5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar 5 números para introducirlos en el arreglo");
        for (int I = 0; I < 5; I++){
            System.out.println("Ingrese un número para el espacio " + I + " del arreglo: ");
            //int N = Integer.parseInt(entrada.nextLine());
            //Arreglo[i] = N; //Antigua forma de ingresar los datos, utilizando una variable.
            Arreglo[I] = entrada.nextInt();//Nueva forma de ingresar los datos leidos.
        }
        for (int I = 0; I < 5; I++) {
            System.out.println("Arreglo " + I + " = " + Arreglo[I]);
        }
    }
}
