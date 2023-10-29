/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido. 
Primero con clase scanner, luego con jOptionPane*/

package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4SinScanner {
        public static void main(String[] args) {
        int N, C = 0;
        
        N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(N >= 0){
            JOptionPane.showMessageDialog(null, "El número " + N + " es POSITIVO");
            C++;
           N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado " + C + " números que no son negativos" );
    }
}
