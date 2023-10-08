/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author el_go
 */
public class Ejercicio2ciclos {

    public static void main(String[] args) {

        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        while(numero>=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
            
        }
        System.out.println("El programa a finalizado por numero negativo");
        
        
        
    }
}
