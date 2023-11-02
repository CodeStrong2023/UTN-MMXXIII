package Test;

import Operaciones.Operaciones;

public class TestOperaciones {
     public static void main(String[] args) {
        var Resultado = Operaciones.Sumar(10, 8);
        System.out.println("Resultado = " + Resultado);
        
        var Resultado2 = Operaciones.Sumar(8.5, 4.3);
        System.out.println("Resultado 2 = " + Resultado2);
        
        var Resultado3 = Operaciones.Sumar(8, 6L); //El compilador decidio utilizar el metodo double ya que es el mas compatible con long
        System.out.println("Resultado 3 = " + Resultado3);
    }
}
