package Dominio;

public class Persona {
    protected String Nombre; //Se coloca "protected" para poder trabajar con herencia.
    protected char Genero;
    protected int Edad;
    protected String Direccion;
    
    //Constructor vacio: sirve para crear objetos sin necesidad de inicializar los atributos de la clase.
    public Persona(){
        
    }
    
    public Persona(String nombre){  //Constructor 2
        this.Nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { //Constructor 3
        this.Nombre = nombre;
        this.Genero = genero;
        this.Edad = edad;
        this.Direccion = direccion;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public char getGenero() {
        return this.Genero;
    }

    public void setGenero(char genero) {
        this.Genero = genero;
    }

    public int getEdad() {
        return this.Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{Nombre = ").append(Nombre);
        sb.append(", Genero = ").append(Genero);
        sb.append(", Edad = ").append(Edad);
        sb.append(", Direccion = ").append(Direccion);
        sb.append(", ").append(super.toString()); //Direccion de memoria.
        sb.append('}');
        return sb.toString();
    }
}
