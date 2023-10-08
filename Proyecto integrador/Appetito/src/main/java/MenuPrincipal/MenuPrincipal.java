/*//MODULO: Menu Principal--------------------------------------------------------------------------------------------------------
//menu principal
Funcion menuPrincipal(Usuarios)
	Definir opcion, i,j Como Entero;
	//inicializar variables. opcion en numero fuera de rango para iniciar menu
	i<-0; j<-0; opcion<-234242;
	//mientras no se elija salir se mostrará el menu.
	//si la opcion no esta definida se le solicitara que ingrese un numero valido
	Borrar Pantalla;
	Escribir '=== Menu Principal ===';
	Escribir '1 - Comprar por local';
	Escribir '2 - Comprar por categoría';
	Escribir '3 - Perfil de Usuario';
	Escribir '0 - Salir';
	Escribir 'Ingrese una opción: ';
	Leer opcion;
	Escribir '';
	
	si opcion<4 Entonces
		Segun opcion  Hacer
			1:
				//se ingresa al menu que muestra la lista de locales vigentes
				Borrar Pantalla;
				mostrarMenuLocal(Usuarios);
			2:
				//se ingresa al menu que muestra las categorias
				Borrar Pantalla;
				menuCategoria(Usuarios);
			3: 
				//se ingresa al menu que muestra el perfil de usuario
				Borrar Pantalla;
				perfilUsuario(Usuarios);
			0: //salida
				salir();
			De Otro Modo:
				
		FinSegun
	SiNo
		//control de datos ingresados
		Borrar Pantalla;
		Escribir "";
		Escribir 'Opción incorrecta. Vuelva a elegir.';
		Escribir "";
		menuPrincipal(Usuarios);
	FinSi
	
FinFuncion*/


package MenuPrincipal;

public class MenuPrincipal {
    
}
