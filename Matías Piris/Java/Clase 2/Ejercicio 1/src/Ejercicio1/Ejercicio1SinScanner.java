/*Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. */

package Ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1SinScanner {
    public static void main(String[] args) {
                int N, C;

        N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(N >=0){ //Mientras el número sea igual a cero o positivo.
            C = (int)Math.pow(N, 2);
            System.out.println("El número  " + N +" elevado al cuadrado es: "+ C);
            N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa ha finalizado por haber ingresado un número negativo.");
    }
}
