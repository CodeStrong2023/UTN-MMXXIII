# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no debe hacer repetición)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

# Creamos las listas.
lista1 = [1, 2, 3, 4, 4, 5, 6, 6, 7, 8]
lista2 = [3, 3, 5, 2, 4, 2, 6, 7, 8, 9]

# Eliminamos los elementos repetidos con conjuntos

conjunto1 = set(lista1)
conjunto2 = set(lista2)

# Unimos los dos conjuntos
union = list(conjunto1 | conjunto2)
print(f"Lista de palabras que aparecen en las listas: {union}")

# Mostramos el primer conjunto
solo1 = list(conjunto1 - conjunto2)
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda: {solo1}")

# Mostramos el segundo conjunto
solo2 = list(conjunto2 - conjunto1)
print(f"Lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}")

# Mostramos ambas listas
interseccion = list(conjunto1 & conjunto2)
print(f"lista de palabras que aparecen en ambas listas: {interseccion}")