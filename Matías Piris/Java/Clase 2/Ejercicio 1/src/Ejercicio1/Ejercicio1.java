package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N,C;
        System.out.println("Digite un número: ");
        
        N = Integer.parseInt(entrada.nextLine());
        
        while(N >= 0){
            
            C = (int)Math.pow(N, 2);
            System.out.println("El número " + N + " elevado al cuadrado es: " + C);
            System.out.println("Digite otro número: ");
            N = Integer.parseInt(entrada.nextLine());
            
        }
        System.out.println("El programa ha finalizado porque el número ingresado es negativo");        
        
    }
}
