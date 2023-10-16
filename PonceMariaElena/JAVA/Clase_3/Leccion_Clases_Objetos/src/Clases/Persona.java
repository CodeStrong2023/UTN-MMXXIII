package Clases;

public class Persona {
//Debe ser publica para poder acceder desde otros archivos
//Palabra reservada class
//Pascal Case
    
    //Atributos (caracteristicas)
    String nombre;
    String apellido;
    
    //CLASE 4
    //Metodos (acciones)
    public void obtenerInformacion(){ //camelCase
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
