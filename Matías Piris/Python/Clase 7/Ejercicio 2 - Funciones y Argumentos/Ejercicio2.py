# Ejercicio 2: Función con *args para multiplicar.
# Crear una función para multiplicar los valores recibidos de tipo númerico.
# Utilizando argumentos variables *args como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos.

def Multi_Valor(*Numeros):
    Res = 1
    for N in Numeros:
        Res *= N
    return Res

print(Multi_Valor(5,12,4,6))
