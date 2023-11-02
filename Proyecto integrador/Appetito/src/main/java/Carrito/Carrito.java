package Carrito;

import BaseDeDatos.Producto;
import Menus.MenuLogin;
import Menus.MenuPrincipal;
import Utilidades.ConectorLogin;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Carrito {  protected List<Producto> ListaCompra;
    ConectorLogin conector = ConectorLogin.getInstance(null);
    String[][] usuarios = conector.getUsuarios();
    public String local;
    public boolean paso = true;
    MenuPrincipal menuPrincipal;
    public double sumar (List<Producto> ListaPrueba){
        double total=0;
        for (int i= 0; i<ListaPrueba.size();i++){total+=ListaPrueba.get(i).getPrecio()*ListaCompra.get(i).getCantidad();}
        return total;
    }

    public String llenarEspacio(String texto, int espacios){
        String textoMasEspacio = texto;
        for(int i=texto.length();i<espacios;i++){ textoMasEspacio += " ";}
        return textoMasEspacio;
    }

    public void mostrarCarrito(){
        String linea = "+--------+----------------------------------+---------+------------+";

        //cabezera
        System.out.println(linea);
        System.out.println("|                "+ llenarEspacio(local,50) +"|");
        System.out.println(linea);
        System.out.println("| NºItem |        Item                      |Cantidad | Precio     |");
        System.out.println(linea);

        for (int i=0;i<ListaCompra.size();i++){
            if (ListaCompra.get(i).getCantidad()>0) {
                System.out.print("|    " + llenarEspacio(Integer.toString(i + 1), 2) + "  |");
                System.out.print("   " + llenarEspacio(ListaCompra.get(i).getNombre(), 31) + "|");
                System.out.print(" " + llenarEspacio(Integer.toString(ListaCompra.get(i).getCantidad()), 8) + "|");
                System.out.print("  " + llenarEspacio(Double.toString(ListaCompra.get(i).getPrecio()*ListaCompra.get(i).getCantidad()), 10) + "|");
                System.out.println(" ");
            }
        }sumar(ListaCompra);
        System.out.println(linea);
        System.out.println("|                                           | Total   | $" +     llenarEspacio(Double.toString(sumar(ListaCompra)),10 )  +"|");
        System.out.println(linea);


        if (paso){
            System.out.println(" ");
            MenuCarrito();
        }

    }

    public void eliminarDeCarrito() {
        Scanner scanner = new Scanner(System.in);

        if (ListaCompra.isEmpty()) {
            System.out.println("Ya no quedan elementos que eliminar.");
            System.out.println("Gracias por usar esta app.");
            return;
        }

        System.out.println("Ingrese el número de item a eliminar: ");
        int borrar = scanner.nextInt();

        if (borrar > 0 && borrar <= ListaCompra.size()) {
            ListaCompra.remove(borrar - 1);
            mostrarCarrito();
        } else {
            System.out.println("El número ingresado no corresponde a un ítem válido. Intente de nuevo.");
        }

        System.out.println("¿Desea eliminar otro ítem?");
        System.out.println("Escriba 1 para 'SI' y 2 para 'NO'");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            eliminarDeCarrito();
        } else if (opcion == 2) {
            mostrarCarrito();
        } else {
            System.out.println("Ha elegido una opción no válida. Se le redirige nuevamente al menú del carrito.");
            eliminarDeCarrito();
        }
        scanner.close();
    }

    public void CambiarCantidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de item a cambiar cantidad: ");
        int producto = scanner.nextInt();

        if (producto >= 0 && producto <= ListaCompra.size()) {
            System.out.println("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();
            if (cantidad<=ListaCompra.get(producto-1).getStock() && cantidad>=0){
                ListaCompra.get(producto-1).setCantidad(cantidad);
                System.out.println("La cantidad ha sido cambiada");
                mostrarCarrito();
            }else {
                System.out.println("No disponemos de esa cantidad de productos, actualmente hay: " +ListaCompra.get(producto-1).getStock()+ "productos en stock");
                CambiarCantidad();
            }
        } else {
            System.out.println("El número ingresado no corresponde a un ítem válido. Intente de nuevo.");
            CambiarCantidad();
        }
        scanner.close();
    }


    public void MenuCarrito(){
        String procedencia = "CC";
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Finalizar Compra ===");
        System.out.println("1 - Confirmar pedido.");
        System.out.println("2 - Eliminar un producto.");
        System.out.println("3 - Cambiar la cantidad de un product o.");
        System.out.println("4 - Salir de la aplicación.");
        System.out.println("Ingrese una opción: ");

        opcion=scanner.nextInt();

        switch (opcion) {
            case (1) -> {
                if (usuarios != null) {
                    paso = false;
                    FinalizarCompra finalizarCompra = new FinalizarCompra(this);
                    FinalizarCompra.imprimir(local, ListaCompra);
                } else {
                    paso = false;
                    MenuLogin menuLogin = new MenuLogin(this);
                    System.out.println("Debe iniciar sesion para confirmar su compra");
                    menuLogin.menuLogin(procedencia);
                }
            }
            case (2) -> eliminarDeCarrito();
            case (3) -> CambiarCantidad();
            case (4) -> System.out.println("gracias por usar la aplicacion");
        }
        scanner.close();
    }



    public Carrito(List<Producto> ListaPrueba, String Nlocal) {
        this.ListaCompra = ListaPrueba;
        this.local = Nlocal;
    }

    public void CarritoDeCompras (){
        mostrarCarrito();

    }

    public List<Producto> getListaCompra() {
        return ListaCompra;
    }
}
//esto es una prueba
