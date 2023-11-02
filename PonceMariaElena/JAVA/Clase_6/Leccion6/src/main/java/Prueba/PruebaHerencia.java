/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

import Clases.Cliente;
import Clases.Empleado;
import java.util.Date;

public class PruebaHerencia {
        public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Rafael", 57000.00);
        System.out.println("empleado1 = " + empleado1);
        Date fecha1 = new Date();
        Cliente cliente1 = new Cliente(fecha1, true, "Diego",'M', 19, "SinNumero");
        System.out.println("cliente1 = " + cliente1);
        }
}
