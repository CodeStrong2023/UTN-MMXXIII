
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; //creamos la variable persona1
        persona1 = new Persona(); //Llamamos al constructor y construimos el objeto
        persona1.nombre = "Franco"; //a traves del objeto y el operador de . buscamos el atributo y le asignamos el valor al mismo.
        persona1.apellido = "Fiuri"; //las caracteristicas/valores del atributo son "Franco" y "Fiuri"
        persona1.obtenerInformacion(); //con el mismo objeto accedemos al metodo obtenerInformacion()
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Ariel";
        persona2.apellido = "Betancud";
        persona2.obtenerInformacion();
    }
}
