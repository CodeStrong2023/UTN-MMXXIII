package org.example;

import java.util.Scanner;

public class Ejercicio4Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("digite un numero : ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
                System.out.println(" El numero ingresado " + numero + "es POSITIVO");
                conteo++;
                System.out.println("digite un numero : ");
                numero = Integer.parseInt(entrada.nextLine());
            }
            System.out.println("A ingresado " + conteo + " numeros que no son negativios");
        }
    }

