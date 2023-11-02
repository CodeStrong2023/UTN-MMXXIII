#Desempaquetado de listas o list Unpacking

def show(name, lastname):
    print(f"Nombre: {name}, Apellido: {lastname}")

person = ["Maria", "Ponce"]
show(person[0], person[1])#pasar datos de a uno
show(*person)#pasar todos los datos

#se usa tambien con tuplas
person = ("Maria", "Ponce")
show(*person)

#con diccionarios
person = {"name":"Maria", "lastname":"Ponce"}
show(**person)

