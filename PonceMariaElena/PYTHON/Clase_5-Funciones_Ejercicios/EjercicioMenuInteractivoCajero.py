#EJERCICIO 8: MENU INTERACTIVO CAJERO AUTOMATICO
#Hacer un programa que sumule un cajero automatico con un saldo
#inicial de 1000$ y tendra el siguiente menu de opciones:
#1. Ingresar dinero a la cuenta
#2. Retirar dinero de la cuenta
#3. Mostrar dinero disponible
#4. Salir

saldo = 1000

while True:
    print("\nBienvenido al cajero automatico")
    print("\n MENÚ")
    print("1. Ingresar dinero a la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Ingrese una opción: "))
    print()
    if opcion == 1:
        extra = float(input("Cuanto dinero desea ingresar: "))
        saldo += extra
        print(f"Dinero en la cuenta: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar: "))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
            print(f"Dinero en la cuenta: ${saldo}")
    elif opcion == 3:
        print(f"Dinero en la cuenta: ${saldo}")
    elif opcion == 4:
        print("Gracias por utilizar el cajero automatico")
        break
    else:
        print("Opción incorrecta")