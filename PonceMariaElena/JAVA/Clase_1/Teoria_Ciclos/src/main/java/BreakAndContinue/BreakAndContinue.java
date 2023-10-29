package BreakAndContinue;

public class BreakAndContinue {
    /*
     * Break: Rompe el ciclo y continua con la ejecucion del programa
     * Continue: Rompe la iteracion actual y continua con la siguiente iteracion
     */

    public void breakContinue() {
        //imprimir los numeros pares
        System.out.println("Break and Continue");
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break;
            }
        }
        //imprimir los numeros pares
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 != 0) {
                continue; //va a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
    }
}