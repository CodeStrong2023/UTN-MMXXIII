/*Ejercicio 12: Pedir un número y calcular su factorial. Hacerlo con ambas clases, Scanner y JOptionPane*/
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12SinScanner {
    public static void main(String[] args) {
        long F = 1;
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        for (int I = 1; I <= N; I++){
            F *= I;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de " + N + " es: " + F);
    }
}
