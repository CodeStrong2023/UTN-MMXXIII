# Argumentos variables para un diccionario.
def ListaTerminos(**terminos):  # Lo más utilizado es **kwargs (key word argument) para recibir argumentos.
    for llave, valor in terminos.items():
        print(f"{llave} : {valor}")


ListaTerminos()  # Como no recibe nada, no se mostrará nada.
ListaTerminos(IDE="Integrated Develoment Enviroment", PK="Primary Key")
ListaTerminos(Nombre="Lionel Messi")


# Lista de elementos con funciones (convertir).

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)


nombres2 = ["Tito", "Pedro", "Carlos"]

# desplegarNombres([10, 11]) no es un objeto iterable
desplegarNombres(nombres2)
desplegarNombres("Carla")
desplegarNombres([10, 11])  # Se convierte a una tupla en un solo elemento.
desplegarNombres([22, 55])  # Se convierte en lista.


# Funciones Recursivas

def Factorial(N):
    if N <= 1:  # Caso Base
        return 1
    else:
        return N * Factorial(N - 1)  # Caso Recursivo


Res = Factorial(5)  # Se realiza en código duro
print(f"El factorial del número 5 es: {Res}")
