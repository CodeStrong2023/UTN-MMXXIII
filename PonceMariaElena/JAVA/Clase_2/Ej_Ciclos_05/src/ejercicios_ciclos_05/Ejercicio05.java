/*
Ejercicio 05:  Realizar un juego para adivinar un número, 
para ello generar un número aleatorio entre 0-100, y 
luego ir pidiendo números indicando "es mayor" o "es menor" según corresponda con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos.
*/
package ejercicios_ciclos_05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
 public static void main(String[] args) {
        int numero, aleatorio, conteo= 0;
        aleatorio = (int) (Math.random()*100); //esto genera un número aleatorio
        do{                        
            numero = Integer.parseInt(JOptionPane.showInputDialog(("Digite un número: ")));
            if(numero<aleatorio){
                JOptionPane.showConfirmDialog(null,"Digite un número mayor");                
            }
            else if(numero>aleatorio){
                  JOptionPane.showConfirmDialog(null, "Digite un número menor");                
            }
            else{
                JOptionPane.showConfirmDialog(null, "¡¡¡Felicidades!!! Haz adivinado el número");
            }
            conteo++;
        }while(numero!=aleatorio);
        JOptionPane.showConfirmDialog(null,"Adivinaste el número en  "+conteo+" intentos");
    }
    
}
