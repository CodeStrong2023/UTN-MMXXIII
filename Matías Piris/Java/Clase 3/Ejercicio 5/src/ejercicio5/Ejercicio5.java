/*Ejercicio 05:  Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100, y 
luego ir pidiendo números indicando "es mayor" o "es menor" según corresponda con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos.*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N, A, C = 0;
        A = (int) (Math.random()*100); //esto genera un número aleatorio
        
        do{            
            System.out.println("Ingrese un número: ");
            N = Integer.parseInt(entrada.nextLine());
                if(N < A){
                    System.out.println("Ingrese un número mayor");                
                }
                else if(N > A){
                    System.out.println("Ingrese un número menor");                
                }
                else{
                    System.out.println("¡Felicidades! Has acertado el número");
                }
            C++;
            
        }while(N != A);
        
        System.out.println("Adivinaste el número en  " + C + " intentos");
    }
    
}