/*Proyecto caja:
Ejercicio 1: Crear un proyecto segyn las especificaciones mostradas a continuacion.
La formula es: volumen = ancho * alto * profundidad*/

package caja;

public class PruebaCaja {
    public static void main(String[] args) { //main
        //variables locales
        int medidaAncho =  3; //valores ingresados en codigo
        int medidaAlto =  2;
        int medidaProf = 6;
        
        Caja caja1 = new Caja(); //instanciar objeto constructor vacio
        caja1.ancho = medidaAncho; //pasar valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProf;
        
        int resultado = caja1.calcularVolumen(); //llamar metodo
        
        //primer resultado
        System.out.println("Resultado volumen de caja 1: "+ resultado);
        
        Caja caja2 = new Caja(2,4,6); //constructor 2 con argumentos
        //llamar nuevo objeto al metodo
        System.out.println("Resultado volumen de caja 2: "+ caja2.calcularVolumen());
    }
    
}
