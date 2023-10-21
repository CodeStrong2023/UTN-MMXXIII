package org.example;


//Ejercicio 6: pedir numeros hasta que se teclee un 0, mostrar
//la suma de todos los numeros introducidos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.println("digite un numero: ");
            numero = Integer.parseInt(scanner.nextLine());
            suma+= numero;
        }while (numero != 0);


        System.out.println("\n LA suma de todos los numeros ingresados es: "+suma);
    }
}