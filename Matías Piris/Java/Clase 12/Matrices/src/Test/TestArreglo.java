package Test;

public class TestArreglo {
    public static void main(String[] args) {
        int E[] = new int [3];//En el lado izquierdo declaramos la variable. En el derecho, instanciamos un objeto tipo object.
        System.out.println("Edades = " + E);
        
        E[0] = 17;
        System.out.println("Edades 0 = " + E[0]);
        E[1] = 30;
        System.out.println("Edades 1 = " + E[1]);
        E[2] = 7;
        System.out.println("Edades 2 = " + E[2]);
        
        //edades[3] = 77; //Fuera de rango. Error en tiempo de ejecución.
        
        for(int I = 0; I < E.length; I++){
            System.out.println("Edades y sus elementos " + I + ": " + E[I]);
        }
    }
}
