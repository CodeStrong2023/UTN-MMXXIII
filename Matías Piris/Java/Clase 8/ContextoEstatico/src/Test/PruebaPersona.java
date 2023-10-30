package Test;

import Dominio.Persona;

public class PruebaPersona {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias"); 
        System.out.println("Persona1 = " + persona1);
        Persona persona2 = new Persona("Lucas");
        System.out.println("Persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contaxto estatico
        PruebaPersona personaP1 = new PruebaPersona();
        System.out.println(personaP1.getContador());
    }
    
    public static void imprimir(Persona persona){
        System.out.println("Persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Franco"));
        return this.contador;
    }
}
