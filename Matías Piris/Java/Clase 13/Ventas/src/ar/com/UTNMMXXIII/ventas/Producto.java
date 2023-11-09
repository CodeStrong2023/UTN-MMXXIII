
package ar.com.UTNMMXXIII.ventas;

public class Producto {
    //Atributos de la clase.
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Constructor vacio.
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this(); //Llamando al constructor vacio para el aumeno de idProducto.
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto = " + idProducto + "| Nombre = " + nombre + "| Precio = $" + precio + '}';
    }
    
    
}
