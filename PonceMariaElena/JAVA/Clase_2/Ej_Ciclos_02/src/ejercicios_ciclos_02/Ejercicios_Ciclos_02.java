/*EJERCICIO 2: Leer un número e indicar si es positivo o negativo. 
El proceso se repetirá hasta que se introduzca un 0*/
package ejercicios_ciclos_02;

import java.util.Scanner;

public class Ejercicios_Ciclos_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un número: ");
        numero  =  Integer.parseInt(entrada.nextLine());
        while(numero !=0){ //Mientras el número sea distinto a cero
            if(numero>0){
                System.out.println("El número "+numero+" es POSITIVO");
                  }
            else{
                System.out.println("El número "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            numero  =  Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número "+numero+" ha finalizado el programa.");
    }
    
}
