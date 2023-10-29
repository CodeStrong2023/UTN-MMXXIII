/*Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0*/

package ejercicio.pkg2;

import javax.swing.JOptionPane;

public class Ejercicio2SinScanner {
    public static void main(String[] args) {

        int N;
        N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(N != 0){ //Mientras el número sea distinto a cero
            if(N > 0){
                JOptionPane.showMessageDialog(null, "El número " + N + " es POSITIVO");
                  }
            else{
                JOptionPane.showMessageDialog(null, "El número " + N + " es NEGATIVO");
            }
            N  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número " + N + " ha finalizado el programa.");
    }
}
