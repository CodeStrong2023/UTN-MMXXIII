package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var A = 10; //Variables locales.
        int B = 7; //Memoria stack.
        MiMetodo(); //Llamamos al nuevo metodo.
        Aritmetica Aritmetica1 = new Aritmetica();
        Aritmetica1.A = 3;
        Aritmetica1.B = 7;
        Aritmetica1.SumarNumeros();
        
        //Para almacenar un objeto o los atributos se utiliza la memoria heap.
        int Resultado = Aritmetica1.SumarConRetorno();
        System.out.println("Resultado = " + Resultado);
        
        Resultado = Aritmetica1.SumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: " + Resultado);
        
        System.out.println("Aritmetica1 A: " + Aritmetica1.A);
        System.out.println("Aritmetica1 B: " + Aritmetica1.B);
        
        Aritmetica Aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2 = " + Aritmetica2.A);
        System.out.println("Aritmetica2 = " + Aritmetica2.B);
        //aritmetica1 = null; - NUNCA UTILIZAR ESTO.
        //System.gc(); - Método para limpiar residuos. Muy pesado, no utilizar.
        
        Persona persona = new Persona("Matias", "Piris");
        System.out.println("Persona = " + persona); //Mostramos el espacio de memoria.
        System.out.println("Persona nombre: " + persona.Nombre);
        System.out.println("Persona apellido: " + persona.Apellido);
    }
    //Modularidad creamos un nuevo método.
    public static void MiMetodo(){
        //A = 10; - Una variable está limitada.
        System.out.println("Aqui hay un método");
    }
}
//Cramos una nueva clase
class Persona{
    String Nombre;
    String Apellido;
    
    Persona(String nombre, String apellido){ //Constructor.
        super();//Llamada al constructor de la clase Padre object.
        //Imprimir imprimir = new Imprimir();
        this.Nombre = nombre;
        this.Apellido = apellido;
        new Imprimir().imprimir(this);
        System.out.println("Objeto persona usando this: " + this);
    }
}

class Imprimir{
    public Imprimir(){
        super();    //El constructor de la clase padre, para reservar memoria.
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}
