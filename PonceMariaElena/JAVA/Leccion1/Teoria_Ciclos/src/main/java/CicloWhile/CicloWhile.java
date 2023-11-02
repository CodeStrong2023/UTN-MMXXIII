
package CicloWhile;

public class CicloWhile {
    /*Tienen que ver con la repeticion por lo que requieren una condicion de detencion hasta que la condicion se cumpla*/
    /*Ciclo While / Hacer */
    public void cicloWhile() {
        var conteo = 0; //inferencia de tipos
        while (conteo <= 7) {
            System.out.println("Contador: " + conteo);
            conteo++; //incrementa uno en uno la variable
        }
        System.out.println("Fin del ciclo while");
    }
}
