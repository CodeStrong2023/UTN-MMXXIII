# Dada la siguiente tupla,
tupla = (13, 1, 8, 3, 2, 5, 8)
# crear una lista que sólo incluya los números menor que 5
# imprima por consola [1,3,2]

lista = []  # Definir la lista
# Filtrar los elementos menores a 5
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
# Imprimir la lista
print(lista)
