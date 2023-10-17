/*Ejercicio 7: Pedir números hasta que se intriduzca uno negativo y calcular la media.*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, C = 0, S = 0;
        float P = 0;
            
        System.out.println("Digite un numero: ");
        N = Integer.parseInt(entrada.nextLine());
            
        while(N >= 0){//Mientras el número no negativo
            S += N;
            C++;
            System.out.println("Digite otro número: ");
            N = Integer.parseInt(entrada.nextLine());
        }
        
        if(C == 0){
            System.out.println("Error. La división entre cero no existe");
        }
        
        else{
            P =  (float)S/C;
            System.out.println("El promedio es " + P);
        }
    }
}
