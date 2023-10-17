/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido. 
Primero con clase scanner, luego con jOptionPane*/

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N, C = 0;
        
        System.out.println("Digite un número: ");
        N  =  Integer.parseInt(entrada.nextLine());
        while(N >= 0){
            System.out.println("El número " + N + " es positivo");
            C++;
            System.out.println("Digite otro número: ");
            N  =  Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ha ingresado " + C + " números que no son negativos" );
    }
    
}
