package org.example;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println(" ValorX = " + valorX);
        cambioValor(valorX);
    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        System.out.println("arg1 = " + arg1);
    }
}
