
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while(conteo < 3){ //el codigo se ejecuta si cumple primero la condicion.
            System.out.println("conteo = " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }
        
        var contador = 0;
        do{
            System.out.println("contador = " + contador); 
            contador++; // con el cliclo dowhile nos aseguramos de que al menos el codigo se ejecute una vez y luego la condicion.
        }while(contador < 7); //en el dowhile es necesario poner ; en el final del while
        
        // Uso de las palabras break y continue junto a las etiquetas (labels)
        inicio:
        for(var contando = 0; contando < 7; contando++){    //for(declaracion de variable;condicion;incremento/decremento)
            if(contando % 2 == 0){
                System.out.println("contando = " + contando); //en este ciclo no es necesario realizar el incremento dentro del codigo.
                break inicio; //apenas se da una condicion rompe el ciclo y no lo deja continuar.
            }
        }
        
        for(var contando = 0; contando < 7; contando++){    //for(declaracion de variable;condicion;incremento/decremento)
            if(contando % 2 != 0){
                continue; // Vamos a la siguiente iteracion.
            }
            System.out.println("contando = " + contando);
        }
    }
}
