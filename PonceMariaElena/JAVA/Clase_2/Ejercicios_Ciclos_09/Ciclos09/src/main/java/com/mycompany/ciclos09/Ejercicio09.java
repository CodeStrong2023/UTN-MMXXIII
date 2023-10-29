
package com.mycompany.ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
         * Ejercicio 9: Pedir el dia mes y año de una fecha e indicar si es correcta,
         * suponiendo que todos los meses son de 30 dias
         */

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2023)) {
                    JOptionPane.showMessageDialog(null, "La fecha es: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dia es incorrecto");
        }
    }
}
