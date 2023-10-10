/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo.
*/
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); //con la clase JOptionPane ahorramos lineas de codigo y utilizamos una ventana emergente
        while(numero >= 0){ //Mientras el nùmero sea igual a cero o positivo.
            cuadrado = (int)Math.pow(numero, 2); //formula para elevar un numero al cuadrado.
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa a finalizado por número negativo");
    }
}
