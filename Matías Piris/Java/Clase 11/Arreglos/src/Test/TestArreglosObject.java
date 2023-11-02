package Test;

import Dominio.Persona;

public class TestArreglosObject {
     public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Matias");
        personas[1] = new Persona("Lucas");
        System.out.println("Personas 0 = " + personas[0]);
        System.out.println("Personas 1 = " + personas[1]);
        
        for(int I = 0; I < personas.length; I++){
            System.out.println("personas " + I + " = " + personas[I]);
        }
        
        //Trabajando con arreglos en la sintaxis resumida
        String Frutas[] = {"Manzana", "Pera", "Banana"};
        for (int I = 0; I < Frutas.length; I++) {
            System.out.println("Frutas "  + I + " = "+ Frutas[I]);
        }
    }
}
