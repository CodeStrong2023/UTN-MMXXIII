package Operaciones;


public class PruebaAritmetica {
    // CLASE 5 Clase Aritmetica: Creamos un objeto
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(); // constructor vacio
        // aritmetica1.a = 3;
        // aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        // Clase Aritmética: Creamos un método, recorremos con Debbug
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado con retorno: " + resultado);
        // Un método llamando a otro método
        int resultado2 = aritmetica1.sumarConArgumentos(3, 7);
        System.out.println("Resultado con argumentos: " + resultado2);

        // constructor con argumentos
        //Aritmetica aritmetica2 = new Aritmetica(5, 8);
        //System.out.println("Resultado con argumentos: " + aritmetica2.sumarConArgumentos(a, b));
    }

    // CLASE 6 ALCANCE DE LAS VARIABLES

    public static void miMetodo() {
        // No se puede acceder a los atributos de la clase Aritmetica
        // System.out.println("a = " + a);
    }
}
