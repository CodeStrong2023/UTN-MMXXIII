/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosciclos3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author el_go
 */
public class EjerciciosCiclos3 {

   public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        while(numero!=0){
            if(numero>0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es NEGATIVO");
            }
           
         
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
            
        }
        JOptionPane.showMessageDialog(null, "El numero " + numero + " finaliza el programa");
       
        
        
        
    }
}
