# Argumentos, variables en funciones
def listarNombres(*nombres):  # Utilizando * toma TODOS los argumentos utilizados y los agrega a la funcion. Normalmente utilizamos *args
    for nombre in nombres: # Se convierte la variable nombre en una tupla.
        print(nombre)
listarNombres('Franco','Damian','Leandro','Antonio')
listarNombres('Barbara','Tomas','Yamil','Anyi')

def listarTerminos(**terminos): # llave valor argumentos (kwargs)
    for llave, valor in terminos.items():
        print(f'{llave} : {valor}')

listarTerminos()    # de esta forma no se muestra nada ya que no estamos dando argumentos.
listarTerminos(IDE = 'Integrated Development Enviroment', PK = 'Primary Key')
listarTerminos(Nombre = 'Lionel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2= ['Tito','Pedro','Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10) No es un objeto iterable
desplegarNombres((10, 11))  # Si ponemos dos parentesis, se convierte en tupla y se puede iterar.
desplegarNombres([22, 55])  # lo mismo pasa si lo convertimos en lista.

# Funciones Recursivas
def factorial(numero):
    if numero == 1: #Caso Base
        return 1
    else:
        return numero * factorial(numero-1) # Caso Recursivo

resultado = factorial(5) # Lo hacemos en codigo duro
print(f'El factorial del numero 5 es: {resultado}')

# Lo hacemos consultandole al usuario.
numero_factorizar = int(input('Ingrese el número a factorizar: '))
print(f'El factorial del {numero_factorizar} es: {factorial(numero_factorizar)}')