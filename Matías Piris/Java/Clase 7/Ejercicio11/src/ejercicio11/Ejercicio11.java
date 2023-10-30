/*Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares. (Hacerlo en JOptionPane */

package ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        long P = 1;
        for (int I = 1; I <= 20; I +=2){
            P *= I;
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los números impares es: " + P);
    }
    
}
