
# ---------- Parte 1-----------------
nombres = ['Natalia', "Paola", "Patricia", "Hector", "Nerea"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

# ------------- Parte 2 ----------------
print(nombres[0:2])  # muestra indices 0 y 1
print(nombres[:3])  # muestra indice 0,1,2
print(nombres[1:])  # muestra desde indice 1 al final

# modificacion de valores
nombres[2] = "Monica"
nombres[0] = "Jesica"
print(nombres)

# iteraciones
for nombre in nombres:
    print(nombre)
else:
    print("No hay más elementos en la lista")

# -------- Parte 3 ------------
print(len(nombres))  # tamaño de la lista

nombres.append("Marcela")  # se agrega elemento
print(nombres)

# agregando en indice especifico
nombres.insert(1, "Nidia")
print(nombres)
nombres.insert(3, "Neida")
print(nombre)

# eliminar
nombres.remove("Monica")
print(nombres)

# eliminar ultimo elemento
nombres.pop()
print(nombres)

# eliminar indice especifico
del nombres[2]
print(nombres)

# borrar todos los elementos de la lista
nombres.clear()
print(nombre)

# eliminar lista
del nombres
