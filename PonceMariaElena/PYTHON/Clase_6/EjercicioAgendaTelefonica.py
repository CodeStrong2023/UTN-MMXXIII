#Ejercicio 11: Agenda telefonica
#hacer un programa que simule una agenda telefonica. Crear un 
#Diccionario donde la clave sea el nombre de los contactos y el
#valor sea el numero de telefono. El programa debe tener un menu
#con las siguientes opciones:
#1- Nuevo contacto
#2- Borrar contacto
#3- Ver contactos existentes
#4- Salir

agenda = {}

while True:
    print("\t MENU")
    print("1- Nuevo contacto")
    print("2- Borrar contacto")
    print("3- Ver contactos existentes")
    print("4- Salir")
    
    opcion = int(input("Ingrese una opcion: "))
    
    if opcion == 1:
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el telefono del contacto: ")
        agenda[nombre] = telefono
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado")
        else:
            print("El contacto ya existe")
    elif opcion == 2:
        nombre = input("Ingrese el nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print("Contacto borrado")
        else:
            print("El contacto no existe")
    elif opcion == 3:
        print("Agenda de contactos ")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por usar la agenda")
        break
    else:
        print("Opcion incorrecta")
    

                