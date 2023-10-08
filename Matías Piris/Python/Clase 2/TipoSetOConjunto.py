# Tipo set

# Set es una coleccion desordenada de valores unicos, no permite duplicados
# Los elementos no se pueden modificar pero si agregar nuevos o eliminar
# No tiene indice ----- Se usan llaves

Planetas = {"Marte", "Jupiter", "Venus"}
print(Planetas)
print(len(Planetas))

# Revisar si un elemento esta presente

print("Marte" in Planetas)

# Agregar elementos

Planetas.add("Tierra")
print(Planetas)

# Eliminar con remove
# Da error si el planeta no existe

Planetas.remove("Jupiter")
print(Planetas)

# Eliminar con discard

Planetas.discard("Tierra")
print(Planetas)

# Limpiar el set

Planetas.clear()
print(Planetas)

# Eliminar el set

del Planetas
