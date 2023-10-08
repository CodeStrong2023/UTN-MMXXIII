#tipo set

#set es una coleccion desordenada de valores unicos, no permite duplicados
#los elementos no se pueden modificar pero si agregar nuevos o eliminar
#no tiene indice ----- se usan llaves

planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)
print(len(planetas))

#revisar si un elemento esta presente
print("Marte" in planetas)

#agregar elementos
planetas.add("Tierra")
print(planetas)

#eliminar con remove   
#da error si el planeta no existe
planetas.remove("Jupiter")
print(planetas)

#eliminar con discard
planetas.discard("Tierra")
print(planetas)

#limpiar el set
planetas.clear()
print(planetas)

#eliminar el set
del planetas