/* Ejercicio 8: pedir un número N y mostrar todos los números del 1 al N. */
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8SinScanner {
    public static void main(String[] args) {
       int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
       int I = 1;
       
       JOptionPane.showMessageDialog(null, "Lista de todos los números del 1 al " + N + ": ");
       
       while(I <= N){
           JOptionPane.showMessageDialog(null,I);
           I++;
       }
    }
}
