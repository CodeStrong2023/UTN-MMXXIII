//Paso por referencia
package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona Persona1 = new Persona();
        Persona1.Nombre = "Matias"; //Para poder acceder al atributo nombre, debe estar en public en su respectiva clase.
        System.out.println("Persona1 Nombre: " + Persona1.Nombre);
        cambiarValor(Persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + Persona1.Nombre);
        Persona1 = cambiarElValor(Persona1);
        Persona Persona2 = new Persona();
        //Persona persona2 = null;
        Persona2 = cambiarElValor(Persona2);
        System.out.println("El nuevo valor del objeto es: " + Persona2.Nombre);
    }
    
    public static void cambiarValor(Persona Persona2){ //Parámetro por referencia.
        Persona2.Nombre = "Tomas"; //En este metodo le asignamos otro valor al atributo nombre.
        
    }
    
    public static Persona cambiarElValor(Persona Persona){ //Metodo tipo Object
        if (Persona == null){
            System.out.println("Valor de persona es invalido : Null");
            return null;
        }
        else {
            Persona.Nombre = "Barbara"; //Paso por referencia
            return Persona; //Es necesario que se encuentre el return en un metodo con retorno.
        }
    }
}