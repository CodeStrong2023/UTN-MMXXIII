#Ejercicio 2 funciones: crear ua funcion con *args para multiplicar los valores recibidos
#Regresar el resultado de la multiplicacion

def multiplicar_valores(*args):
    multiplicacion = 1
    for valor in args:
        multiplicacion *= valor
    return multiplicacion

print(multiplicar_valores(1,2,3,4,5,6,7,8,9,10))
