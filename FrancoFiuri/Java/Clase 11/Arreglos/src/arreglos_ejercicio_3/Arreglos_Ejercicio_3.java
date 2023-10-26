/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en
un arreglo y a continuación realizar la media de los números
positivos, la media de los negativos y contar el
número de ceros.
 */
package arreglos_ejercicio_3;

import java.util.Scanner;


public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int [5];
        float negativos=0,positivos=0,mediaNegativos,mediaPositivos;
        int conteo0=0,conteo_negativos=0,conteo_positivos=0;
        
        System.out.println("Digite 5 numeros para introducirlos en el arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println("Digite un numero para el espacio "+i+" del arreglo: ");
            numeros[i] = entrada.nextInt();
            if(numeros[i]>0){
                positivos += numeros[i];
                conteo_positivos++;
            }
            else if (numeros[i]<0){
                negativos += numeros[i];
                conteo_negativos++;
            }
            else{
                conteo0++;
            }
        }
        
        if(conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros positivos");
        }
        else {
            mediaPositivos = positivos/conteo_positivos;
            System.out.println("\nLa media de los numeros positivos es: "+mediaPositivos);
        }
        if(conteo_negativos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros negativos");
        }
        else {
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("\nLa media de los numeros negativos es: "+mediaNegativos);
        }
        System.out.println("La cantidad de ceros es: "+conteo0);
        
    }
}
