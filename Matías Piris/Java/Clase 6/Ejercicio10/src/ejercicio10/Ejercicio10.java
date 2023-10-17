/*Ejercicio 10: Pedir 10 números y escribir la suma total.
Hacerlo con la clase Scanner y JOptionPane*/

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, S = 0;
        
        for (int I = 1; I <= 10; I++){
            System.out.println("Ingrese un número (" + I + " de 10): ");
            N = Integer.parseInt(entrada.nextLine());
            S += N;
        }
       System.out.println("\nLa suma de todos los números es: " + S);
    }
    
}
