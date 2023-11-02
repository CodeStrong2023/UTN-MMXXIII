/*Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
    Variables: evita cambiar el valor que almacena la variable.
    Métodos: evita que se modifique la definición o el comportamiento de un método desde una subclase (hija).
    Clases: evita que se creen clases hijas.
Otra característica es que normalmente, cuando trabajamos con variables se combina con el modificador de acceso estático para convertir una 
variable en una constante, es decir que no se puede modificar su valor. El ejemplo de esto es la clase Math en la cual todos sus atributos
son de tipo static y final, es por esto que la variable pi* se conoce como una constante. */

package test;

import Dominio.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 38289863;
        System.out.println("MiDni = " + miDni);
        //miDni = 20312312; NO SE PUEDE MODIFICAR.
        //Persona.CONSTANTE AQUI = 9; //No se modifica.
        System.out.println("Mi atributo constante es = " +Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia.
        
        persona1.setNombre("Matias");
        System.out.println("Persona1 nombre = " + persona1.getNombre()); 
        persona1.setNombre("Lucas"); //Si se puede modificar su contenido.
        System.out.println("Persona1 nombre = " + persona1.getNombre());
    }
}
