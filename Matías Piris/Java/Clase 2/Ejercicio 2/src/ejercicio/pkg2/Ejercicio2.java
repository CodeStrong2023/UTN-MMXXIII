/*Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0*/

package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        System.out.println("Digite un número: ");
        N  =  Integer.parseInt(entrada.nextLine());
        while(N != 0){ //Mientras el número sea distinto a cero
            if(N > 0){
                System.out.println("El número " + N + " es POSITIVO");
                  }
            else{
                System.out.println("El número " + N + " es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            N  =  Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número " + N + " ha finalizado el programa.");
    }
    
}
