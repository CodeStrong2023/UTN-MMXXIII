package Dominio;

public class Empleado extends Persona { //Se coloca "extends" para indicar que es la clase "hija" de Persona.
    private int idEmpleado;
    private double Sueldo;
    private static int ContadorEmpleados; //Para incrementar.
    
    //Constructores
    public Empleado(){ //Constructor 1
        this.idEmpleado = ++Empleado.ContadorEmpleados; //No necesitamos el set "idEmpleado", ya que se estará modificando sólo con esta línea de código.
    }
    public Empleado(String nombre, double sueldo) { //Constructor 2
        //super(nombre);
        this(); // Llamando desde aqui al constructor vacío(llamar a un constructor interno)
        this.Nombre = nombre;
        this.Sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.Sueldo;
    }

    public void setSueldo(double sueldo) {
        this.Sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado = ").append(idEmpleado);
        sb.append(", Sueldo = ").append(Sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
