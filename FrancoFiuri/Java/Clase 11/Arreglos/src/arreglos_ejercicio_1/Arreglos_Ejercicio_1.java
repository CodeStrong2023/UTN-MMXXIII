/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y
mostrarlos en el mismo orden introducidos.
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        int arreglos[] = new int [5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 numeros para introducirlos en el arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println("Digite un numero para el espacio "+i+" del arreglos: ");
            //int numero = Integer.parseInt(entrada.nextLine());
            //arreglos[i] = numero; //antigua forma de ingresar los datos, utilizando una variable.
            arreglos[i] = entrada.nextInt();    //nueva forma de ingresar los datos leidos
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("arreglos "+i+" = " + arreglos[i]);
        }
    }
}
