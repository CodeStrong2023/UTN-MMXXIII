package Dominio;

public class Persona {
    //Atributos.
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor.
    public Persona(String Nombre, double Sueldo, boolean Eliminado){ //Las variables deben tener el mismo nombre de los atributos para que puedan tener acceso.
        this.nombre = Nombre;
        this.sueldo = Sueldo;
        this.eliminado = Eliminado;
    }

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

    public boolean isEliminado() {  //Al ser boolean se escribe is(es?) en vez de get.
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){ //Convierte en una cadena cada atributo
        return "Persona[ Nombre: " + this.nombre+
                ", sueldo: " + this.sueldo+
                ", eliminado: " + this.eliminado+" ]";
    }
}
