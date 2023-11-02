package org.example;

public class PruebaAritmetica {
    public static void main(String[] args) {
Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 2;
        aritmetica.b = 3;
        aritmetica.sumar();

        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        int resultado2 = aritmetica.sumarConArgumentos(5, 8);
        System.out.println("resultado2 = " + resultado2);

    }
}
