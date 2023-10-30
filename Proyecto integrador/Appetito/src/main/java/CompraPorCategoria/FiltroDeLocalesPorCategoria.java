
package CompraPorCategoria;

import BaseDeDatos.BaseDatos;
import BaseDeDatos.ListaCategorias;
import CompraPorLocal.FiltroMenuLocal;
import Menus.MenuLocal;
import Menus.MenuUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class FiltroDeLocalesPorCategoria {
    MenuLocal mostrarMenu = new MenuLocal();
    List<String> localesXCategoria = new ArrayList<>();
    List<String> ids = new ArrayList<>();
    Consumer<String>[] opciones;


    public List<String> filtrarLocalesPorCategoria(Integer opcion, ListaCategorias listaCategorias) {
        BaseDatos baseDatos = new BaseDatos();

        String categoriaElegida = listaCategorias.listaC.get(opcion);
        String index = null;

        //recorrer todas las categorias de cada local y devolverlas
        for (int i = 1; i <= baseDatos.getListaLocales().size(); i++) {
            for (int j = 0; j < baseDatos.getLocales(i).getCategoria().size(); j++) {
                if (baseDatos.getLocales(i).getCategoria().get(j) == categoriaElegida) {
                    index = localesXCategoria.size() + 1 + "";
                    String aux = index + " - " + baseDatos.getLocales(i).getNombre();
                    String id = String.valueOf(baseDatos.getLocales(i).getId());
                    localesXCategoria.add(aux);
                    ids.add(id);
                }
            }
        }

        return localesXCategoria;
    }

    public Consumer<String>[] metodosFiltroCategorias( List<String> ids) {

        List<Consumer<String>> listaConsumers = new ArrayList<>(); // Lista de Consumers

        for (int i = 0; i < localesXCategoria.size(); i++) {
            int index = i;
            Integer local = Integer.parseInt(ids.get(index));

            listaConsumers.add(opcion -> mostrarMenu.mostrarMenu(local));
        }
        System.out.println(ids);
        listaConsumers.add(opcion -> System.out.println("lala"));

        opciones = listaConsumers.toArray(new Consumer[0]); // Convertir la lista a un array

        return opciones;
    }

    public void filtroDeLocalesPorCategoria(Integer opcion, ListaCategorias listaCategorias) {
        filtrarLocalesPorCategoria(opcion, listaCategorias);
        metodosFiltroCategorias(ids);
        MenuUI menu = new MenuUI();
        menu.mostrarMenu(localesXCategoria, opciones);

    }

}
