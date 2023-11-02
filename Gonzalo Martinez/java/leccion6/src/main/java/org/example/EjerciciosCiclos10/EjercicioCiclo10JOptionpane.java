package org.example.EjerciciosCiclos10;

public class EjercicioCiclo10JOptionpane {
    // pedir 10 numeros y escribir la suma total usar JOptionPane
    public static void main(String[] args) {
        var suma = 0;
        for (int i = 0; i < 10; i++) {
            var numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero"));
            suma += numero;
        }
        javax.swing.JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}
