/*
Ejercicio 7: Pedir números hasta que se intriduzca uno negativo y calcular la media.
 */
package Ciclos07;

import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma=0;
        float promedio = 0;        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero>=0){//Mientras numero no negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if(conteo==0){
            JOptionPane.showConfirmDialog(null,"Error, La división entre cero no existe");
        }
        else{
            promedio =  (float)suma/conteo;
            JOptionPane.showConfirmDialog(null,"El promedio es "+promedio);
        }
    }
}
