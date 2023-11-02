/*
 Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares
 Hacerlo con JOptionPane
 */
package com.mycompany.ciclos11;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        long producto = 1, anterior = 1;

        for (int i = 1; i <= 20; i += 2) {
            anterior = producto;
            producto *= i;
            JOptionPane.showMessageDialog(null, "Operacion " + i + " x " + anterior + " = " + producto);
        }
        JOptionPane.showMessageDialog(null, "El producto de los números impares son: " + producto);
    }
}
