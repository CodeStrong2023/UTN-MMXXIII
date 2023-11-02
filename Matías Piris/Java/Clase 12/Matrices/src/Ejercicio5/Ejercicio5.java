//Ejercicio 5: crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
package Ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Matriz[][], NFilas, NCol;
        
        NFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de filas: "));
        NCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de columnas: "));
        
        Matriz = new int [NFilas][NCol];
        int Filas[] = new int [NFilas];
        int Columnas[] = new int [NCol];
        
        System.out.println("Llenando la matriz: ");
        
        for(int I = 0; I < NFilas; I++){
            for(int J = 0; J < NCol; J++){
                System.out.print("Matriz [" + I + "][" + J + "]: ");
                Matriz[I][J] = entrada.nextInt();
            }
        }
        
        //Mostrando matriz completa.
        System.out.println();
        System.out.println("Matriz Completa: ");
        for(int I = 0; I < NFilas; I++){
            for(int J = 0; J < NCol; J++){
                System.out.print (Matriz [I][J] + " ");
            }
                System.out.println();
            }
        
        //Suma de las filas.
        for (int I = 0; I < NFilas; I++) {
            int SumaFila = 0;
            for (int J = 0; J < NCol; J++) {
                SumaFila += Matriz[I][J];
            }
            JOptionPane.showMessageDialog(null, "Suma de la fila " + I + ": " + SumaFila);
        }
        
        //Suma de las columnas.
        for (int J = 0; J < NCol; J++) {
            int SumaCol = 0;
            for (int I = 0; I < NFilas; I++) {
                SumaCol += Matriz[I][J];
            }
            JOptionPane.showMessageDialog(null, "Suma de la columna " + J + ": " + SumaCol);
        }
    }
}
