/*Convertir el siguiente pseudociódigo a código Java:
//MODULO: Menu categorias-------------------------------------------------------------------------------------------------------
//Tabla: Categorias

//Menu que lista las categorias disponibles
Funcion menuCategoria(Usuarios)
	Definir opcion, i,j, numLocal Como Entero;
	Definir categoria Como Caracter;
	//inicializar variables. opcion en numero fuera de rango para iniciar menu
	opcion<-1002233;
	Escribir '=== Menú de Categorías ===';
	i<-0;
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		categoria<-diagramaCategorias(i);
		Escribir i+1,". ", categoria;
	FinPara
	Escribir '0. Salir';
	Escribir 'Ingrese la opción elegida: ';
	Leer opcion;
	Escribir '';
	
	si (opcion<8 y opcion<>0) Entonces
		Borrar Pantalla;
		numLocal<-mostrarLocalesPorCategoria(opcion);
		Escribir '';
		numLocal<-numLocal-1;
		menuLocal(numLocal,Usuarios);
	SiNo
		Borrar Pantalla;
		Escribir "";
		Escribir 'La opcion ingresada no es válida, intente de nuevo.';
		Escribir "";
		menuCategoria(Usuarios);
	FinSi
	
FinFuncion

 */

package CompraPorCategoria;

public class MenuDeCategorias {


    
}
