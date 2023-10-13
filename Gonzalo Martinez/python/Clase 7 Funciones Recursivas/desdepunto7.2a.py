def listarTerminos(nombre, *nombres, **terminos):
    for llave, valor in terminos.items():
        print(llave, ":", valor)

listarTerminos()
listarTerminos(IDE="Integrated Development Environment", PK="Primary Key")
listarTerminos(nombre='Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombre2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombre2)
desplegarNombres('Carla')
#desplegarNombres(10, 11)# noe s un objeto iterable
desplegarNombres((10, 11))# La convertimos a una tupla, en un solo elemnto no olvidar la coma
desplegarNombres([22, 45])# La convertimos a una lista

#funciones recursivas
def factorial(numero):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero - 1)
    resultado = factorial(5)
    print(f'El factorial de 5 es {resultado}')
#tarea hacer esto peroq ue el usuario ingrese el numero para calcular el factorial
def factorial(numero= int(input('Ingrese un numero: '))):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero - 1)
    resultado = factorial(5)
    print(f'El factorial de 5 es {resultado}')