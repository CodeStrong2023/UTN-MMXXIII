
package com.mycompany.ciclos10;

import javax.swing.JOptionPane;



public class Ejercicio10 {
    public static void main(String[] args) {
        /* Ejercicio 10: pedir 10 numeros y escribir la suma total */
        
        
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
           
            numero = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "\n La suma de todos los numeros es: " +suma);
        
    }
}
