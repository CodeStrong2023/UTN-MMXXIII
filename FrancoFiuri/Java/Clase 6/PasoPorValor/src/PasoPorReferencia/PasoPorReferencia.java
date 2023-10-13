//Paso por referencia
package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Franco"; //Para poder acceder al atributo nombre, debe estar en public en su respectiva clase.
        System.out.println("persona1 Nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: " + persona2.nombre);
    }
    
    public static void cambiarValor(Persona persona2){ //parámetro por referencia.
        persona2.nombre = "Tomas"; //En este metodo le asignamos otro valor al atributo nombre.
        
    }
    
    public static Persona cambiarElValor(Persona persona){ //Metodo tipo Object
        if (persona == null){
            System.out.println("Valor de persona es invalido : Null");
            return null;
        }
        else {
            persona.nombre = "Barbara"; //paso por referencia
            return persona; //es necesario que se encuentre el return en un metodo con retorno.
        }
    }
}
