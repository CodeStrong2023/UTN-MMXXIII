/*Ejercicio 3: Leer números hasta que se introduzca un cero. Para cada uno indicar si es par o impar
Primero lo haremos con la clase Scanner, luego con la clase JOptionPane*/

package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        System.out.println("Digite un número: ");
        N  =  Integer.parseInt(entrada.nextLine());
        
        while(N != 0){
            if(N %2== 0){
                System.out.println("El número ingresado " + N + " es par");
            }
            else{
                System.out.println("El número ingresado " + N + " es IMPAR");
            }
        System.out.println("Digite un número: ");
        N  =  Integer.parseInt(entrada.nextLine());
        }
        
        System.out.println("El número ingresado es " + N + " finaliza el programa.");
    }
}
