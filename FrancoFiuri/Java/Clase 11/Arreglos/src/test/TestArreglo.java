
package test;

public class TestArreglo {
    public static void main(String[] args) {
        int edades[] = new int [3];//el lado izq. declaramos la variable, en el derecho instanciamos un objeto tipo object.
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0= " + edades[0]);
        edades[1] = 30;
        System.out.println("edades 1= " + edades[1]);
        edades[2] = 7;
        System.out.println("edades 2= " + edades[2]);
        
        //edades[3] = 77; //Fuera de rango, error en tiempo de ejecución.
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos"+i+": "+edades[i]);
        }
    }
}
