Nombres = ["Rosana", "Juana"]

# Se pueden agregar cualquier tipo de valor a la lista.
Nombres.append(4) # Enteros
Nombres.append(True) # Booleanos
Nombre = ["José", "Santiago", "Maria"] # Cadenas
Nombres.append(3.1416) # Flotantes

print(Nombres)

# Concatenar listas
lista = Nombres + Nombre
print(lista)

# Extender la lista con elementos individuales
lista.extend([3, 2, 1])

# Buscar índice de un elemento
print(lista.index("Rosana"))

# Contar elementos repetidos
print(lista.count("Rosana"))

# Lista al revés
lista.reverse()
print(lista)

# Multiplicar elementos de la lista
lista = lista * 3

# Utilizar sorted() para ordenar la lista con un criterio de ordenamiento personalizado
lista_ordenada = sorted(lista, key=lambda x: str(x))

print(lista_ordenada)

# Ordenar en orden inverso
lista_ordenada.reverse()
print(lista_ordenada)

# Repaso de tuplas
tupla = (4, "Hola", 6.76, [1, 2, 78], 4, "Hola") # En las tuplas se pueden utilizar valores de distinto tipo.
print(tupla)

print(4 in tupla) # Devuelve True si el valor se encuentra en la tupla