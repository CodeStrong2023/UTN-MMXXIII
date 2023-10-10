/*
Establece un temporizador antes de ejecutar una acción.
Alternativa a Thread.sleep(n);
Recomendado porque permite realizar acciones en simultaneo, por lo que es mas fluido a nivel grafico y, ademas, mas flexible.
 */

/*USO:

Temporizador temporizador = new Temporizador(() -> {
            codigo);
            // Aquí puedes colocar cualquier código que desees ejecutar cuando el temporizador termine
        }, 2000);

*/
package Utilidades;


import java.util.Timer;
import java.util.TimerTask;

public class Temporizador {
    private final Runnable codigo;
    private final int milisegundos;

    public Temporizador(Runnable codigo, int milisegundos) {
        this.codigo = codigo;
        this.milisegundos = milisegundos;
    }

    public void iniciar() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                codigo.run();
                timer.cancel(); // Detener el temporizador después de ejecutar el código una vez
            }
        }, milisegundos);
    }
}