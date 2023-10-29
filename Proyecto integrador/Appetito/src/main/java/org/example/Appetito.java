package org.example;

import AnimacionDeInicio.AnimacionDeInicio;
import Menus.MenuPrincipal;

public class Appetito {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    AnimacionDeInicio animacionDeInicio = new AnimacionDeInicio();

    public MenuPrincipal Appetito() throws InterruptedException {
        //ANIMACION
     //   animacionDeInicio.iniciarApp();
        //MENU PRINCIPAL
        menuPrincipal.menuPrincipal();
        return menuPrincipal;
    }

}
