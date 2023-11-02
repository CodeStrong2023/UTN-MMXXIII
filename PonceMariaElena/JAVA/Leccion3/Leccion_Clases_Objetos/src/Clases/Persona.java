package Clases;

public class Persona {
//Debe ser publica para poder acceder desde otros archivos
//Palabra reservada class
//Pascal Case
    
    //Atributos (caracteristicas)
    private String nombre;
    private String apellido;
    private double sueldo;
    private boolean eliminado;
    
    //CLASE 4
    //Metodos (acciones)
    public void obtenerInformacion(){ //camelCase
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
    
    //CLASE 7
     // Constructor.
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //Getters and Setters
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado() {
        this.eliminado = eliminado;
    }
}
