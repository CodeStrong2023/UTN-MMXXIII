package Carrito;

import BaseDeDatos.Producto;
import Menus.MenuLogin;
import Utilidades.ConectorLogin;


import java.util.List;

public class FinalizarCompra {

    private MenuLogin menuLogin;
    private static Carrito carrito;

    public FinalizarCompra() {

    }
    public static void imprimir(String Local, List<Producto> arrayCarrito){
        ConectorLogin conector = ConectorLogin.getInstance(null);
        String[][] usuarios = conector.getUsuarios();
        String local = Local;
        String linea = "+--------+----------------------------------+---------+------------+";
        System.out.println(linea);
        System.out.println("|   Nombre de Usuario  "+  llenarEspacio(usuarios[0][1], 44)+"|");
        System.out.println(linea);
        if (usuarios[0][1]=="admin"){
            System.out.println("|   Dirección  "+ llenarEspacio(usuarios[9][1], 52)+"|");
            carrito.mostrarCarrito();
            System.out.println("| Medio de pago  "+ llenarEspacio(usuarios[8][1], 50)+"|");
            System.out.println(linea);
            System.out.println("|                                           | Total   | $" + llenarEspacio(Double.toString(carrito.sumar(arrayCarrito)),10 )  +"|");
            System.out.println(linea);
        }else {
            System.out.println("|   Dirección  "+ llenarEspacio(usuarios[3][1], 54)+"|");
            carrito.mostrarCarrito();
            System.out.println("| Medio de pago  "+ llenarEspacio(usuarios[2][1], 50)+"|");
            System.out.println(linea);
            System.out.println("|                                           | Total   | $" + llenarEspacio(Double.toString(carrito.sumar(arrayCarrito)),10 )  +"|");
            System.out.println(linea);
        }
        System.out.println(" ");
        System.out.println("          Gracias por su compra");
    }

    public static String llenarEspacio(String texto, int espacios){
        String textoMasEspacio = texto;
        for(int i=texto.length();i<espacios;i++){ textoMasEspacio += " ";}
        return textoMasEspacio;
    }

    public FinalizarCompra(Carrito carrito){
        this.carrito = carrito;
    }
    public FinalizarCompra(Carrito carrito, MenuLogin menuLogin){
        this.carrito = carrito;
        this.menuLogin = menuLogin;
    }



}
