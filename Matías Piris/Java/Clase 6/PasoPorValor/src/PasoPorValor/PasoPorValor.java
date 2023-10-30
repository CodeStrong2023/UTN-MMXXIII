package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var X = 20;
        System.out.println("ValorX = " + X);
        CambioValor(X); //Solo le enviamos una copia
        System.out.println("ValorX = " + X);
    }
    
    public static void CambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
