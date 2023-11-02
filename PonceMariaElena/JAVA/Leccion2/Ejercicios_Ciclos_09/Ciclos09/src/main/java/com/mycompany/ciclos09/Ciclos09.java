

package com.mycompany.ciclos09;

import java.util.Scanner;

public class Ciclos09 {

    public static void main(String[] args) {
        /*Ejercicio 9: Pedir el dia mes y año de una fecha e indicar si es correcta, suponiendo que todos los meses son de 30 dias*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = entrada.nextInt();
        if((dia != 0) &&(dia <=30)){
            if((mes !=0) && (mes <=12)){
                if((anio !=0) && (anio <=2023)){
                    System.out.println("La fecha es: "+dia+"/"+mes+"/"+anio);
                }else{
                    System.out.println("El año es incorrecto");
                }
            }else{
                System.out.println("El mes es incorrecto");
        }
        }else{
            System.out.println("El dia es incorrecto");
        }
    }
}
