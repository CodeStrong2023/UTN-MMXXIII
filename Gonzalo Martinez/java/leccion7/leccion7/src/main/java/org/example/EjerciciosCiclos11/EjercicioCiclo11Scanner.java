package org.example.EjerciciosCiclos11;

public class EjercicioCiclo11Scanner {
    //pedir un numero y calcular factorial usar Scanner
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
