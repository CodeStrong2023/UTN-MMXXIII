package org.example;

import javax.swing.*;

public class Ejercicio5JOptionPane {
    public static void main(String[] args) {

        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
            if(numero<aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero mayor" );
            } else if (numero>aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un numero menor" );
            } else{
                JOptionPane.showMessageDialog(null, "¡¡¡¡FELICIDADES!!! Has adivinado el numero ");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "adivinaste el numero en: "+conteo+ " intentos");
    }
}
