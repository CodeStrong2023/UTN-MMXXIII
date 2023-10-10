package AnimacionDeInicio;

public class ImprimirSlogan {

    String slogan = "Tu App de Comidas!";
    String sloganBlancos = "";
    int longitudTotal;
    int longitudSlogan;

    public String alinearADerecha() {
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
            sloganBlancos = sloganBlancos + " ";
        }
        return sloganBlancos;
    }

    public void animarHorizontal() throws InterruptedException {
        alinearADerecha();

        System.out.print(sloganBlancos);
        //Mostrar los caracteres del slogan uno a uno, animando.
        for (int j = 0; j < slogan.length(); j++) {
            char caracter = slogan.charAt(j);
            System.out.print(caracter);
                Thread.sleep(100); // Pausa de 100 milisegundos
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
    public void imprimirSlogan() throws InterruptedException {
        animarHorizontal();
        ubicarGuirnalda();
    }
}
