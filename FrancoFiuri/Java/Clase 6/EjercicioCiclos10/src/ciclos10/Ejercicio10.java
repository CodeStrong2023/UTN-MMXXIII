/*
Ejercicio 10: Pedir 10 números y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
 */
package ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
     public static void main(String[] args) {
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){   //(iniciar iterador; condicion; incremento)
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "\nLa suma de todos los numeros ingresados es: "+suma);
        
    }
}
