/*/MODULO: Menu Principal-------------------------------------------/*/
package MenuPrincipal;
import java.util.Scanner;

public class MenuPrincipal {
    public Scanner scanner;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        System.out.println("=== Menu Principal ===");
        System.out.println("1 - Comprar por local");
        System.out.println("2 - Comprar por categoría");
        System.out.println("3 - Opciones de Usuario");
        System.out.println("0 - Salir");

        System.out.println("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                menuLocal();
                break;
            case 2:
                menuCategoria();
                break;
            case 3:
                menuUsuario();
                break;
            case 0:
                salir();
                break;
            default:
                System.out.println("Opción incorrecta. Vuelva a elegir.");
                menuPrincipal();
                break;
        }
    }

    private void menuLocal() {



    }

    private void menuCategoria() {
    }

    private void menuUsuario() {
        // Implementa la lógica para el menú de Opciones de Usuario aquí
    }

    private void salir() {
        System.out.println("Saliendo del programa. ¡Hasta luego!");
        scanner.close();
    }


}