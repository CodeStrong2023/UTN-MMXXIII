# Ejercicio 3: Agregar personajes a una lista
# Escribir un programa donde se cree una lista con los siguientes personajes del "El Señor de los Anillos"

# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del Norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Légolas
# Clase: Arquero
# Raza: Elfo Sindar

Pers = []  # Crear lista vacía

# Crear diccionarios

P = {"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del Norte"}
Pers.append(P)  # Agregar un personaje a la lista
P = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
Pers.append(P)
P = {"Nombre": "Légolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
Pers.append(P)

print(Pers)

