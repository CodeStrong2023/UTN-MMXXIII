/*EJERCICIO 2: Leer un número e indicar si es positivo o negativo. 
El proceso se repetirá hasta que se introduzca un 0 sin scanner, con JOptionPane*/
package ejercicios_ciclos_02;

import javax.swing.JOptionPane;

public class Ejercicio_Ciclos_02_sin_scanner {
     public static void main(String[] args) {

        int numero;
        numero  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero !=0){ //Mientras el número sea distinto a cero
            if(numero>0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
                  }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
            }
            numero  =  Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" ha finalizado el programa.");
    }
}
