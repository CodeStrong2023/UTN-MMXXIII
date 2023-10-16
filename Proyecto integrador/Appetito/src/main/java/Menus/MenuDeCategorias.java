package Menus;

import BaseDeDatos.BaseDatos;
import BaseDeDatos.ListaCategorias;
import CompraPorCategoria.FiltroDeLocalesPorCategoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MenuDeCategorias {
    Consumer<String>[] opciones;

    ListaCategorias listaCategorias = new ListaCategorias();
    Map<String, String> menuCategorias = new HashMap<String, String>();
    MenuPrincipal menuPrincipal;
    List<String> localesXCategoria = new ArrayList<>();
    FiltroDeLocalesPorCategoria filtroDeLocalesPorCategoria = new FiltroDeLocalesPorCategoria();

    public  Map<String, String> construirLista( ListaCategorias listaCategorias){
        String key = null;
        for (int i = 0; i < listaCategorias.listaC.size(); i++) {

            key = Integer.toString(i+1);
            menuCategorias.put(key, key+" - "+ listaCategorias.listaC.get(i));
        }
        key = (Integer.parseInt(key)+1)+"";
        menuCategorias.put("opcionVolver", key +" - "+"Volver al Menú Principal");
        return menuCategorias;
    }


    public Consumer[] metodosMenuCategorias() {
         opciones = new Consumer[]{
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(0, listaCategorias),         // Opción 1
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(1, listaCategorias),      // Opción 2
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(2, listaCategorias),
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(3, listaCategorias),
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(4, listaCategorias),
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(5, listaCategorias),
             opcion -> filtroDeLocalesPorCategoria.filtrarLocalesPorCategoria(6, listaCategorias),
             opcion -> volverAlMenuPrincipal() // Opción 10
         };
         return opciones;
         }

    public MenuDeCategorias(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }
    public void volverAlMenuPrincipal() {
        menuPrincipal.menuPrincipal(); // Llama al menú principal
    }


public void menuCategorias() {
    construirLista(listaCategorias);

    MenuUI menu = new MenuUI();
    menu.mostrarMenu(menuCategorias, metodosMenuCategorias());

}


}
