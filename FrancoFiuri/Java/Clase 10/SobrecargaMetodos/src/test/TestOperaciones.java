
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.0, 7.5);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(8, 6L); //El compilador decidio utilizar el metodo double ya que es el mas compatible con long
        System.out.println("resultado3 = " + resultado3);
    }
}
