package Menus;

import BaseDeDatos.ListaCategorias;
import CompraPorCategoria.FiltroDeLocalesPorCategoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MenuDeCategorias {
    ListaCategorias listaCategorias = new ListaCategorias();
    Map<String, String> menuCategorias = new HashMap<String, String>();
    MenuPrincipal menuPrincipal;
    private FiltroDeLocalesPorCategoria filtroDeLocalesPorCategoria;

    private Consumer<String>[] opciones;

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


    public Consumer<String>[] metodosMenuCategorias() {
        filtroDeLocalesPorCategoria = new FiltroDeLocalesPorCategoria();


        List<Consumer<String>> listaConsumidores = new ArrayList<>(); // Lista de Consumers

        for (int i = 0; i < menuCategorias.size(); i++) {
            int index = i;
            listaConsumidores.add(opcion -> filtroDeLocalesPorCategoria.filtroDeLocalesPorCategoria(index,
                    listaCategorias));
        }

        listaConsumidores.add(opcion -> volverAlMenuPrincipal());

        opciones = listaConsumidores.toArray(new Consumer[0]); // Convertir la lista a un array

        return opciones;
    }

    public MenuDeCategorias(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }
    public void volverAlMenuPrincipal() {
        menuPrincipal.menuPrincipal(); // Llama al menú principal
    }


    public void menuDeCategorias() {
        construirLista(listaCategorias);

        MenuUI menu = new MenuUI();
        menu.mostrarMenu(menuCategorias, metodosMenuCategorias());

    }

}
