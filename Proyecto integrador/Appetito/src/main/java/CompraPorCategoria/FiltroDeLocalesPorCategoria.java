/*
//Modulo: Mostrar locales por categoria elegida --------------------------------------------------------------------------------
Funcion numLocal<-mostrarLocalesPorCategoria(eleccion)
	Definir limit,i,categoria,id, eleccionLocal, numLocal Como Entero;	
	Definir nombreCat Como Caracter;
	//se determina la eleccion del usuario como la categoria a trabajar
	categoria<-eleccion;
	//dado que los datos vienen en formato carater, se convierte el limite especifico de la categoria en numero
	limit<-ConvertirANumero(listaCategorias(categoria,0,1));
	//se llama a la tabla de categorias para mostrar su nombre segun la eleccion
	nombreCat<-diagramaCategorias(categoria-1);
	Escribir nombreCat;
	
	//Se itera el llamado a la funcion que lista los locales segun la categoria elegida
	//y se muestran en pantalla para la proxima eleccion del usuario
	Para i<-0 Hasta limit-1 Hacer
		id<-(ConvertirANumero(listaCategorias(categoria,i,0))-1);
		Escribir (i+1),". ", ConstruccionBD(id,1);
	FinPara
	
	Escribir "Elija un local: ";
	Leer eleccionLocal;    
	
	Para i<-0 Hasta eleccionLocal-1 Hacer
		id<-(ConvertirANumero(listaCategorias(categoria,i,0))-1);
		numLocal<-ConvertirANumero(ConstruccionBD(id,0));
	FinPara
	
FinFuncion
 */
package CompraPorCategoria;

/**
 *
 * @author Marie
 */
public class FiltroDeLocalesPorCategoria {
    
}
