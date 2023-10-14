package AnimacionDeInicio;

public class ImprimirLogo {

    // Declarar la variable de instancia logo
    // Inicializar la variable logo y asignarle valores.
    String[] logo = new String[]{
        " ",
        "Bienvenido a...",
        " ",
        "_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_",
        " ",
        "           __",
        "           // ¨¨--.._",
        "          ||  (_)  _ ¨-._",
        "          ||    _ (_)    ´-.",
        "  A)aa   ||   (_)   __..-´     E)eeeeee        ",
        " A)  aa   \\__..--¨¨            E)           t)     ##     t)          ",
        "A)    aa   p)PPPP   p)PPPP     E)eeeee    t)tTTT   ##   t)tTTT    o)OOO ",
        "A)aaaaaa   p)   PP  p)   PP    E)           t)     i)     t)     o)   OO",
        "A)    aa   p)   PP  p)   PP    E)           t)     i)     t)     o)   OO",
        "A)    aa   p)PPPP   p)PPPP     E)eeeeee     t)T    i)     t)T     o)OOO ",
        "    /      p)       p)                                        ",
        " .-/-.     p)       p)     .-¨¨¨¨-.             \\|/\\//      ",
        " |`-´|                    /` .  ´. \\            |`¨¨´|",
        " |   |                   (`-..:...-´)           |    |      ",
        " |   |                    ;-......-;            \\____/            ",
        " \\___/                     `------´                       ",
        "                                                    ",
        "          "
    };

    public String[] getLogo() {
        return logo;
    }

    public void mostrarLogo() throws InterruptedException {
        //Iterar el arreglo logo para mostrarlo por pantalla
        for (int i = 0; i < logo.length; i++) {
            System.out.println(logo[i]);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }

    //constructor
    public ImprimirLogo() {
    }
}
