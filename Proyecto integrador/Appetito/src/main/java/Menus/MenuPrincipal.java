/*/MODULO: Menu Principal-------------------------------------------/*/
package Menus;
import java.util.*;
import java.util.function.Consumer;

public class MenuPrincipal {
    Consumer<String>[] opciones;
    MenuLocales menuLocales = new MenuLocales();
    MenuDeCategorias menuCategorias = new MenuDeCategorias(this);
    MenuLogin menuLogin = new MenuLogin();

    Map<String, String> menuPrincipal = new HashMap<String, String>() {{
        put("1", "1 - Comprar por local");
        put("2", "2 - Comprar por categoría");
        put("3", "3 - Opciones de Usuario");
    }};

    public Consumer[] metodosMenuPrincipal() {
        opciones = new Consumer[]{
                opcion -> menuLocales.menuLocales(),         // Opción 1
                opcion -> menuCategorias.menuCategorias(),      // Opción 2
                opcion -> menuLogin.menuLogin()             // Opción 3
        };
        return opciones;
    }

    public void menuPrincipal() {
        MenuUI menu = new MenuUI();
        menu.mostrarMenu(menuPrincipal, metodosMenuPrincipal());

    }
}
