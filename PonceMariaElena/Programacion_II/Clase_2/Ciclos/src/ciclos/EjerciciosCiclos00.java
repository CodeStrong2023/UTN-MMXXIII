package ciclos;

public class EjerciciosCiclos00 {
    public static void main(String[] args) {
        var conteo = 0; //inferencia de tipos
        while(conteo<3){//evalua la condicion y luego se ejecuta
            System.out.println("Conteo = "+conteo);
            conteo++;//incrementando en uno la variable
    }
        //do while
        var contador = 0;
        do{//se ejecuta una vez antes de evaluar la condicion
            System.out.println("Contador = "+contador);
            conteo++;//incrementando en uno la variable
        }while(contador<=7);

        //ciclo for
        for(var contando = 0;contando<7;contando++){
            System.out.println("Contando = "+contando);
        }
        
        //break
         for(var contando = 0;contando<7;contando++){
             if(contando % 2 ==0){//pares
                System.out.println("Contando = "+contando);
                break;//corta el ciclo y sale
            }
        }
    //continue
         for(var contando = 0;contando<7;contando++){
             if(contando % 2 !=0){//impares
                continue; //vamos a la siguiente iteracion
            }
             System.out.println("Contando = "+contando);
         }
         
         
         //labels
         //se usan despues de continue y break para ir a un lugar especifico
         //no es recomendable usarlo  porque puede romper la logica
         //programacion go to
         inicio:
         for(var contando = 0;contando<7;contando++){
             if(contando % 2 !=0){//impares
                break inicio; //rompe ciclo y va a la etiqueta inicio
            }
             System.out.println("Contando = "+contando);
         }
         
    }
}
