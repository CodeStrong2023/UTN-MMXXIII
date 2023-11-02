package org.example;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println( "persona2" + persona2 );
        System.out.println( "persona2" + persona1 );
        persona2.obtenerInformacion();
        persona2.nombre = "Carlos";
        persona2.apellido = "Lara";
        persona2.obtenerInformacion();
    }
}
