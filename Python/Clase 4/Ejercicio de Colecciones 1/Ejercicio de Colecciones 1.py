# Ejercicio 1: eliminar duplicados de una lista.
# Escribir un programa donde tenga una lista y que, a continuación, elimine los elementos repetidos.
# Por último, mostrar la lista.

# Crear lista

Lista = [1, 2, 3, "Ariel", 7, 7, 3, "Alberto", 1, "Ariel", 2, "Alberto"]

# Conjunto = set(lista)  # Convertir lista a un conjunto de tipo set.
# Lista = list(conjunto)  # Convertir el conjunto en lista.

Lista = list(set(Lista))  # La conversión hecha en una sola línea de código (más eficiente)

print(Lista)
