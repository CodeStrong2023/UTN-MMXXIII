# Ejercicio 2: operaciones de conjuntos con listas.
# Escribir un programa que tenga dos listas y que, a continuación. cree las siguientes listas (sin repetición):
# 1 - Lista de palabras que aparecen en las listas.
# 2 - Lista de palabras que aparecen en la primera lista, pero no en la segunda.
# 3 - Lista de palabras que aparecen en la segunda lista, pero no en la primera.
# 4 - Lista de palabras que aparecen en ambas listas

Lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 2, 1, 5]
Lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]

# Eliminar los elementos repetidos de ambas listas con conjuntos

Conjunto1 = set(Lista1)
Conjunto2 = set(Lista2)

Union = list(Conjunto1 | Conjunto2)  # Unión de ambos conjuntos
Solo1 = list(Conjunto1 - Conjunto2)  # Muestra el conjunto 1
Solo2 = list(Conjunto2 - Conjunto1)  # Muestra el conjunto 2
Interseccion = list(Conjunto2 & Conjunto1)  # Mostrar ambas listas

print(f"Lista de palabras que aparecen en las listas:  {Union}")
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda: {Solo1}")
print(f"Lista de palabras que aparecen en la segunda lista, pero no en la primera: {Solo2}")
print(f"Lista de palabras que aparecen en ambas listas: {Interseccion}")
