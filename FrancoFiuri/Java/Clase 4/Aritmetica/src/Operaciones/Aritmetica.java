
package Operaciones;

public class Aritmetica {   //las clases se escriben en Pascalcase
    //Atributos de la clase
    int a;
    int b;
    
    
    //Metodo
    public void sumarNumeros(){ //los metodos se escriben en camelCase
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //El argumento this se utiliza para separar argumento de variable.
        //return a + b;
        return sumarConRetorno();
    }
}
