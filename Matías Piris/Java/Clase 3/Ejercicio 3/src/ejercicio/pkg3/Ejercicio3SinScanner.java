/*Ejercicio 3: Leer números hasta que se introduzca un cero. Para cada uno indicar si es par o impar
Primero lo haremos con la clase Scanner, luego con la clase JOptionPane*/

package ejercicio.pkg3;

import javax.swing.JOptionPane;

public class Ejercicio3SinScanner {
    public static void main(String[] args) {
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(N != 0){
            if(N %2== 0){
                JOptionPane.showMessageDialog(null, "El número ingresado " + N + " es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número ingresado " + N + " es IMPAR");
            }
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es " + N + " finaliza el programa.");   
    }
}
