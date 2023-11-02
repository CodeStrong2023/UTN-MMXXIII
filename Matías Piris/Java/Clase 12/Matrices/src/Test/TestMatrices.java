
package Test;

import Dominio.Persona;

public class TestMatrices {
    public static void main(String[] args){
        int E[][] = new int[3][2];
        System.out.println("Edades = " + E);
        
        E[0][0] = 5; //Llenado manual.
        E[0][1] = 7; //Es una columna diferente.
        E[1][0] = 8;
        E[1][1] = 4;
        E[2][0] = 2;
        E[2][1] = 9;
        
        System.out.println("Edad 0-0: " + E[0][0]);
        System.out.println("Edad 0-1: " + E[0][1]);
        System.out.println("Edad 1-0: " + E[1][0]);
        System.out.println("Edad 1-1: " + E[1][1]);
        System.out.println("Edad 2-0: " + E[2][0]);
        System.out.println("Edad 2-1: " + E[2][1]);
        System.out.println("====================");
        System.out.println("Recorriendo la matriz a través del ciclo for");
        
        for(int F = 0; F < E.length; F++){
            for(int C = 0; C < E[F].length; C++){
                System.out.println("Edad " + F + "-" + C + ": " + E[F][C]);
            }
        }
        /*
        Sintaxis clásica.
        String Frutas[][] = new String[3][2];
        */
        
        //Sintaxis simplificada.
        String Frutas[][] = {{"Limón", "Pomelo"},{"Ciruela", "Kiwi"},{"Banana", "Manzana"}};
        System.out.println("====================");
        
        for(int I = 0; I < Frutas.length; I++){
            for(int J = 0; J < Frutas[I].length; J++){
                System.out.println("Fruta " + I + "-" + J + ": " + Frutas[I][J]);
            }
        }
        
        //Creamos matriz de objetos.
        Persona personas [][] = new Persona[2][3];
        
        //Asignando valores a la matriz.
        personas[0][0] = new Persona("Matias");
        personas[0][1] = new Persona("Lucas");
        personas[0][2] = new Persona("Ariel");
        personas[1][0] = new Persona("Liliana");
        personas[1][1] = new Persona("Valentina");
        personas[1][2] = new Persona("Rafael");
        System.out.println("====================");
        System.out.println("Matriz de Personas");
        imprimir(personas);
        
    }
    
    public static void imprimir(Object Matriz[][]){
        for(int I = 0; I < Matriz.length; I++){
            for(int J = 0; J < Matriz[I].length; J++){
                System.out.println("Matriz " + I + "-" + J + ": " + Matriz[I][J]);
            }
        }
    }
}
