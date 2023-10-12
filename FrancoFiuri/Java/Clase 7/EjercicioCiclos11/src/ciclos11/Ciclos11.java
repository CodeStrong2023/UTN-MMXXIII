/*
Ejercicio 11: Diseñar un programa que muestre el producto
de los 10 primeros numeros impares
Hacerlo con JOptionPane
 */
package ciclos11;

import javax.swing.JOptionPane;


public class Ciclos11 {
    public static void main(String[] args) {
/*          EJERCICIO DE MULTIPLICAR LOS VALORES INGRESADOR PARES UNICAMENTE.
        int numero, suma = 1;
        for( int i = 1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                    if (numero % 2 == 0){
                        suma *= numero;
                    }
        }
        JOptionPane.showMessageDialog(null, "\nLa suma de todos los numeros ingresados es: "+suma);
*/  
        long producto = 1;
        for(int i = 1; i<=20;i+=2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "\nLa suma de todos los numeros ingresados es: "+producto);
    }
}
