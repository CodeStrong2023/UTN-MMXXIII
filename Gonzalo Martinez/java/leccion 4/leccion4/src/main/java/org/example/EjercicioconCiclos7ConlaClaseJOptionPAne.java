package org.example;

public class EjercicioconCiclos7ConlaClaseJOptionPAne {
    ////pedir un numero hasta que se introdusca un negativo y calcular media. con joptionpane
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;
        int contador = 0;
        double media = 0;
        while (numero >= 0) {
            numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero: "));
            if (numero >= 0) {
                suma = suma + numero;
                contador++;
            }
        }
        if (contador == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
        } else {
            media = (double) suma / contador;
            javax.swing.JOptionPane.showMessageDialog(null, "La media de los numeros ingresados es: " + media);
        }
    }
}
