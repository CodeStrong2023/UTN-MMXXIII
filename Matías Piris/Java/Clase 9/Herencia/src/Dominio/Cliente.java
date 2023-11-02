package Dominio;

import java.util.Date;

public class Cliente extends Persona {
     //Atributos
    private int idCliente;
    private Date FechaRegistro;
    private boolean Vip;
    private static int ContadorClientes;
    
    //Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); //Siempre se coloca el super en la primer linea del constructor.
        this.idCliente = ++Cliente.ContadorClientes;
        this.FechaRegistro = fechaRegistro;
        this.Vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.FechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.FechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.Vip;
    }

    public void setVip(boolean vip) {
        this.Vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente = ").append(idCliente);
        sb.append(", FechaRegistro = ").append(FechaRegistro);
        sb.append(", Vip = ").append(Vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
