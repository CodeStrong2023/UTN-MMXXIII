/*Ejercicio 05:  Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100, y 
luego ir pidiendo números indicando "es mayor" o "es menor" según corresponda con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos.*/

package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5SinScanner {
        public static void main(String[] args) {
            
        int N, A, C = 0;
        A = (int) (Math.random()*100); //esto genera un número aleatorio
        
        do{                        
            N = Integer.parseInt(JOptionPane.showInputDialog(("Ingrese un número: ")));
                if(N < A){
                    JOptionPane.showConfirmDialog(null,"Ingrese un número mayor");                
                }
                else if(N > A){
                    JOptionPane.showConfirmDialog(null, "Ingrese un número menor");                
                }
                else{
                    JOptionPane.showConfirmDialog(null, "¡Felicidades! Has acertado el número");
                }
            C++;
            
        }while(N != A);
        
        JOptionPane.showConfirmDialog(null,"Adivinaste el número en  " + C + " intentos");
    }
    
}
