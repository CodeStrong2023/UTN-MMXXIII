# Ejercicio 11: Agenda Telefónica
# Hacer un programa que simule una agenda de contactos.
# Crear un diccionario donde la clave sea el nombre del usuario y el valor sea el teléfono.
# El programa tendra el siguiente menú de opciones:
# 1. Nuevo Contacto
# 2. Borrar Contacto
# 3. Ver Contactos existentes
# 4. Salir

Agenda = {}

while True:
    print("\n--MENÚ DE OPCIONES--")
    print("1. Nuevo Contacto")
    print("2. Borrar Contacto")
    print("3. Ver Contactos existentes")
    print("4. Salir")

    OP = int(input("Ingrese una opción del menú: "))

    if OP == 1:
        Nombre = (input("Ingrese el nombre del contacto: "))
        Telefono = (input("Ingrese el número del contacto: "))

        if Nombre not in Agenda:
            Agenda[Nombre] = Telefono
            print("El contacto ha sido agregado exitosamente.")
        else:
            print("El nombre del contacto ya existe en la agenda")
    elif OP == 2:
        Nombre = input("Ingrese el nombre del contacto que desee eliminar: ")
        if Nombre in Agenda:
            del (Agenda[Nombre])
            print("Se ha eliminado el contacto")
        else:
            print("El contacto no existe en la agenda")
    elif OP == 3:
        print("Agenda de Contactos")
        for Clave, Valor in Agenda.items():
            print(f"Nombre: {Clave}, Teléfono: {Valor}")
    elif OP == 4:
        print("Ha salido de la agenda de contactos")
        break
    else:
        print()
        print("Número equivocado")



