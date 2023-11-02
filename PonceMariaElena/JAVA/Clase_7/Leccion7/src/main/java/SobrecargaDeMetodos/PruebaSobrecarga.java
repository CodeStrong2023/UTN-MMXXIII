/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SobrecargaDeMetodos;

/**
 *
 * @author Marie
 */
public class PruebaSobrecarga {
        public static void main(String[] args) {
        int resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(23.265, 12.54);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(6, 8L);
        System.out.println("resultado3 = " + resultado3);
    }
}
