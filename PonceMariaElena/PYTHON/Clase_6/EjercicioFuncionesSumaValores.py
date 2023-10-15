#Ejercicio 1 funciones: crear una funcio que sume los valores recibidos de tipo numerido
#utilizando argumentos variables *args como parametros de la funcion y regresar como resultado
#la suma de todos los valores pasados como argumentos

def sumar_valores(*args):
    suma = 0
    for valor in args:
        suma += valor
    return suma


print(sumar_valores(1,2,3,4,5,6,7,8,9,10))