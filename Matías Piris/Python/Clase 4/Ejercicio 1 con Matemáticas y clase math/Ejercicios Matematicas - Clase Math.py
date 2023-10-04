import math  # Importar clase math para hacer uso de la funcion sqrt(raíz cuadrada)
# Dada la siguiente tupla:

Tupla = (13, 1, 8, 3, 2, 5, 8)  # Definir la tupla

# Crear una lista que solo incluya los númeors menores a 5 e imprimir por consola [1, 3, 2]

Lista = []  # Definir lista

# Filtrar elementos menores a 5 de la tupla

for Elemento in Tupla:
    if Elemento < 5:
        Lista.append(Elemento)

print(Lista)

# Ejercicio de Matemáticas
# Sacar la raíz cuadrada de un número positivo

N = int(input("Ingrese un número positivo: "))
while N < 0:
    print("Error. Debe ser un número positivo")
    N = int(input("Ingrese un número positivo: "))
print(f"\nLa raíz cuadrada del número ingresado es: {math.sqrt(N):.2f}")


