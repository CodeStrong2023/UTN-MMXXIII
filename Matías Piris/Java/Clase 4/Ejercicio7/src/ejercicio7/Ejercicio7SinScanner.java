/*Ejercicio 7: Pedir números hasta que se intriduzca uno negativo y calcular la media.*/
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7SinScanner {
    public static void main(String[] args) {
        int N, C = 0, S = 0;
        float P = 0;        
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(N >= 0){//Mientras el número no negativo
            S += N;
            C++;
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        if(C == 0){
            JOptionPane.showConfirmDialog(null,"Error. La división entre cero no existe");
        }
        
        else{
            P =  (float)S/C;
            JOptionPane.showConfirmDialog(null,"El promedio es " + P);
        }
    }
}
