/*
Funcion menuLocal(eleccion, Usuarios)
	Definir i,j Como Entero;
	Definir local, producto1, producto2, cantidad1, cantidad2, precio1, precio2,arrayCarrito, opcionAgregar Como caracter;
	Dimension arrayCarrito[100];
	Definir numLocal, numProducto1, numProducto2, opcion, numItems Como entero;
	
	numLocal<-eleccion;
	//asignacion del local dentro del array
	local <- ConstruccionBD(numLocal,1);
	arrayCarrito[0] <- local;
	
	Escribir local;
	Escribir "Elija el ID del producto que desea comprar: ";
	Escribir "";
	j<-3;
	numItems<-0;
	Para i<-0 Hasta 0 Con Paso 1 Hacer
		Para j<-3 Hasta 10 Con Paso 4 Hacer
			numItems<-numItems+1;
			Escribir numItems,". ", ConstruccionBD(numLocal,j);
			Si numItems=1 Entonces
				Escribir "Descripción: ", ConstruccionBD(numLocal,4);
				Escribir "Precio: ", ConstruccionBD(numLocal,5);
				Escribir "";
			FinSi
			si numItems=2 Entonces
				Escribir "Descripción: ", ConstruccionBD(numLocal,8);
				Escribir "Precio: ", ConstruccionBD(numLocal,9);
				Escribir "";
			FinSi
		FinPara
	FinPara
	Leer numProducto1;
	
	Si numProducto1 = 1 o numProducto1 = 2 Entonces //ciclo de validacion
		Escribir "";
	SiNo
		Repetir
			Escribir "El número de ID ingresado es invalido, vuelva a ingresarlo: ";
			Leer numProducto1;
		Hasta Que numProducto1 = 1 o numProducto1 = 2
	FinSi
	
	//asignacion del producto y del precio dentro del array
	si numProducto1 = 1 Entonces
		producto1 <- ConstruccionBD(numLocal,3);
		precio1 <- ConstruccionBD(numLocal,5);
	SiNo
		si numProducto1 = 2 Entonces
			producto1 <- ConstruccionBD(numLocal,7);
			precio1 <- ConstruccionBD(numLocal,9);
		FinSi
	FinSi
	
	arrayCarrito[1] <- producto1;
	arrayCarrito[3] <- precio1;
	
	//asignacion de la cantidad dentro del array
	Escribir "Indique la cantidad que desea comprar: ";
	Leer cantidad1;
	arrayCarrito[2] <- cantidad1;
	
	//opcion de agregar producto
	
	Escribir "Desea agregar otro producto? (si/no)";
	Leer opcionAgregar;
	
	si opcionAgregar = "si" o opcionAgregar = "no" Entonces //ciclo de validacion
		Escribir "";
	SiNo
		Repetir
			Escribir "Escribir si o no, por favor:";
			Leer opcionAgregar;
		Hasta Que opcionAgregar = "si" o opcionAgregar = "no"
	FinSi
	
	numItems<-0;
	si opcionAgregar = "si" Entonces //asignacion de agregar producto
		Escribir "Elija el ID del producto que desea comprar: ";
		Escribir "";
		j<-3;
		Para i<-0 Hasta 0 Con Paso 1 Hacer
			Para j<-3 Hasta 10 Con Paso 4 Hacer
				numItems<-numItems+1;
				Escribir numItems,". ", ConstruccionBD(numLocal,j);
				Si numItems=1 Entonces
					Escribir "Descripcion: ", ConstruccionBD(numLocal,4);
					Escribir "Precio: ", ConstruccionBD(numLocal,5);
					Escribir "";
				FinSi
				si numItems=2 Entonces
					Escribir "Descripcion: ", ConstruccionBD(numLocal,8);
					Escribir "Precio: ", ConstruccionBD(numLocal,9);
					Escribir "";
				FinSi
			FinPara
		FinPara
		Leer numProducto2;
		
		Si numProducto2 = 1 o numProducto2 = 2 Entonces //ciclo de validacion
			Escribir "";
		SiNo
			Repetir
				Escribir "El número de ID ingresado es invalido, vuelva a ingresarlo: ";
				Leer numProducto2;
			Hasta Que numProducto2 = 1 o numProducto2 = 2
		FinSi
		
		//asignacion del producto 2 y del precio dentro del array
		si numProducto2 = 1 Entonces
			producto2 <- ConstruccionBD(numLocal,3);
			precio2 <- ConstruccionBD(numLocal,5);
		SiNo
			si numProducto2 = 2 Entonces
				producto2 <- ConstruccionBD(numLocal,7);
				precio2 <- ConstruccionBD(numLocal,9);
			FinSi
		FinSi
		
		arrayCarrito[4] <- producto2;
		arrayCarrito[6] <- precio2;
		
		//asignacion de la cantidad dentro del array del producto 2
		Escribir "Indique la cantidad que desea comprar: ";
		Leer cantidad2;
		arrayCarrito[5] <- cantidad2;
	SiNo
		si opcionAgregar = "no" Entonces
			Escribir "No se ha agregado otro producto";
			arrayCarrito[4] <- "0";
			arrayCarrito[5] <- "0";
			arrayCarrito[6] <- "0";
		FinSi
	FinSi
	
	
	//opcion volver al menu principal
	Escribir "";
	
	Escribir "Elija una de las siguientes opciones: ";
	Escribir "0 - Volver al Menú Principal ";
	Escribir "1 - Volver a ver el menu de Locales ";
	Escribir "2 - Ir al carrito";
	Escribir "3 - Salir";
	
	Leer opcion;
	Segun opcion Hacer
		0:
			Borrar Pantalla;
			menuPrincipal(Usuarios); //se ve de agregar la opcion de volver al menu principal
			
		1:	
			Borrar Pantalla;
			mostrarMenuLocal(Usuarios);
			
		2: 
			Borrar Pantalla;
			carritoDeCompras(arrayCarrito,Usuarios);
			
		3: 
			Escribir " ";
			Escribir "Sesion Finalizada, vuelva pronto!";
			
		De Otro Modo:
			Escribir "Número de opcion erroneo, se cierra la sesion.";
	FinSegun
	
	
FinFuncion
 */
