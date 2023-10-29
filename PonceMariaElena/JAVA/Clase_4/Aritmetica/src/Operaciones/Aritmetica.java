
package Operaciones;


public class Aritmetica {

    //CLASE 4
    //Atributos
    int a, b;
    
    //Metodos
    public void sumarNumeros(){
        int resultado = a+b;
        System.out.println("Resultado: "+resultado);
    }

    //CLASE 5  Clase Aritmetica: Creamos un objeto
        //PruebaAritmetica con main

    // Clase Aritmética: Creamos un método, recorremos con Debbug
    public int sumarConRetorno(){
        //int resultado = a+b;
        return a+b;
    }
    // Paso de argumentos a un método
        //Usar debugger

    //Un método llamando a otro método
    public int sumarConArgumentos(int arg1, int arg2){
            a = arg1;
            b = arg2;
            //return a+b;
            //int resultado = sumarConRetorno();
            //return resultado;
            return sumarConRetorno(); //llamar un metodo de la misma clase
        }

    //Operador this
    public int sumarConArgumentosThis(int arg1, int arg2){
            //apunta al lugar de memoria del objeto que se esta ejecutando
            //dentro de la misma clase se puede omitir el this
            this.a = arg1;
            this.b = arg2;
            //return a+b;
            //int resultado = sumarConRetorno();
            //return resultado;
            return this.sumarConRetorno(); //llamar un metodo de la misma clase
        }
    //CLASE 6
    //6.1 Sobrecarga de CONSTRUCTORES
        //el constructor es un metodo especial que:
        //construye un objeto
        //reservar memoria
        //inicializa los atributos

    public Aritmetica(){//acceso y nombre de clase (Con mayuscula) (no es necesario ponerlo, esta por defecto)
        System.out.println("Ejecutando constructor vacio");

    }
        //sobrecarga: es el mismo constructor solo que con diferentes parametros. Cuando se crea un constructur con parametros es necesario crear el vacio porque el que viene por default no se crea
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }

    //6.2 Alcance de variables
        //variables locales: solo se pueden usar dentro del metodo
        //variables de instancia: se pueden usar en toda la clase
        //variables estaticas: se pueden usar en toda la clase y en otras clases
        //El alcance de los atributos es superior al de una variable local.

    //6.3 Engineer Java: Memoria stack y heap, tratamiento de residuos
    //son clasificaciones de la memoria
        //stack: variables locales, metodos, referencias a objetos
        //heap: objetos, atributos, arreglos, cadenas de caracteres
        //residuos: objetos que no se usan y se quedan en la memoria. no hay que poner null, porque el garbage collector se encarga de eliminarlos
        //System.gc()

    //6.5 POO: Paso por valor

    //6.6 POO: Paso por referencia

    //6.7 Palabras return y null






}
