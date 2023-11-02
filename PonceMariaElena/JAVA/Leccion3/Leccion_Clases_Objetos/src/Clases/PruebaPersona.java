
package Clases;

public class PruebaPersona {
    //CLASE 4
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //lamar al constructor que permite asignar valor, es un metodo especial para crear objetos
        persona1.nombre = "Ariel"; // El valor hexadecimal normalmente comienza con 0x, es el lugar de memoria reservado
        persona1.apellido = "Bentancud";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona(); 
        System.out.println("persona2: "+persona2);
        System.out.println("persona1: "+persona1);
        persona2.obtenerInformacion();
        //los objetos no comparten información, se asigna un lugar especial para cada uno
        
        persona2.nombre = "Osvaldo";
        persona2.apellido="Giordanini";
        persona2.obtenerInformacion();
    }
}
