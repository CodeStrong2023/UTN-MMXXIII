//Clase para mostrar el listado de Locales y metodo para elegir uno de ellos.
package CompraPorLocal;

import BaseDeDatos.BaseDatos;
import Menus.MenuLocal;
import java.util.Scanner;


public class FiltroMenuLocal {  
    Scanner entrada = new Scanner (System.in);
    BaseDatos base = new BaseDatos();
    MenuLocal mostrarMenu = new MenuLocal();    //instanciamos la clase MenuLocal para utilizarla en el metodo
    // elegirLocal.
    public void mostrarLocal() {   //mostrar en pantalla el listado de locales.
        for (int i = 0; base.getListaLocales().size()> i; i++){
            System.out.println((i+1)+" "+base.getListaLocales().get(i));
        }
        elegirLocal();
    }
    public void elegirLocal(){   //eleccion del local
        System.out.println("¡Elija su local de preferencia!: ");
        int eleccionLocal = Integer.parseInt(entrada.nextLine());
        if (eleccionLocal >= 1 && eleccionLocal <=10){
            mostrarMenu.mostrarMenu(eleccionLocal);
        }
        else{
            System.out.println("Numero de local erroneo, vuelva a ingresar.");
            elegirLocal();
        }
    }
}
