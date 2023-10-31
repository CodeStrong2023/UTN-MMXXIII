/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde
se aplique:
    variables: Evita cambiar el valor que almacena la variable
    metodos: Evita que se modifique la definicion o el comportamiento
            de un metodo desde una subclase (hija)
    clases: Evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estatico para convertir una 
variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos
son de tipo static y final, es por esto que la variable pi* se conoce
como una constante.
 */
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 38289863;
        System.out.println("miDni = " + miDni);
        //miDni = 20312312; NO SE PUEDE MODIFICAR.
        //Persona.CONSTANTE AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es = " +Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Franco");
        System.out.println("persona1 nombre= " + persona1.getNombre()); 
        persona1.setNombre("Tomas"); //Si se puede modificar su contenido
        System.out.println("persona1 nombre= " + persona1.getNombre());
    }
}