package Dominio;

public class Persona {
    private String Nombre;

    public Persona(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + Nombre + '}' + ", " + super.toString();
    }    
}
