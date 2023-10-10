package org.example;

import AnimacionDeInicio.AnimacionDeInicio;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //ANIMACION DE INICIO
        AnimacionDeInicio AnimacionDeInicio = new AnimacionDeInicio();
        AnimacionDeInicio.iniciarApp();

        //MENU PRINCIPAL
        MenuPrincipal.MenuPrincipal menuPrincipal = new MenuPrincipal.MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }
}
