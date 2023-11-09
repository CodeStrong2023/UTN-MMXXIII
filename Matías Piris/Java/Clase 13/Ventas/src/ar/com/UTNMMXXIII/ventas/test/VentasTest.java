
package ar.com.UTNMMXXIII.ventas.test;

import ar.com.UTNMMXXIII.ventas.Orden;
import ar.com.UTNMMXXIII.ventas.Producto;

public class VentasTest {
    public static void main(String[] args){
        Producto producto1 = new Producto("Pantalón", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 15400.00);
        Producto producto4 = new Producto("Zapatillas", 12000.00);
        Producto producto5 = new Producto("Bolso", 7000.00);
        Producto producto6 = new Producto("Gorra", 2600.00);
        Producto producto7 = new Producto("Bufanda", 1950.00);
        Producto producto8 = new Producto("Calcetines", 1050.00);
        Producto producto9 = new Producto("Reloj", 4000.00);
        Producto producto10 = new Producto("Gafas de sol", 6590.00);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        //Agregando productos al arreglo.
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        
        System.out.println("Orden 1: ");
        orden1.mostrarOrden();
        
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        
        System.out.println("\nOrden 2: ");
        orden2.mostrarOrden();
        
        //Tarea: Crear más objetos de tipo Producto(10) y tipo Orden(2).
    }
}
