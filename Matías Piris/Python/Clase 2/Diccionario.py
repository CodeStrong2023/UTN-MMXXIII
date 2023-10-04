# Diccionrio
# Clave o llave:valor
# No se puede modificar, pero si agregar nuevos o eliminar
# No tiene indice ----- se usan llaves

Diccionario = {
    "IDE": "Integrated Development Enviroment",
    "OOP": "Object Oriented Programming",
    "SABD": "Sistema de administración de base de datos"
}

# Cantidad de elementos

print(len(Diccionario))
print(Diccionario)

# Acceder a un elemento

print(Diccionario["IDE"])

# Otra forma de acceder a un elemento

print(Diccionario.get("OOP"))
print(Diccionario.get("SABD"))

# Modificar elementos

Diccionario["IDE"] = "Entorno de desarrollo integrado"
print(Diccionario)

# Recorrer elementos

for Termino in Diccionario:
    print(Termino)

# Se necesita función para recorrer diccionario

for Termino, Valor in Diccionario.items():
    print(Termino, Valor)

# Otra forma de acceder

for Termino in Diccionario.keys():
    print(Termino)

for Valor in Diccionario.values():
    print(Valor)

# Comprobar existencia de un elemento

print("IDE" in Diccionario)

# Agregar elementos

Diccionario["PK"] = "Primary Key"
print(Diccionario)

# Eliminar elementos

Diccionario.pop("IDE")  # Elimina por llave

# Limpiar diccionario

Diccionario.clear()
print(Diccionario)

# Eliminar diccionario

del Diccionario

