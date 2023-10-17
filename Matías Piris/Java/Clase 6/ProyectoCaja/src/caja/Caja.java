package caja;

public class Caja {
    int Ancho;
    int Alto;
    int Profundo;
    
    // Métodos y constructores (acciones)
    public Caja() { //Constructor 1 = vacio.
    }
    
    //Constructor con parámetros
    public Caja(int Ancho, int Alto, int Profundo){ //Constructor 2
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Profundo = Profundo;
    }
    
    public int CalcularVolumen(){ //Método para calcular
        return Ancho * Alto * Profundo;
    }
}
