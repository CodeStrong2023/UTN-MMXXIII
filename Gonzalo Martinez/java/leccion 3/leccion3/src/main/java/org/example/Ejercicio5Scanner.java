package org.example;
import java.util.Scanner;
public class Ejercicio5Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero<aleatorio){
                System.out.println("Digite un numero mayor");
            } else if (numero>aleatorio) {
                System.out.println("Digite un numero menor");
            } else{
                System.out.println("¡¡¡¡FELICIDADES!!! Has adivinado el numero");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("adivinaste el numero en: "+conteo+ " intentos");
    }
}
