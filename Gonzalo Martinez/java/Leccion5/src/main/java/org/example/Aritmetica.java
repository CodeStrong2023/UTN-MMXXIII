package org.example;

public class Aritmetica {
    int a;
    int b;

    public void  sumar() {
        System.out.println(a + b);
    }

    public int sumarConRetorno() {
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return arg1 + arg2;
    }
}
