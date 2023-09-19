# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación.
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos una lista.
lista = [1, 2, 3, 3, 4, 5, 6, 6, 7]
print(f'La lista es la siguiente: ',lista)

#pasamos la lista a un conjunto para que se eliminen los elementos repetidos
#conjunto = set(lista)
#lista = list(conjunto)


#la otra forma de realizarlo en una sola línea de código (mas eficiente) es la siguiente:

lista =list(set(lista)) #primero lo convierte a conjunto y luego a lista, y lo guarda en la variable Lista.

print(f'La nueva lista es la siguiente: ',lista)