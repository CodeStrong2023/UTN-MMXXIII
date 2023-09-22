
#diccionrio 
#clave o llave:valor
#no se puede modificar, pero si agregar nuevos o eliminar
#no tiene indice ----- se usan llaves
#se usan llaves
diccionario = {
    "IDE": "Integrated Development Enviroment", 
    "OOP": "Object Oriented Programming",
    "SABD": "Sistema de administracion de base de datos"
}
#cantidad de elementos
print(len(diccionario))
print(diccionario)

#acceder a un elemento
print(diccionario["IDE"])

#otra forma de acceder a un elemento
print(diccionario.get("OOP"))
print(diccionario.get("SABD"))

#modificar elementos
diccionario["IDE"] = "entorno de desarrollo integrado"
print(diccionario)

#recorrer elementos
for termino in diccionario:
    print(termino)
#se necesita funcion para recorrer diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

#otra forma de acceder
for termino in diccionario.keys():
    print(termino)

for valor in diccionario.values():
    print(valor)
#comprobar existencia de un elemento
print("IDE" in diccionario)

#agregar elementos
diccionario["PK"] = "Primary Key"
print(diccionario)

#eliminar elementos
diccionario.pop("IDE")  #elimina por llave

#limpiar diccionario
diccionario.clear()
print(diccionario)

#eliminar diccionario
del diccionario

