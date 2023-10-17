/* Proyecto Caja: Crear un proyecto segun las especificaciones mostradas a continuación.
La fórmula es: volumen = ancho * alto * profundidad.*/

package caja;

public class ProyectoCaja {
    public static void main(String[] args) {
        //Variables locales
        int MedAncho = 3;
        int MedAlto = 2;
        int MedProf = 6;
        
        Caja caja1 = new Caja(); //Instaciamos el objeto al constructor vacío.
        caja1.Ancho = MedAncho; // Se pasan los valores al objeto.
        caja1.Alto = MedAlto;
        caja1.Profundo = MedProf;
        
        int Resultado = caja1.CalcularVolumen(); //Se llama al método
        
        //Primer resultado.
        System.out.println("Resultado volumen de caja 1: " + Resultado);
        
        
        Caja caja2 = new Caja(2,4,6); //Se llama al constructor 2 con nuevos argumentos.
        
        //Llamado al metodo con el nuevo objeto para realizar un nuevo cálculo.
        System.out.println("Resultado volumen de caja 2: " + caja2.CalcularVolumen());
    }
    
}
