
package CicloDoWhile;

public class CicloDoWhile {
    /*
     * Hacer mientras. Primero se ejecuta una vez y luego evalua la condicion. POR
     * LO QUE AL menos siempre se ejecuta
     */

    public void cicloDoWhile() {
        var conteo = 0;
        do {
            System.out.println("conteo = " + conteo);
            conteo++;
        } while (conteo < 7);
    }
}
