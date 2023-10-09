#Ejercicio 11: Agenda telefonica
#Hacer un programa que simule una agenda de contactos. Crear un
#diccionario donde la clave sea el nombre del usuario y el valor
#sea el telefono, el programa tendra el menu de opciones:
#       1. Nuevo contacto
#       2. Borrar contacto
#       3. Ver contactos existentes
#       4. Salir
agenda = {}
while True:
    print("\t.:MENU:.")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Ingrese una opcion: "))
    if opcion == 1:
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el telefono del contacto: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado exitosamente")
        else:
            print("Contacto ya existe")
    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto? : ")
        if nombre in agenda:
            del agenda[nombre]
            print("Contacto borrado")
        else:
            print("Contacto no encontrado")
    elif opcion == 3:
        print("Contactos existentes")
        for nombre, telefono in agenda.items():
            print("Nombre :",nombre,"Telefono", telefono)
    elif opcion == 4:
        print("Gracias por usar su agenda de contactos")
        break
    else:
        print("Opcion incorrecta")