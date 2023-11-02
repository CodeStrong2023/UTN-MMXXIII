package Dominio;

public class Persona {
    public final static int CONSTANTE_AQUI = 15;
    private String Nombre;

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public final void imprimir(){
        System.out.println("Metodo para imprimir");
    }
}
