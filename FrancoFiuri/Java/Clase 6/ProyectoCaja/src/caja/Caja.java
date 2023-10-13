/*
Proyecto caja:
Ejercicio 1: Crear un protecto segpun las especificaciones
mostradas a continuación.
La formula es: volumen = ancho * alto * profundidad
 */
package caja;


public class Caja {
    //Atributos(Caracteristicas)
    int ancho;
    int alto;
    int profundo;
    
    //Métodos y constructores(acciones)
    public Caja() { //Constructor 1 = vacio
    }
    //Constructor con parámetros
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    //Método para calcular.
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
}
