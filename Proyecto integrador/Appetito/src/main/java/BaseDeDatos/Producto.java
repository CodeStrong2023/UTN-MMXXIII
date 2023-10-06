package BaseDeDatos;

public class Producto {
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private int Stock;


    public Producto(String nombre, String descripcion, double precio, int stock) {
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        Stock = stock;
    }

    public Producto() {

    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre = '" + Nombre + '\'' +
                ", Descripcion = '" + Descripcion + '\'' +
                ", Precio = " + Precio +
                ", Stock= "  + Stock +
                " }";
    }
}
