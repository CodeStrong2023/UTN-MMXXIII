#Ejercicio 01: Crear una funcion apra sumar lso valores recibidos de tipo
#numericos, utilizando argumentos variables *args como parametro de la funcion

def sumar(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado