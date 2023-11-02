package org.example.EjerciciosCiclos8y9;

public class EjercicioCiclos8conJOpane {
    //pedir un numero N y mostrar todos los numeros del 1 al N. con Scanner
    public static void main(String[] args) {
        int numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero"));
        for (int i = 1; i <= numero; i++) {
            javax.swing.JOptionPane.showMessageDialog(null, "i = " + i);
        }
    }
}
