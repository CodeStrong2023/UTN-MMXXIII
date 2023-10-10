/*MODULO: Menu Principal--------------------------------------------------------------------------------------------------------menu principal */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 234242; // Inicialización con un valor fuera de rango para iniciar el menú
        
        while (opcion != 0) {
 
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Comprar por local");
            System.out.println("2 - Comprar por categoría");
            System.out.println("3 - Perfil de Usuario");
            System.out.println("0 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            if (opcion < 4) {
                switch (opcion) {
                    case 1:
                       System.out.println("1 - Comprar por local");
                        break;
                    case 2:
                        System.out.println("1 - Comprar por local");
                        break;
                    case 3:
                        System.out.println("1 - Comprar por local");
                        break;
                    case 0:
                        System.out.println("1 - Comprar por local");
                        break;
                    default:
                        break;
                }
            } else {
    
                System.out.println("\nOpción incorrecta. Vuelva a elegir.\n");
            }
        }
    }
}

