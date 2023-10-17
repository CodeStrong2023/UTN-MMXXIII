/*Ejercicio 9: pedir el día, mes y año de una fecha e indicar si la misma es correcta, 
suponiendo que todos los meses son de 30 días.*/
package ejercicio9;

import java.util.Scanner;
        
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int Dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el mes: ");
        int Mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el año: ");
        int A = Integer.parseInt(entrada.nextLine());
        
        if(Dia != 0 && Dia <= 30){
            if(Mes != 0 && Mes <= 12){
                if(A != 0 && A <= 2023){
                    System.out.println("La fecha ingresada (" + Dia + "/" + Mes + "/" + A + ") es correcta.");
                }
                else{
                    System.out.println("El año ingresado es incorrecto");
                }
            }
            else{
                System.out.println("El mes ingresado es incorrecto");
            }
        }
        else{
                System.out.println("El año ingresado es incorrecto");
        }
    }
    
}
