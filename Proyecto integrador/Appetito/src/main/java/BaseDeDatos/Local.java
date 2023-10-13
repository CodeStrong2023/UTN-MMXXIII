package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Local {
    private int id;
    private String nombre;
    private String direccion;
    private double tiempoEspera;
    private int puntuacion;
    private List<Categoria> categoria;

    private List<Producto> productos;  // Lista de productos del local

    //permite agregar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    //permite acceder a productos del local
    public List<Producto> getProductos() {
        return productos;
    }
    //permite agregar categorias
    public void agregarCategoria(Categoria categoria) {
        categoria.add(categoria);
    }
    //permite acceder a categorias del local
    public List<Categoria> getCategoria() {
        return categoria;
    }
    //constructor
    public Local(int id, String nombre, String direccion, double tiempoEspera, int puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tiempoEspera = tiempoEspera;
        this.puntuacion = puntuacion;
        this.categoria = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    ////  metodo to String devuelve datos ordenados del local
    @Override
    public String toString() {
        return "Local {" +
                "id=" + id +
                ", nombre=" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tiempoEspera=" + tiempoEspera +
                ", puntuacion=" + puntuacion +
                ", categoria=" + categoria + '\'' +
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
        return tiempoEspera;
    }

    public void setTiempoEspera(double tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
