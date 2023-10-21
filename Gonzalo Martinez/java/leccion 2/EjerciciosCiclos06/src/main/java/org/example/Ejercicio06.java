package org.example;

import javax.swing.*;

public class Ejercicio06 {
    public static void main(String[] args) {

        int numero, suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma+= numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null,"LA suma de todos los numeros ingresados es: "+suma);

    }
}
