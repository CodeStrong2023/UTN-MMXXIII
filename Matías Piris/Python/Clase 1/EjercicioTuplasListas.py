# Dada la siguiente tupla:

Tupla = (13, 1, 8, 3, 2, 5, 8)

# Crear una lista que sólo incluya los números menor que 5
# Imprimir por consola [1,3,2]

Lista = []  # Definir la lista

# Filtrar los elementos menores a 5

for Elemento in Tupla:
    if Elemento < 5:
        Lista.append(Elemento)

# Imprimir la lista

print(Lista)
