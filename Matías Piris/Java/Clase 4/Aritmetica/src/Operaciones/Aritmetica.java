package Operaciones;

public class Aritmetica {  //Las clases se escriben en Pascalcase
    //Atributos de la clase
    int A;
    int B;
    
    //El constructor es un método especial
    public Aritmetica(){ //Constructor 1 VACIO (Se crea por defecto)
        System.out.println("Se está ejecutando el constructor número uno");
    }
    
    public Aritmetica(int a, int b){ //Si creamos un constructor, debemos tener en cuenta de crear el constructor por defecto ya que no se va a crear solo.
        this.A = A;
        this.B = B;
        System.out.println("Se está ejecutando el constructor número dos");
    }
    
    //Metodo
    public void SumarNumeros(){ //Los métodos se escriben en camelCase
        int Resultado = A + B;
        System.out.println("Resultado = " + Resultado);
    }
    
    public int SumarConRetorno(){
        int resultado = A + B;
        return resultado;
    }
    
    public int SumarConArgumentos(int A, int B){
        this.A = A; //El argumento A se asigna al atributo this.A
        this.B = B; //El argumento this se utiliza para separar argumento de variable.
        //return A + B;
        return SumarConRetorno();
    }
}
