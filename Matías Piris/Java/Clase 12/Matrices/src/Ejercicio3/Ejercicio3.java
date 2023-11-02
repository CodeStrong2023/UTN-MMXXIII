//Ejercicio 3: crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Matriz [][] = new int [3][3];
        
        System.out.println("Rellenar la matriz: ");
        for(int I = 0; I < 3; I++){
            for(int J = 0; J < 3; J++){
                System.out.println("Matriz [" + I + "][" + J + "]: ");
                Matriz[I][J] = entrada.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("Matriz Completa Original: ");
        for(int I = 0; I < 3; I++){
            for(int J = 0; J < 3; J++){
                System.out.print (Matriz [I][J] + " ");
            }
             System.out.println();
        }
        
        System.out.println();

        //Matriz Transpuesta.
        System.out.println("Matriz Transpuesta: ");
        for(int I = 0; I < 3; I++){
            for(int J = 0; J < 3; J++){
                System.out.print (Matriz [J][I] + " ");
            }
             System.out.println();
        }
    }
}
