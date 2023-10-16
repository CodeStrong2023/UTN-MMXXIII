
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco", 30.000, false);
        System.out.println("perona1 su nombre es: "+persona1.getNombre());
        //Modificar a través de los métodos
        persona1.setNombre("Tomas"); //Esta es la forma de acceder al atributo.
        //persona1.nombre = "Marta"; //Ya no se puede utilizar porque es privado.
        //System.out.println("Nombre es: "+persona1.nombre);//Error
        System.out.println("persona1 su nombre modificado es: "+persona1.getNombre()); //Forma correcta de mostrar el nombre.
        System.out.println("persona1 su sueldo es: "+persona1.getSueldo());
        System.out.println("persona1 su estado de Eliminado es: "+persona1.isEliminado());
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imprimir.
        
        Persona persona2 = new Persona("Barbara", 90.750, true);
        System.out.println("perona2 su nombre es: "+persona2.getNombre());
        System.out.println("persona2 su sueldo es: "+persona2.getSueldo());
        System.out.println("persona2 su estado de Eliminado es: "+persona2.isEliminado());
        //Modificamos los valores.
        persona2.setEliminado(false);
        persona2.setSueldo(75.500);
        persona2.setNombre("Gustavo");
        //Mostramos los valores modificados.
        System.out.println("persona2 su nombre modificado es: "+persona2.getNombre());
        System.out.println("persona2 su nuevo sueldo es: "+persona2.getSueldo());
        System.out.println("persona2 su nuevo estado de Eliminado es: "+persona2.isEliminado());
        // FIN DE TAREA
        
        System.out.println("persona1: "+persona1);  //llama directamente al metodo toString()
    }   
}
