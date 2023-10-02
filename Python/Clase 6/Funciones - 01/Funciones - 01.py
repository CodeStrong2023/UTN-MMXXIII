# Ejercicio 01: Crear una función para sumar lso valores obtenidos de tipo númericos.
# Utilizando argumentos variables *args como parámetro de la funcíón
# y agregar como resultado la suma de todos los valores pasados como argumentos.

# Definir función

def sumar_valor (*args):  # Se reciben una cantidad indefinida de parámetros
    Resultado = 0

    # Iteración de cada elemento

    for valor in args:
        Resultado += valor
    return Resultado

# Se llama a la función

print(sumar_valor(3,5,9,2,1))