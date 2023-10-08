/*
//Modulo: Lista de Categorias ---------------------------------------------------------------------------------------------------
Funcion retornosCategorias<- listaCategorias(cat,loc,iterador)
	Definir listaCategoria, input,categoria, categoriasLocal,categoriasFiltradas,retornosCategorias, consulta, categoriaLista, categoria1,categoria2,categoria3,categoria4,categoria5,categoria6,categoria7,retornoCategorias  Como Caracter;
	Dimension listaCategoria[100], consulta[2], categoriasLocal[100], categoriasFiltradas[8,100], categoria1[100],categoria2[100],categoria3[100],categoria4[100],categoria5[100],categoria6[100],categoria7[100],retornoCategorias[8,100];
	Definir a,b,c,d,e,f,g,h,i,j,k, p,q,x, z, limit, opcion Como Entero;
	
	//Inicializar variables iteradores y contadores
	i<-0; j<-0; k<-0; p<-0; q<-0; a<-0; b<-0; c<-0; d<-0; e<-0; f<-0; g<-0; h<-0; x<-0; z<-0; categoria<-""; retornoCategorias[0,a]<-"";
	
	//J es el indice que apunta al lugar de las categorias en la base de datos
	j<-2;
	
	//tratamiento de datos recibidos por BD
	//** Recuperar la lista de categorias de la base de datos para su tratamiento
	Para i<- 0 Hasta 9 Con Paso 1 Hacer
		listaCategoria[i]<- Concatenar((Concatenar(ConvertirATexto(i+1),",")),ConstruccionBD(i,j));
	FinPara
	
	//Separacion de cada elemento del string como item separado a partir de las ","
	Para i<- 0 Hasta 9 Con Paso 1 Hacer
		input<-listaCategoria[i];
		j<-0;
		k<-0;
		//scope por cada palabra en el string
		//desglosar la lista de categorias por local
		Mientras k< Longitud(input) Hacer
			//rearmar categoria de a una
			si Subcadena(input,k,k) <> "," Entonces
				categoria <- Concatenar(categoria,Subcadena(input,k,k));
				k<-k+1;
			sino
				//separa si caracter es coma y guarda en array
				//array provisorio en bucle que se resetea con cada local
				categoriasLocal[j]<-categoria;
				//reseteo e incremento de variables e indices
				categoria<-"";
				//contador de elementos totales del array
				h<-h+1;
				j<-j+1;
				k<-k+1;
			FinSi
			
		FinMientras
		
		//cantidad de categorias
		p<-6;
		
		//evaluacion de categorias y filtro construyendo un array con ID de locales que tengan esa categoria
		Para x<-1 Hasta (j-1) Con Paso 1 Hacer
			//trae una categoria de la tabla de categorias
			Para z<-0 Hasta p Con Paso 1 Hacer
				categoriaLista<-diagramaCategorias(z);
				//evalua en cada local si hay equivalencia entre esa categoria y la que se guardo en la lista de categorias de ese local
				Si categoriasLocal[x]=categoriaLista Entonces
					opcion<-z+1;
					//si hubiera coincidencia se guarda en dos variables para su uso especifico y su retorno en la funcion
					//en el array numerado de categorias se guarda el id del local que se es equivalente
					//en el retorno se va guardando ese array y se va contando cuantos elementos entran 
					//para establecer un limite personalizado de recorrido
					Segun opcion Hacer
						1:
							//se reconstruye la lista de locales Segun categoria desde la base de datos
							categoria1[a]<-categoriasLocal[0];
							retornoCategorias[1,a]<-categoria1[a];
							//contador para exportacion
							a<-a+1;
						2:
							categoria2[b]<-categoriasLocal[0];
							retornoCategorias[2,b]<-categoria2[b];
							b<-b+1;							
						3:
							categoria3[c]<-categoriasLocal[0];
							retornoCategorias[3,c]<-categoria3[c];
							c<-c+1;							
						4:
							categoria4[d]<-categoriasLocal[0];
							retornoCategorias[4,d]<-categoria4[d];
							d<-d+1;							
						5:
							categoria5[e]<-categoriasLocal[0];
							retornoCategorias[5,e]<-categoria5[e];
							e<-e+1;							
						6:
							categoria6[f]<-categoriasLocal[0];
							retornoCategorias[6,f]<-categoria6[f];
							f<-f+1;							
						7:
							categoria7[g]<-categoriasLocal[0];
							retornoCategorias[7,g]<-categoria7[g];
							g<-g+1;							
						De Otro Modo:
							Escribir "Ese número no pertenece a una categoría vigente";
					FinSegun
				FinSi
			FinPara
		FinPara		
		//una vez establecidos los datos se establece el límite personalizado segun categoria elegida por el usuario para su exportacion
	FinPara
	Segun cat Hacer
		1:
			limit<-a;
		2:
			limit<-b;
		3:
			limit<-c;
		4:
			limit<-d;
		5:
			limit<-e;
		6:
			limit<-f;
		7:
			limit<-g;
		De Otro Modo:
			
	FinSegun
	
	//en un array provisorio exclusivo para la exportacion se guarda la informacion de 
	//los locales por cada categoria y el limite en elementos separados
	consulta[0]<- retornoCategorias[cat,loc];
	consulta[1]<-ConvertirATexto(limit);
	
	//se establece el retorno de la funcion
	retornosCategorias<-(consulta[iterador]);
FinFuncion
 */
package CompraPorCategoria;

/**
 *
 * @author Marie
 */
public class ListadoDeCategorias {
    
}
