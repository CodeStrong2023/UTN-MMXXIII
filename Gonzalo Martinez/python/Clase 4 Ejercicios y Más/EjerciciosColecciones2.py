#Ejercicio 2: Operaciones de conjuntos con listas
#escribir un programa que tenga dos listas
#cree listas (no deben tener repeticion)
#1 lista de palabras que aparecen en la listas
#2lista de palabras que aparecen en la priemra y no en la segunda
# 3 lista de palabras que aparecen en la segunda y no en la primera
# 4 lista de palabras que aparecen en ambas

lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 1, 5]
lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]

#eliminar repetidos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2)
solo1 = list(conjunto1 - conjunto2)
solo2 = list(conjunto2 - conjunto1)
ambos = list(conjunto1 & conjunto2)

print(f"lista de palabras que aparecen en la listas: {union}")
print(f"lista de palabras que aparecen en la priemra y no en la segunda: {solo1}")
print(f"lista de palabras que aparecen en la segunda y no en la primera: {solo2}")
print(f"lista de palabras que aparecen en ambas: {ambos}")