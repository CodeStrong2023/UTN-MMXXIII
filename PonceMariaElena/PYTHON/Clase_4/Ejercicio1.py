#Ejercicio 1:Eliminar duplicados de una lista
#Escribir un programa donde tenga una lista y que a continuacion elimine los elementos repetidos, por ultimo mostrar la lista

#Se crea la lista
lista = [1,"Alberto",3,4,"Ariel",6,7,8,"Ariel",10,1,"Alberto",3,4,5]
#conjunto = set(lista) #convertimos la lista a un conjunto tipo ser
#lista = list(conjunto) #convertimos el conjunto a una lista
lista = list(set(lista)) #convertimos la lista a un conjunto y luego el conjunto a una lista
print(lista) #imprimimos la lista