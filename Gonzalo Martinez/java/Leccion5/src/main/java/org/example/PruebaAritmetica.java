package org.example;

public class PruebaAritmetica {
    public void main(String[] args) {
Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 2;
        aritmetica.b = 3;
        aritmetica.sumar();

        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        int resultado2 = aritmetica.sumarConArgumentos(5, 8);
        System.out.println("resultado2 = " + resultado2);

        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 nombre: " + persona1.nombre);
        System.out.println("persona1 apellido: " + persona1.apellido);

    }

    class Persona{
        String nombre;
        String apellido;

        void desplegarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
        }

        public Persona(String nombre, String apellido) {
            super();
            new imprimir().imprimir(this);
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("objeto persona usando this: " + this);
        }
    }

    class imprimir{
        public imprimir() {
            super();
        }
        public void imprimir(Persona persona) {
            System.out.println("Persona desde clase imprimir: " + persona);
            System.out.println( "impresion del objeto actual(this)" + this);
        }
    }
}
