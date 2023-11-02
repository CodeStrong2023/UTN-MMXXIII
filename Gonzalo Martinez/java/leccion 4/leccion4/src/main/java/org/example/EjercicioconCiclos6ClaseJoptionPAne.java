package org.example;

public class EjercicioconCiclos6ClaseJoptionPAne {
    public static void main(String[] args) {
        ////Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos. con JOptionPane
        int numero = 1;
        int suma = 0;
        while (numero != 0) {
            numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero: "));
            suma = suma + numero;
        }
        javax.swing.JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + suma);

    }
}