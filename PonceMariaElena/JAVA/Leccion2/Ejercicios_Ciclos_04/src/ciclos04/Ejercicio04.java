/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
primero con clase scanner
luego con jOptionPane*/
package ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
        public static void main(String[] args) {
        int numero, conteo = 0;
        
        numero  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero>=0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            conteo++;
           numero  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado "+conteo+" números que no son negativos" );
    }
}
