/*
Funcion para borrar la pantalla en la consola de JAVA - NETBEANS
 */
package Utilidades;

public class LimpiarPantalla {

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/ }
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
    }
}
