
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


}
