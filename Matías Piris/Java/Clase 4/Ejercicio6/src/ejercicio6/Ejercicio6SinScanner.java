/*Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos*/
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6SinScanner {
    public static void main(String[] args) {
    int N, S = 0;
        do{          
            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número: "));
            S += N;
            
        }while(N !=0);
        
        JOptionPane.showMessageDialog(null,"La suma de todos los números ingresados es: "+ S);
    }
}
