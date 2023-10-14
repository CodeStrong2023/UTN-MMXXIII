
package CompraPorCategoria;

import BaseDeDatos.BaseDatos;
import BaseDeDatos.ListaCategorias;
import Menus.MenuUI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FiltroDeLocalesPorCategoria {

    MenuUI menuUI = new MenuUI();
    List<String> localesXCategoria = new ArrayList<>();
    List<Consumer<String>> opciones = new ArrayList<>();

    public List<String> filtrarLocalesPorCategoria(Integer opcion, ListaCategorias listaCategorias) {
        BaseDatos baseDatos = new BaseDatos();
        //devolver listaCategorias[opcion]
        String categoriaElegida = listaCategorias.listaC.get(opcion);
        String index = null;

        //recorrer todas las categorias de cada local y devolverlas
        for (int i = 1; i <= baseDatos.getListaLocales().size(); i++) {
            for (int j = 0; j < baseDatos.getLocales(i).getCategoria().size(); j++) {
                if (baseDatos.getLocales(i).getCategoria().get(j) == categoriaElegida) {
                    index = localesXCategoria.size() + 1 + "";
                    String aux = index + " - " + baseDatos.getLocales(i).getNombre();
                    localesXCategoria.add(aux);
                    System.out.println(aux);
                }
            }
        }

        return localesXCategoria;
    }


    public List<Consumer<String>> metodosFiltroCategorias() {

        //  ACA VA EL METODO QUE TIENE QUE ARMAR FRANCO PARA QUE LLEVE AL LOCAL

        return opciones;
    }
        public void filtroDeLocalesPorCategoria() {
            metodosFiltroCategorias();
            MenuUI menu = new MenuUI();
            menu.mostrarMenu(localesXCategoria, opciones);
        }

    }
