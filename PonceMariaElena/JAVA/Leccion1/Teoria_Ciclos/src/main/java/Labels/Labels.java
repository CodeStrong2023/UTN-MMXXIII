package Labels;

public class Labels {
    /*
     * Labels: Se utilizan para identificar un bloque de codigo. Se utilizan con break y continue
     * Programacion de tipo go to
     * Puede romper la logica del programa
     */
    public void labels() {
        
        //imprimir los numeros pares
        System.out.println("Break and Continue");
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break; 
            }
        }

        inicioContinue:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue inicioContinue; //va a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
    }
}
