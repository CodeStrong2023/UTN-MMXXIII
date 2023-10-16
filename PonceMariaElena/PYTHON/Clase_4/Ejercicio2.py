#Ejercicio 2: operaciones de conjuntos con listas
#scriba un programa que tenga 2 listas y que a continuacion
#cree las siguientes listas(en  las que no deben haber repeticion)
#1 lista de palabras que aparecen en las listas
#2 lista de palabras que aparecen en la primera lista pero no en la segunda
#3 lista de palabras que aparecen en la segunda lista pero no en la primera
#4 lista de palabras que aparecen en ambas listas

#crear dos listas 
lista1 = [1,4,3,4,5,6,7,8,6,1,9,2,8,4]
lista2 = [1,7,3,3,5,2,9,8,5,1,1,2,3,4]

#Eliminar los elementos repetidos de ambas listas con conjuntos
conjunto1 = list(set(lista1))
conjunto2 = list(set(lista2))

#unir los dos conjuntos
union = list(conjunto1 | conjunto2)
#solo mostrar conjunto1
solo1 = list(conjunto1 - conjunto2)
#solo mostrar conjunto2
solo2 = list(conjunto2 - conjunto1)
#mostrar los elementos que estan en ambos conjuntos
interseccion = list(conjunto1 & conjunto2)

#imprimir los conjuntos
print(f"Lista de palabras que aparecen en las listas: {union}")
print(f"Lista de palabras que aparecen en la primera lista pero no en la segunda: {solo1}")
print(f"Lista de palabras que aparecen en la segunda lista pero no en la primera: {solo2}")
print(f"Lista de palabras que aparecen en ambas listas: {interseccion}")









