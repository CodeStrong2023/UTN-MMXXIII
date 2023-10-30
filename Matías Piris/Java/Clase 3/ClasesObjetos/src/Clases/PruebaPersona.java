package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona Persona1; //Variable personal
        Persona1 = new Persona(); //Llamamos al constructor y construimos el objeto.
        Persona1.Nombre = "Matías"; //A través del objeto y el operador de ".", buscamos el atributo y le asignamos el valor.
        Persona1.Apellido = "Piris"; //Las características/valores del atributo son "Matias" y "Piris"
        Persona1.ObtenerInformacion(); //Con el mismo objeto, accedemos al método ObtenerInformacion()
        
        Persona Persona2 = new Persona();
        System.out.println("persona2 = " + Persona2);
        System.out.println("persona1 = " + Persona1);
        Persona2.ObtenerInformacion();
        Persona2.Nombre = "Ariel";
        Persona2.Apellido = "Betancud";
        Persona2.ObtenerInformacion();
    }
}
