/*Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane*/
package com.mycompany.ciclos12;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para calcular su factorial: "));

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de " + numero + " es " + factorial);

    }
}
