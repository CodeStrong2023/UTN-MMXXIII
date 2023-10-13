/*//Modulo: Pantalla de Inicio ---------------------------------------------------------------------------------------------------
// Presentacion de App
// nombre:AppEtito; slogan: Tu App de comidas!
// Mostrar Bienvenida al usuario
// Dar paso a Pantalla de Login/Registro */
package AnimacionDeInicio;
import Utilidades.LimpiarPantalla;


public class AnimacionDeInicio {

    public AnimacionDeInicio() {

    }

    public void iniciarApp() throws InterruptedException {

        //Mostrar logo
        ImprimirLogo ImprimirLogo = new ImprimirLogo();
        ImprimirLogo.imprimirLogo();

        // Mostrar Slogan
        ImprimirSlogan ImprimirSlogan = new ImprimirSlogan();
        ImprimirSlogan.imprimirSlogan();

        //esperar 2 segundos
        Thread.sleep(2000);

        //Limpiar pantalla
        LimpiarPantalla LimpiarPantalla = new LimpiarPantalla();
        LimpiarPantalla.limpiarPantalla();


    }

}
