package org.example;

import javax.swing.*;

public class Ejercicio3JOptionPane {
    public static void main(String[] args) {
        int numero;
        System.out.println("digite un numero : ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while(numero != 0){
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + "es PAR" );
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " es IMPAR" );
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es " + numero + "finaliza el programa" );
    }
}
