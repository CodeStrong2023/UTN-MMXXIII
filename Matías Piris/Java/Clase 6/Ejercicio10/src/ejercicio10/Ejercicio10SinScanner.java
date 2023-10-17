/*Ejercicio 10: Pedir 10 números y escribir la suma total.
Hacerlo con la clase Scanner y JOptionPane*/

package ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10SinScanner {
    public static void main(String[] args) {
        int S = 0;
        for (int I = 1; I <= 10; I++){
            int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (" + I + " de 10): "));
            S += N;
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números es: " + S);
    }
}
    

    