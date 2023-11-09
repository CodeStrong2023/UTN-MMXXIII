
package ar.com.francofiuri.ventas.test;

import ar.com.francofiuri.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 5000.00);
        Producto producto4 = new Producto("Buzo", 16500.00);
        Producto producto5 = new Producto("Short", 7000.00);
        Producto producto6 = new Producto("Vaquero", 17000.00);
        Producto producto7 = new Producto("Camisa", 18600.00);
        Producto producto8 = new Producto("Medias", 1500.00);
        Producto producto9 = new Producto("Boxer", 3500.00);
        Producto producto10 = new Producto("Bufanda", 4500.00);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto8);
        
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto7);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
}
