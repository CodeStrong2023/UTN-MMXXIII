

package caja;

public class Caja {//clase publica caja
    //atributos
    int ancho;
    int alto;
    int profundidad;
    
    //metodos y constructores
    public Caja(){
        //constructor vacio
    }
    //constructor con parametros
    public Caja(int ancho, int alto, int profundidad){
        //Constructor 2
        this.ancho = ancho;
        this.alto =alto;
        this.profundidad = profundidad;
    }
    public int calcularVolumen() {
        //Metodo
        return ancho * alto * profundidad;
    }

    
}
