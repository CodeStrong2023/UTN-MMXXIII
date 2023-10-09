#Ejercicio 2: Funcion con * args para multiplicar
#Crear una funcion para multiplicar los valores recibidos
#de tipo numerioco, utilizando argumentos variables *args
#como parametro de la funcion y regresar como resultado
#la multiplicacion de todos los valores pasados como argumentos.

def multiplicar_valores(*args):
    resultado = 1
    for valor in args:
        resultado *= valor
    return resultado

print(multiplicar_valores(3,6,9,10))