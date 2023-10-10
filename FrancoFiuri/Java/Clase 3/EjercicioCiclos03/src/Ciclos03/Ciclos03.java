/*
Ejercicio3: Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPane
 */
package Ciclos03;

import java.util.Scanner;


public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.next());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El número ingresado "+numero+" es PAR");
            }
            else {
                System.out.println("El número ingresado "+numero+" es IMPAR");
            }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.next());
        }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
