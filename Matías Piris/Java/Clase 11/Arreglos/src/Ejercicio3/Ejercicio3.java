/*Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros.*/

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N[] = new int [5];
        float Negativo = 0, Positivo = 0, MediaN, MediaP;
        int C0 = 0, CN = 0, CP = 0;
        
        System.out.println("Ingresar 5 números para introducirlos en el arreglo");
        for (int I = 0; I < 5; I++){
            System.out.println("Ingrese un número para el espacio " + I + " del arreglo: ");
            N[I] = entrada.nextInt();
            
            if(N[I]>0){
                Positivo += N[I];
                CP++;
            }
            else if (N[I]<0){
                Negativo += N[I];
                CN++;
            }
            else{
                C0++;
            }
        }
        
        if(CP == 0){
            System.out.println("\nNo se puede sacar la media de los números positivos");
        }
        else {
            MediaP = Positivo/CP;
            System.out.println("\nLa media de los números positivos es: " + MediaP);
        }
        if(CN == 0){
            System.out.println("\nNo se puede sacar la media de los números negativos");
        }
        else {
            MediaN = Negativo/CN;
            System.out.println("\nLa media de los números negativos es: " + MediaN);
        }
        System.out.println("La cantidad de ceros es: "+ C0);
        
    }
}
