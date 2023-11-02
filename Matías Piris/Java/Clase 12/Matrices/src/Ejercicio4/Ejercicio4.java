//Ejercicio 4: crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto.

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Matriz[][] = new int[7][7];
        
        for (int I = 0; I < 7; I++){
            for (int J = 0; J < 7; J++){
                if (I == J){
                    Matriz[I][J] = 1;
                }
                else{
                        Matriz[I][J] = 0;
                }
            }
        }
        
        System.out.println();
        System.out.println("Matriz Completa: ");
        for(int I = 0; I < 7; I++){
            for(int J = 0; J < 7; J++){
                System.out.print (Matriz [I][J] + " ");
            }
                System.out.println();
            }
        System.out.println();
        
    }
}
