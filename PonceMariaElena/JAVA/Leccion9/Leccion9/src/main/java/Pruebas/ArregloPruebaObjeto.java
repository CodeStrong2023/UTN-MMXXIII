/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Persona;

/**
 *
 * @author Marie
 */
public class ArregloPruebaObjeto {
     public static void main(String[] args) {
        
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Nicolas");
        personas[1] = new Persona("Ariel");
        personas[2] = new Persona("Osvaldo");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        System.out.println("personas 2 = " + personas[2]);
        
        System.out.println(" ");
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("Personas " + i + " = " + personas[i]);
        }
        
        System.out.println(" ");
        
        //Sintaxis resumida
        String frutas[] = {"Banana", "Pera", "Naranja", "Durazno"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas: " + frutas[i]);
        }
    }
}
