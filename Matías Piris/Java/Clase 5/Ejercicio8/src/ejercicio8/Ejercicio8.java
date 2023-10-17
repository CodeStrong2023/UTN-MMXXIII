/* Ejercicio 8: pedir un número N y mostrar todos los números del 1 al N. */
package ejercicio8;

import java.util.Scanner;
        
public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese un número: ");
       int N = Integer.parseInt(entrada.nextLine());
       int I = 1;
       
       System.out.println("Lista de todos los números del 1 al " + N);
       
       while(I <= N){
           System.out.println(I);
           I++;
       }
    }
    
}
