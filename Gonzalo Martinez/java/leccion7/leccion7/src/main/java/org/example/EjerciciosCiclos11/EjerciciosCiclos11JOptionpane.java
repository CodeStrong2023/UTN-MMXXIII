package org.example.EjerciciosCiclos11;

public class EjerciciosCiclos11JOptionpane {
    //pedir un numero y calcular factorial usar JOptionPane
    public static void main(String[] args) {
        int numero;
        int factorial = 1;
        numero = 5;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
}
