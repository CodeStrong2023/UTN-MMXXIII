package Menus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class MenuUI {

    Map<String, String> menuUI = new HashMap<String, String>() {{
        put("tituloMenu", "=== Menú ===");
        put("opcionSalir", "0 - Salir");
        put("solicitarOpcion", "Ingrese una opción: ");
        put("mensajeDespedida", "Saliendo del programa. ¡Hasta luego!");
        put("mensajeError", "Opción no válida. Intente de nuevo.");
    }};;


    public void mostrarMenu(Map<String, String> menu, Consumer[] metodos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuUI.get("tituloMenu"));

        //recorrer el Map menu ingresado por parametros para mostrar sus opciones
        for (Map.Entry<String, String> entry : menu.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println(menuUI.get("opcionSalir"));
        System.out.print(menuUI.get("solicitarOpcion"));

        //Leer opcion
        int opcion = scanner.nextInt();
        //Ejecutar metodo asociado a la opcion elegida
        if (opcion == 0) {
        salir(scanner);
        } else if (opcion > 0 && opcion <= menu.size()) {
            metodos[opcion - 1].accept(null);
       } else {
           System.out.println(menuUI.get("mensajeError"));
       }
    }
    public void mostrarMenu(List<String> menu, Consumer[] metodos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuUI.get("tituloMenu"));

        //recorrer el Map menu ingresado por parametros para mostrar sus opciones
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

        System.out.println(menuUI.get("opcionSalir"));
        System.out.print(menuUI.get("solicitarOpcion"));

        //Leer opcion
        int opcion = scanner.nextInt();
        //Ejecutar metodo asociado a la opcion elegida
        if (opcion == 0) {
            salir(scanner);
        } else if (opcion > 0 && opcion <= menu.size()) {
            metodos[opcion - 1].accept(null);
        } else {
            System.out.println(menuUI.get("mensajeError"));
        }
        scanner.close();
    }
    public void mostrarMenu(List<String> menu, List<Consumer<String>> metodos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuUI.get("tituloMenu"));

        //recorrer el Map menu ingresado por parametros para mostrar sus opciones
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

        System.out.println(menuUI.get("opcionSalir"));
        System.out.print(menuUI.get("solicitarOpcion"));

        //Leer opcion
        int opcion = scanner.nextInt();
        //Ejecutar metodo asociado a la opcion elegida
        if (opcion == 0) {
            salir(scanner);
        } else if (opcion > 0 && opcion <= menu.size()) {
            metodos.get(opcion - 1).accept(null);
        } else {
            System.out.println(menuUI.get("mensajeError"));
        }
        scanner.close();
    }

    public void mostrarMenu(Map<String, String> menu, List<Consumer<String>> metodos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuUI.get("tituloMenu"));

        //recorrer el Map menu ingresado por parametros para mostrar sus opciones
        for (Map.Entry<String, String> entry : menu.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println(menuUI.get("opcionSalir"));
        System.out.print(menuUI.get("solicitarOpcion"));

        //Leer opcion
        int opcion = scanner.nextInt();
        //Ejecutar metodo asociado a la opcion elegida
        if (opcion == 0) {
            salir(scanner);
        } else if (opcion > 0 && opcion <= menu.size()) {
            metodos.get(opcion - 1).accept(null);
        } else {
            System.out.println(menuUI.get("mensajeError"));
        }
    }

    private void salir(Scanner scanner) {
        System.out.println(menuUI.get("mensajeDespedida"));

    }


}
