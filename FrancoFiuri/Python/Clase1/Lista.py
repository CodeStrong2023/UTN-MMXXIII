# ---------- Primera Parte -----------------
# Las listas se definen con corchetes.

Nombres = ['Natalia', "Paola", "Patricia", "Hector", "Nerea"]

print(Nombres)
print(Nombres[0])
print(Nombres[1])
print(Nombres[3])
print(Nombres[-1])
print(Nombres[-2])

# ------------- Segunda Parte ----------------

print(Nombres[0:2])  # Muestra los indices 0 y 1
print(Nombres[:3])  # Muestra los indices 0,1,2
print(Nombres[1:])  # muestra desde el índice 1 al final

# Modificacion de valores

Nombres[2] = "Monica"
Nombres[0] = "Jesica"
print(Nombres)

# Iteraciones
for Nombre in Nombres:
    print(Nombre)
else:
    print("No hay más elementos en la lista")

# ------------- Tercera Parte ----------------

print(len(Nombres))  # Tamaño de la lista

Nombres.append("Marcela")  # Se agrega un elemento
print(Nombres)

# Agregando en indice especifico

Nombres.insert(1, "Nidia")
print(Nombres)
Nombres.insert(3, "Neida")
print(Nombre)

# Eliminar

Nombres.remove("Monica")
print(Nombres)

# Eliminar el ultimo elemento

Nombres.pop()
print(Nombres)

# Eliminar un indice especifico

del Nombres[2]
print(Nombres)

# Borrar todos los elementos de la lista

Nombres.clear()
print(Nombres)

# Eliminar lista

del Nombres