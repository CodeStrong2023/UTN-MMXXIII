package org.example.EjerciciosCiclos10;

public class EjercicioCiclo10Scanner {
    // pedir 10 numeros y escribir la suma total usar scanner
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        var suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            var numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma total es: " + suma);
    }
}
