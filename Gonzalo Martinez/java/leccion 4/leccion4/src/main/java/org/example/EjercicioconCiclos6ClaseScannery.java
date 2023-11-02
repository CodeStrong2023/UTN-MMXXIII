package org.example;

public class EjercicioconCiclos6ClaseScannery {
    //Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = new java.util.Scanner(System.in).nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