package Menus;

//tengo que devolver un array list de productos.

import BaseDeDatos.BaseDatos;
import BaseDeDatos.Producto;
import java.util.List;
import java.util.Scanner;



public class MenuLocal {
    private List<Producto> arrayCarrito;  // Lista de productos del local
        Scanner entrada = new Scanner (System.in);
        BaseDatos base = new BaseDatos();
    
    public void mostrarMenu(int eleccionLocal){
        System.out.println("-------*********      " + base.getListaLocales().get(eleccionLocal-1) + "     ********------------");
            for (int j = 1; j < 6; j++) {
                System.out.println(j+"-"+base.getLocales(eleccionLocal).getProductos().get(j).getNombre());
                System.out.println("$ "+base.getLocales(eleccionLocal).getProductos().get(j).getPrecio());
                System.out.println("Descripcion: "+base.getLocales(eleccionLocal).getProductos().get(j).getDescripcion());
                System.out.println("Stock: "+base.getLocales(eleccionLocal).getProductos().get(j).getStock());
                System.out.println("----------------------------------");
            }
        eleccionProducto(eleccionLocal);    
    }
    public void eleccionProducto(int eleccionLocal){
        System.out.println("Elija un producto: ");
        int eleccionProducto = Integer.parseInt(entrada.nextLine()); 
        if (eleccionProducto >= 1 & eleccionProducto <= 8){
            agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
        }
        else {  
            while (eleccionProducto < 0 & eleccionProducto > 8){
                System.out.println("Elija un producto correcto: ");
                eleccionProducto = Integer.parseInt(entrada.nextLine());
                agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
            }
        }

        System.out.println("Elija la cantidad: ");
        int eleccionCantidad = Integer.parseInt(entrada.nextLine());
        if (eleccionCantidad <= base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()){
            arrayCarrito.get(eleccionProducto).setCantidad(eleccionCantidad);
        }
        else {
            while (eleccionCantidad > base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()){
            System.out.println("La cantidad elegida sobrepasa el stock, por favor vuelva a ingresar una cantidad menor: ");
            eleccionCantidad = Integer.parseInt(entrada.nextLine());
            arrayCarrito.get(eleccionProducto).setCantidad(eleccionCantidad);
            }
        }
        System.out.println("Desea agregar otro producto? (Si o No)");
        String opcion = entrada.nextLine();
        if (opcion == "Si") {
            System.out.println("Elija un producto: ");
            eleccionProducto = Integer.parseInt(entrada.nextLine()); 
            if (eleccionProducto >= 1 & eleccionProducto <= 8){
                agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
            }
            else {  
                while (eleccionProducto < 0 & eleccionProducto > 8){
                    System.out.println("Elija un producto correcto: ");
                    eleccionProducto = Integer.parseInt(entrada.nextLine());
                    agregarProducto(base.getLocales(eleccionLocal).getProductos().get(eleccionProducto));
                }
            }
            System.out.println("Elija la cantidad: ");
            eleccionCantidad = Integer.parseInt(entrada.nextLine());
            if (eleccionCantidad <= base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()){
                arrayCarrito.get(eleccionProducto).setCantidad(eleccionCantidad);
            }
            else {
                while (eleccionCantidad > base.getLocales(eleccionLocal).getProductos().get(eleccionProducto).getStock()){
                System.out.println("La cantidad elegida sobrepasa el stock, por favor vuelva a ingresar una cantidad menor: ");
                eleccionCantidad = Integer.parseInt(entrada.nextLine());
                arrayCarrito.get(eleccionProducto).setCantidad(eleccionCantidad);
                }
            }
        }
        else {
            System.out.println(" ");
        }
        //arrayCarrito.get(i).setCantidad(eleccionCantidad); //hacer un while para que pueda elegir varios productos
    }        
    //array con la eleccion del producto.
    public void agregarProducto(Producto eleccionProducto) {
        arrayCarrito.add(eleccionProducto);
    }
}