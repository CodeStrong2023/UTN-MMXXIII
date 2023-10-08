package org.example;

import BaseDeDatos.BaseDatos;


public class Main {
    public static void main(String[] args) {
        //  crea instancia de base de datos
        BaseDatos baseDatos = new BaseDatos();
        // rellena la base de datos
        baseDatos.setProductosALocales();

        //lamadas de prueba a base de datos
        //obtener lista de locales
        System.out.println(baseDatos.getListaLocales());
        //obtener un local de la lista
        System.out.println(baseDatos.getListaLocales().get(3));
        //obtener productos de un local     se esta usando un swicht con indice de 1 a 10, se puede cambiar con nombre de locales o lo que se quiera.
        System.out.println(baseDatos.getLocales(2).getProductos());
        //obtener u1 producto
        System.out.println(baseDatos.getLocales(5).getProductos().get(1));
        //obtener nombre// descripcion o precio de un producto
        System.out.println(baseDatos.getLocales(5).getProductos().get(1).getNombre());
        System.out.println(baseDatos.getLocales(8).getProductos().get(1).getPrecio());
        //obtencion de datos mediante un bucle for

        for (int i = 1; i < 11; i++) {
            System.out.println("  ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("-------*********      " + baseDatos.getLocales(i).getNombre() + "     ********------------");
            for (int j = 1; j < 6; j++) {
                System.out.println(baseDatos.getLocales(i).getProductos().get(j).getNombre());
                System.out.println(baseDatos.getLocales(i).getProductos().get(j).getPrecio());
                System.out.println(baseDatos.getLocales(i).getProductos().get(j).getDescripcion());
                System.out.println(baseDatos.getLocales(i).getProductos().get(j).getStock());
                System.out.println("----------------------------------");
            }
        }
    }
}