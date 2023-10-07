#Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Las tuplas se crean con parentesis y comas.
#Crear una lista que solo incluya los numeros menores a 5
#e imprima por consola [1, 3, 2]

lista = []
for i in tupla:
    if i < 5:
        lista.append(i)
print(lista)