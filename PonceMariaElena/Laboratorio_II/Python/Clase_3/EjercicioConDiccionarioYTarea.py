# Ejercicio
# La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina, lo elementos a ingresar deben ser como mínimo 4, estos elementos son los jugadores con su número de camiseta, nombre, apellido, edad, altura, precio y posición de juego, por supuesto ver el video anterior.
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Portero'},
    23: {'Nombre': 'Emiliano Martínez', 'Edad': 29, 'Altura': 1.94, 'Precio': '20 Millones', 'Posicion': 'Portero'},
    6: {'Nombre': 'Germán Pezzella', 'Edad': 30, 'Altura': 1.85, 'Precio': '10 Millones', 'Posicion': 'Defensa Central'},
    4: {'Nombre': 'Gonzalo Montiel', 'Edad': 24, 'Altura': 1.79, 'Precio': '10 Millones', 'Posicion': 'Lateral Derecho'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 27, 'Altura': 1.80, 'Precio': '40 Millones', 'Posicion': 'Mediocentro'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 27, 'Altura': 1.80, 'Precio': '50 Millones', 'Posicion': 'Mediocentro'},
    22: {'Nombre': 'Lautaro Martínez', 'Edad': 24, 'Altura': 1.74, 'Precio': '80 Millones', 'Posicion': 'Delantero Centro'},
    18: {'Nombre': 'Guido Rodríguez', 'Edad': 27, 'Altura': 1.87, 'Precio': '25 Millones', 'Posicion': 'Mediocentro'},

}

print(seleccionArgentina[10])
print(seleccionArgentina.values())

for llave in seleccionArgentina.keys():
    print(llave)

for valor in seleccionArgentina.values():
    print(valor)

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print('Tenemos cargados en la lista la cantidad de:')
print(len(seleccionArgentina), 'jugadores')
