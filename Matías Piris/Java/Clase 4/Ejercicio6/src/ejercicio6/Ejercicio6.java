/*Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       Scanner entrada =  new Scanner(System.in);
        int N, S = 0;
        do{
            System.out.println("Digite un número: ");
            N = Integer.parseInt(entrada.nextLine());
            S += N;
            
        }while(N != 0);
        
        System.out.println("La suma de todos los números ingresados es: " + S);
    }
}
