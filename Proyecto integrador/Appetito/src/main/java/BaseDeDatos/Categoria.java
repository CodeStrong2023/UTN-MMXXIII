package BaseDeDatos;

public class Categoria {
    private String Nombre;

    public Categoria(String nombre) {
        this.Nombre = nombre;
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
