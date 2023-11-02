/*/MODULO: Menu Principal-------------------------------------------/*/
package Menus;
import CompraPorLocal.FiltroMenuLocal;

import java.util.*;
import java.util.function.Consumer;

public class MenuPrincipal {
    Consumer<String>[] opciones;
    FiltroMenuLocal menu = new FiltroMenuLocal();

    MenuDeCategorias menuDeCategorias = new MenuDeCategorias(this);
    MenuLogin menuLogin = new MenuLogin(this);

    public String procedencia = "MP";


    Map<String, String> menuPrincipal = new HashMap<String, String>() {{
        put("1", "1 - Comprar por local");
        put("2", "2 - Comprar por categoría");
        put("3", "3 - Opciones de Usuario");
    }};


    public Consumer[] metodosMenuPrincipal() {
        opciones = new Consumer[]{
                opcion -> menu.mostrarLocal(),         // Opción 1
                opcion -> menuDeCategorias.menuDeCategorias(),      // Opción 2
                opcion -> menuLogin.menuLogin(procedencia)             // Opción 3
        };
        return opciones;
    }

    public void menuPrincipal() {
        MenuUI menu = new MenuUI();
        menu.mostrarMenu(menuPrincipal, metodosMenuPrincipal());
    }
    public void menuPrincipal(MenuLogin menuLogin) {
        this.menuLogin = menuLogin;
        menuPrincipal();
    }
}
