#Ejercicio 1 con Matemáticas y la clase math
#Sacar la raíz cuadrada de un número positivo

import math
#Dada la siguiente tupla 
tupla = (13,1,8,3,2,5,8) 

#Crear una lista que solo incluya los numeros menores a 5
#e imprima por consola [1,3,2]

lista = []
#filtrar elementos menores a 5
for i in tupla:
    if i < 5:
        lista.append(i)
print(lista)

#Ejercicio de matematicas
#Para sacar la raiz cuadrada de un numero positivo
numero = int(input("Ingrese un numero positivo: "))
#validar que el numero sea positivo
while numero < 0:
    print("Error -> el numero debe ser positivo")
    numero = int(input("Ingrese un numero positivo: "))
print(f"\nSu raiz cuadrada es {math.sqrt(numero):.2f}")
    