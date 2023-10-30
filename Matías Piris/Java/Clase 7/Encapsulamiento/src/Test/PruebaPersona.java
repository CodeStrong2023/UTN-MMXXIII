package Test;

import Dominio.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias", 30.000, false);
        System.out.println("El nombre de Persona1 es: " + persona1.getNombre());
        //Modificar a través de los métodos
        
        persona1.setNombre("Tomás"); //Esta es la forma de acceder al atributo.
        //persona1.nombre = "Marta"; //Ya no se puede utilizar porque es privado.
        //System.out.println("Nombre es: "+persona1.nombre);//Error
        
        System.out.println("El nombre modificado de Persona1 es: " + persona1.getNombre()); //Forma correcta de mostrar el nombre.
        System.out.println("El sueldo de Persona1 es: " + persona1.getSueldo());
        System.out.println("El estado de Persona1 de Eliminado es: " + persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial e imprimir, luego modificar sus valores y volver a imprimir.
        
        Persona persona2 = new Persona("Bárbara", 90.750, true);
        System.out.println("El nombre de Persona2 es: " + persona2.getNombre());
        System.out.println("El sueldo de Persona2 es: " + persona2.getSueldo());
        System.out.println("El estado de Persona2 de Eliminado es: " + persona2.isEliminado());
        
        //Modificamos los valores.
        persona2.setEliminado(false);
        persona2.setSueldo(75.500);
        persona2.setNombre("Gustavo");
        
        //Mostramos los valores modificados.
        System.out.println("El nombre modificado de Persona2 es: " + persona2.getNombre());
        System.out.println("El nuevo sueldo de Persona2 es:  " + persona2.getSueldo());
        System.out.println("El nuevo estado de Persona2 es: " + persona2.isEliminado());
        //Final de tarea
        
        System.out.println("persona1: "+persona1);  //Llama directamente al metodo toString()
    }   
}
