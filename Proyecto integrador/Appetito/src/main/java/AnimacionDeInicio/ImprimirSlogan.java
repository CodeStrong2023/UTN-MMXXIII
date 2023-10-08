package AnimacionDeInicio;

public class ImprimirSlogan {

    String slogan = "Tu App de Comidas!";
    String sloganAlineado;
    int longitudTotal;
    int longitudSlogan;

    public void alinearADerecha() {
        ImprimirLogo imprimirLogo = new ImprimirLogo();
        Utilidades.DeterminarLongitud determinarLongitud = new Utilidades.DeterminarLongitud();

        // Determinar la longitud del espacio a cubrir según el elemento más largo del logo.
        String[] logo = imprimirLogo.getLogo();
        int longitudTotal = determinarLongitud.determinarLongitud(logo);

        // Determinar la longitud del Slogan
        int longitudSlogan = slogan.length();

        // Crear una matriz de caracteres para el slogan alineado a la derecha
        char[] sloganMatriz = new char[longitudTotal];

        // Llenar los primeros espacios de blanco
        for (int i = 0; i < longitudTotal - longitudSlogan; i++) {
            sloganMatriz[i] = ' ';
        }

        // Llenar los últimos espacios con el slogan ingresado
        int l = 0;
        for (int i = longitudTotal - longitudSlogan; i < longitudTotal; i++) {
            sloganMatriz[i] = slogan.charAt(l);
            l++;
        }

        sloganAlineado = new String(sloganMatriz);

    }

    public void animarHorizontal() {
        alinearADerecha();
        // Mostrar los espacios en blanco en bloque 
//        for (int i = 0; i < longitudTotal-longitudSlogan; i++) {
//            char caracter = sloganAlineado.charAt(i);
//            System.out.print(caracter);
//        }

        //Mostrar los caracteres del slogan uno a uno, animando.
        for (int j = longitudTotal - longitudSlogan; j < sloganAlineado.length(); j++) {
            char caracter = sloganAlineado.charAt(j);
            System.out.print(caracter);
            try {
                Thread.sleep(100); // Pausa de 100 milisegundos
            } catch (InterruptedException e) {
            }
        }
        System.out.println(); // Salto de línea al final de la animación
    }

   public void ubicarGuirnalda() {
    String[] guirnalda = new String[]{
        "",
        "_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_",
        "", "", ""
    };

    for (int k = 0; k < 3; k++) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        System.out.println(guirnalda[k]);
    }
}
    public void imprimirSlogan() {
        animarHorizontal();
        ubicarGuirnalda();
    }
}
