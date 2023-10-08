/*
Toma un String o un Array y determina la longitud del String o la longitud del elemento más largo del array.
 */
package Utilidades;

public class DeterminarLongitud {

    // Método para determinar la longitud del String
    public int determinarLongitud(String cadena) {
        if (cadena != null) {
            return cadena.length();
        } else {
            return 0; // Manejo de cadena nula
        }
    }

    // Método para determinar la longitud del elemento más largo en un arreglo
    public int determinarLongitud(String[] arreglo) {
        int longitudMaxima = 0;
        if (arreglo != null) {
            for (String elemento : arreglo) {
                if (elemento != null && elemento.length() > longitudMaxima) {
                    longitudMaxima = elemento.length();
                }
            }
        }
        return longitudMaxima;
    }
}
