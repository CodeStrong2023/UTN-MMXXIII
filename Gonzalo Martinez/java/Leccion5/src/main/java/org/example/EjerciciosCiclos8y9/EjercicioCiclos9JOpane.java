package org.example.EjerciciosCiclos8y9;

public class EjercicioCiclos9JOpane {
    public static void main(String[] args) {
        int dia = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el dia"));
        int mes = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el mes"));
        int año = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el año"));
        if (dia <= 30 && mes <= 12 && año > 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "La fecha es correcta");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
        }
    }
}
