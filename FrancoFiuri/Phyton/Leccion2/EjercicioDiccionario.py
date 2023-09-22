# Agregar al siguiente diccionario 5 jugadores mas.
seleccionArgentina = {
    10: {'Nombre': 'Lionenl Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 35, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Portero'},
}
#for llave, valor in seleccionArgentina.items():
#   print(llave, valor)

#Agregamos los jugadores

seleccionArgentina = {
    10: {'Nombre': 'Lionenl Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 35, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    1:  {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Portero'},
    23: {'Nombre': 'Emiliano Martínez', 'Edad': 31, 'Altura': 1.95, 'Precio': '28 Millones', 'Posicion': 'Portero'},
    7:  {'Nombre': 'Rodrigo de Paul', 'Edad': 29, 'Altura': 1.80, 'Precio': '40 Millones', 'Posicion': 'Mediocentro'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 24, 'Altura': 1.76, 'Precio': '65 Millones', 'Posicion': 'Mediocentro'},
    22: {'Nombre': 'Lautaro Martínez', 'Edad': 26, 'Altura': 1.74, 'Precio': '85 Millones', 'Posicion': 'Delantero Centro'},
    8:  {'Nombre': 'Enzo Fernández', 'Edad': 22, 'Altura': 1.78, 'Precio': '80 Millones', 'Posicion': 'Pivote'},
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)