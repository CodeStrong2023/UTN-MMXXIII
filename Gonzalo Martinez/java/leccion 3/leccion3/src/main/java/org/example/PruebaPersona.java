package org.example;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persoan1 = new Persona();
        persoan1.nombre = "Ariel";
        persoan1.apellido = "Bentarncud";
        persoan1.obtnerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persoan1);
        persona2.obtnerInformacion();
        persona2.nombre = "Osbaldo";
        persona2.apellido = "Giordanini";
        persona2.obtnerInformacion();
    }
}
