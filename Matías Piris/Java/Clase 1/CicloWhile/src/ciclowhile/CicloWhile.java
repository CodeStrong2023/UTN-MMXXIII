
package ciclowhile;

public class CicloWhile {

     public static void main(String[] args) {
        var Conteo = 0; //Inferencia de tipos
        while(Conteo < 3){ //El código se ejecuta si cumple primero la condicion.
            System.out.println("Conteo = " + Conteo);
            Conteo++; //Vamos aumentando en uno la variable
        }
        
        var Contador = 0;
        do{
            System.out.println("Contador = " + Contador); 
            Contador++; //Con el cliclo do-while nos aseguramos de que al menos el código se ejecute una vez y luego la condición.
        }while(Contador < 7); //En el do-while, es necesario poner ; en el final del while
        
        
        //Uso de las palabras break y continue junto a las etiquetas (labels)
        Inicio:
        for(var Contando = 0; Contando < 7; Contando++){    //for(declaracion de variable;condicion;incremento/decremento)
            if(Contando % 2 == 0){
                System.out.println("Contando = " + Contando); //En este ciclo no es necesario realizar el incremento dentro del código.
                break Inicio; //Apenas se da una condición rompe el ciclo y no lo deja continuar.
            }
        }
        
        for(var Contando = 0; Contando < 7; Contando++){ //for(declaracion de variable;condicion;incremento/decremento)
            if(Contando % 2 != 0){
                continue; // Vamos a la siguiente iteración.
            }
            System.out.println("Contando = " + Contando);
        }
    }
}
