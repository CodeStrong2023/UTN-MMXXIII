package BaseDeDatos;

public class Categoria {
    private String Nombre;


    public Categoria(String nombre) {
        Nombre = nombre;
    }

    public Categoria() {

    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public String toString() {
        return "Categoria{" +
                "Nombre = '" + Nombre +
                " }";
    }

}
