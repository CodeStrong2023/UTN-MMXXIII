#Ejercicio 1: llenar una lista
#Llenar una lista con los numeros del 1 al 50 luego mostrarla
#con el bucle for, de la siguiente forma:
#1-2-3-4-5...-50

#crear lista vacia

lista = []

#llenar lista con numeros del 1 al 50
for i in range(1,51):
    lista.append(i)
    
#mostrar lista
for i in lista:
    print(i, end="-")
