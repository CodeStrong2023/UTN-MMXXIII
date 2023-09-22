package org.example;

import javax.swing.*;

public class Ejercicio4JOtionPane {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while(numero >= 0){
                JOptionPane.showMessageDialog(null, "El numero  " + numero + "es POSITIVO" );
                conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
            }
            JOptionPane.showMessageDialog(null, "A ingresado "+conteo+ " que no son negativos" );
        }
}

