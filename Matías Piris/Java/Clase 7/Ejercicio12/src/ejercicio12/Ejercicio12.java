/*Ejercicio 12: Pedir un número y calcular su factorial. Hacerlo con ambas clases, Scanner y JOptionPane*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long F = 1;
        System.out.println("Ingrese un número: ");
        int N = Integer.parseInt(entrada.next());
        
        for (int I = 1; I <= N; I++){
            F *= I;
        }
        System.out.println("El factorial de " + N + " es: " + F);
    }
    
}
