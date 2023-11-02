# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arguero
# Raza: Elfo Sindar

# Creamos la lista original
personajes = []
# Creamos diccionarios
P1 = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dúnadan del norte'}
personajes.append(P1) # Agregamos a la lista un personaje

P2 = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P2) # Agregamos a la lista un personaje

P3 = {'Nombre': 'Legolas', 'Clase': 'Arguero', 'Raza': 'Elfo Sindar'}
personajes.append(P3) # Agregamos a la lista un personaje

print(f"Lista de personajes inicial: {personajes}")

# Definimos los personajes a agregar:

# Nombre: Gimli
# Clase: Hachero
# Raza: Enano de Durin

# Nombre: Frodo
# Clase: Portador de anillo
# Raza: Hobbit de la Comarca

# Nombre: Sam
# Clase: Protector del anillo
# Raza: Hobbit de la Comarca

# Creamos diccionarios
P4 = {'Nombre': 'Gimli', 'Clase': 'Hachero', 'Raza': 'Enano de Durin'}
personajes.append(P4) # Agregamos a la lista un personaje

P5 = {'Nombre': 'Frodo', 'Clase': 'Portador de anillo', 'Raza': 'Hobbit de la Comarca'}
personajes.append(P5) # Agregamos a la lista un personaje

P6 = {'Nombre': 'Sam', 'Clase': 'Portador de anillo', 'Raza': 'Protector del anillo'}
personajes.append(P6) # Agregamos a la lista un personaje

print(f"Lista de personajes final: {personajes}")