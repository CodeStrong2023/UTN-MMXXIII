package Menus;

import BaseDeDatos.BaseDatos;
import BaseDeDatos.Producto;
import Carrito.Carrito;
import static Utilidades.LimpiarPantalla.limpiarPantalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuLocal {
    private List<Producto> arrayCarrito;  // Lista de productos del local
    Scanner entrada = new Scanner(System.in);
    BaseDatos base = new BaseDatos();
    int contadorProducto = -1;

    //Constructor
    public MenuLocal() {
        this.arrayCarrito = new ArrayList<>();
    }

    //Metodos de funcionalidad.
    public void mostrarMenu(int eleccionLocal) { //Muestra en pantalla el menu del local elegido
        limpiarPantalla();
        System.out.println("-------*********      " + base.getListaLocales().get(eleccionLocal - 1) + "     ********------------");
        for (int j = 1; j < 6; j++) {
            System.out.println(j+"-"+base.getLocales(eleccionLocal).getProductos().get(j).getNombre());
            System.out.println("$ "+base.getLocales(eleccionLocal).getProductos().get(j).getPrecio());
            System.out.println("Descripcion: "+base.getLocales(eleccionLocal).getProductos().get(j).getDescripcion());
            System.out.println("Stock: "+base.getLocales(eleccionLocal).getProductos().get(j).getStock());
            System.out.println("----------------------------------");
        }
        eleccionProducto(eleccionLocal);
    }

        public void eleccionProducto ( int eleccionLocal){ //Metodo para elegir un procduto de la lista.
            System.out.println("Elija un producto: ");
            int eleccionProducto = Integer.parseInt(entrada.nextLine());
            if (eleccionProducto >= 1 && eleccionProducto <= base.getLocales(eleccionLocal).getProductos().size()) {
                agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto)); //se agrega el producto al array "agregarProducto".
                contadorProducto++; //Se suma el contador de producto para poder separar los productos elegidos.
            } else {
                System.out.println("Elija un producto correcto: ");
                eleccionProducto(eleccionLocal);
            }
            cantidad(eleccionProducto, eleccionLocal);
        }

        public void cantidad ( int eleccionProducto, int eleccionLocal){  //Metodo para elegir la cantidad del producto.
            System.out.println("Elija la cantidad: ");
            int eleccionCantidad = Integer.parseInt(entrada.nextLine());
            if (eleccionCantidad <= base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()) { //Si la cantidad elegida es menor a la cantidad que hay en stock
                arrayCarrito.get(contadorProducto).setCantidad(eleccionCantidad); //se agrega la cantidad al array "agregarProducto"
                base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).setStock(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock() - eleccionCantidad); //se resta la cantidad elegida al stock.
            } else {
                System.out.println("La cantidad elegida sobrepasa el stock, por favor vuelva a ingresar una cantidad menor: ");
                cantidad(eleccionProducto, eleccionLocal);
            }
            agregarMasProducto(eleccionLocal);
        }

        public void agregarMasProducto ( int eleccionLocal){
            System.out.println("Desea agregar otro producto? 1(SI) o 2(No)");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    mostrarMenu(eleccionLocal);
                    break;
                case 2:
                    limpiarPantalla();
                    Carrito carrito = new Carrito(arrayCarrito, base.getLocales(eleccionLocal).getNombre());
                    carrito.CarritoDeCompras();
                    break;
                default:
                    System.out.println("Opción no válida");
                    agregarMasProducto(eleccionLocal);
                    break;
            }
        }


        //array con la eleccion del producto.
        public void agregarProducto (Producto eleccionProducto){
            arrayCarrito.add(eleccionProducto);
        }

}