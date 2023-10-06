package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Local {
    private int id;
    private String nombre;
    private String direccion;
    private double TiempoEspera;
    private int puntuacion;
    private String Categoria;

    private List<Producto> productos;  // Lista de productos del local

    //permite agregar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    //permite acceder a productos del local
    public List<Producto> getProductos() {
        return productos;
    }
    //constructor
    public Local(int id, String nombre, String direccion, double tiempoEspera, int puntuacion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.TiempoEspera = tiempoEspera;
        this.puntuacion = puntuacion;
        this.Categoria = categoria;
        this.productos = new ArrayList<>();
    }
    ////  metodo to String devuelve datos ordenados del local
    @Override
    public String toString() {
        return "Local {" +
                "id=" + id +
                ", nombre=" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", TiempoEspera=" + TiempoEspera +
                ", puntuacion=" + puntuacion +
                ", Categoria='" + Categoria + '\'' +
                ", productos=" + productos +
                '}';
    }
    //geters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTiempoEspera() {
        return TiempoEspera;
    }

    public void setTiempoEspera(double tiempoEspera) {
        TiempoEspera = tiempoEspera;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
