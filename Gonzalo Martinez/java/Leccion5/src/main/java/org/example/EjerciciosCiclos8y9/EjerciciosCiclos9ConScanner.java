package org.example.EjerciciosCiclos8y9;

public class EjerciciosCiclos9ConScanner {
    //Pedir dia, mes y año de una fecha e indicar si la fecha es correcta suponiendo que
    // los meses tienen 30 dias. Con Scanner
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año");
        int año = scanner.nextInt();
        if (dia <= 30 && mes <= 12 && año > 0) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }

}
