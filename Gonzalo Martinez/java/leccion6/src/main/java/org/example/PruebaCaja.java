package org.example;

public class PruebaCaja {
    public static void main(String[] args) {
        // CRa
        System.out.println("Hello world!");
        // variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;

        Caja caja = new Caja();
        caja.ancho = medidaAncho;
        caja.alto = medidaAlto;
        caja.profundo = medidaProfundo;
        int resultado = caja.calcularVolumen();
        System.out.println("resultado = " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("resultado caja2 = " + caja2.calcularVolumen());
    }
}