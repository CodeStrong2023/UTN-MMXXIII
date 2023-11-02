/*
Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducidos.
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        int[] arreglos = new int [5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 numeros para introducirlos en el arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println("Digite un numero para el espacio "+i+" del arreglos: ");
            arreglos[i] = entrada.nextInt();
        }
        for (int i = 4; i >= 0; i--)
            System.out.println("arreglos "+i+" = " + arreglos[i]);
        }
    }

