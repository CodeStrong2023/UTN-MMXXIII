#Funciones argumentos variables

def listar_nombres(*nombres): #desconocemoscuantos nombres va a recibir como argumento, asi que ponemos que son variables
    for nombre in nombres:
        print(nombre)
        
listar_nombres("Juan","Karla","Guillermo","Maria")

#Se convierte en una tupla el argumento que se recibe en la funcion 