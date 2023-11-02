package org.example;

public class EjercicioconCiclos7ConaClaseScanner {
    //pedir un numero hasta que se introdusca un negativo y calcular media
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;
        int contador = 0;
        double media = 0;
        while (numero >= 0) {
            System.out.println("Ingrese un numero: ");
            numero = new java.util.Scanner(System.in).nextInt();
            if (numero >= 0) {
                suma = suma + numero;
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            media = (double) suma / contador;
            System.out.println("La media de los numeros ingresados es: " + media);
        }
    }
}
