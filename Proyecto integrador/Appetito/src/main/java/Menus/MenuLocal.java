/*
	//opcion volver al menu principal
	Escribir "";
	
	Escribir "Elija una de las siguientes opciones: ";
	Escribir "0 - Volver al Menú Principal ";
	Escribir "1 - Volver a ver el menu de Locales ";
	Escribir "2 - Ir al carrito";
	Escribir "3 - Salir";
	
	Leer opcion;
	Segun opcion Hacer
		0:
			Borrar Pantalla;
			menuPrincipal(Usuarios); //se ve de agregar la opcion de volver al menu principal
			
		1:	
			Borrar Pantalla;
			mostrarMenuLocal(Usuarios);
			
		2: 
			Borrar Pantalla;
			carritoDeCompras(arrayCarrito,Usuarios);
			
		3: 
			Escribir " ";
			Escribir "Sesion Finalizada, vuelva pronto!";
			
		De Otro Modo:
			Escribir "Número de opcion erroneo, se cierra la sesion.";
	FinSegun
 */
package Menus;

//tengo que devolver un array list de productos.

import BaseDeDatos.BaseDatos;
import BaseDeDatos.Producto;
import Carrito.Carrito;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MenuLocal {
    private List<Producto> arrayCarrito;  // Lista de productos del local
        Scanner entrada = new Scanner (System.in);
        BaseDatos base = new BaseDatos();
        int contadorProducto = -1;

    public MenuLocal() {
        this.arrayCarrito = new ArrayList<>();
    }
    
    public void mostrarMenu(int eleccionLocal){
        System.out.println("-------*********      " + base.getListaLocales().get(eleccionLocal-1) + "     ********------------");
            for (int j = 1; j < 6; j++) {
                System.out.println(j+"-"+base.getLocales(eleccionLocal).getProductos().get(j).getNombre());
                System.out.println("$ "+base.getLocales(eleccionLocal).getProductos().get(j).getPrecio());
                System.out.println("Descripcion: "+base.getLocales(eleccionLocal).getProductos().get(j).getDescripcion());
                System.out.println("Stock: "+base.getLocales(eleccionLocal).getProductos().get(j).getStock());
                System.out.println("----------------------------------");
            }
        eleccionProducto(eleccionLocal);    
    }
    public void eleccionProducto(int eleccionLocal){
        System.out.println("Elija un producto: ");
        int eleccionProducto = Integer.parseInt(entrada.nextLine()); 
        if (eleccionProducto >= 1 & eleccionProducto <= base.getLocales(eleccionLocal).getProductos().size()){
            agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
            contadorProducto++;
        }
        else {  
            while (eleccionProducto < 0 & eleccionProducto > 8){
                System.out.println("Elija un producto correcto: ");
                eleccionProducto = Integer.parseInt(entrada.nextLine());
                agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
            }
        }

        System.out.println("Elija la cantidad: ");
        int eleccionCantidad = Integer.parseInt(entrada.nextLine());
        while (true){
            if (eleccionCantidad <= base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()){
                arrayCarrito.get(contadorProducto).setCantidad(eleccionCantidad);
                // set stock
                break;
            }
            else {
                System.out.println("La cantidad elegida sobrepasa el stock, por favor vuelva a ingresar una cantidad menor: ");
                eleccionCantidad = Integer.parseInt(entrada.nextLine());
                arrayCarrito.get(eleccionProducto).setCantidad(eleccionCantidad);
            }   
        }
        
        System.out.println("Desea agregar otro producto? (Si o No)");
        int opcion = Integer.parseInt(entrada.nextLine());
        System.out.println(opcion);
        if (opcion == 1) {
            System.out.println("metodo");
        }
        else {
            Carrito carrito = new Carrito(arrayCarrito, base.getLocales(eleccionLocal).getNombre());
            carrito.CarritoDeCompras();
        }
    }        
    //array con la eleccion del producto.
    public void agregarProducto(Producto eleccionProducto) {
        arrayCarrito.add(eleccionProducto);
    }
}