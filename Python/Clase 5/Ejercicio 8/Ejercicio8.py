# Ejercicio 8: Menú Interactivo - Cajero Automático.
# Hacer un programa que simule un cajero automático con un saldo inicial de 1000$ y el siguiente menú de opciones:
# 1. Ingresar dinero en la cuenta.
# 2. Retirar dinero de la cuenta.
# 3. Mostrar dinero disponible.
# 4. Salir

Saldo = 1000

while True:
    print("\n--MENÚ DE OPCIONES--")
    print("1. Ingresar dinero en la cuenta.")
    print("2. Retirar dinero de la cuenta.")
    print("3. Mostrar dinero disponible.")
    print("4. Salir")

    Op = int(input("Ingresar una opción del menú: "))
    print()

    if Op == 1:
        Ingresar = float(input("¿Cuánto dinero desea ingresar?: "))
        Saldo += Ingresar
        print(f"Dinero en la cuenta: ${Saldo}")
    elif Op == 2:
        Retirar = float(input("¿Cuánto dinero desea retirar?: "))
        if Retirar > Saldo:
            print("No posee tal cantidad de dinero en su cuenta")
        else:
            Saldo -= Retirar
            print(f"Dinero en la cuenta: ${Saldo}")
    elif Op == 3:
        print(f"Dinero en la cuenta: ${Saldo}")
    elif Op == 4:
        print("Gracias por utilizar su cajero automático. ¡Hasta pronto!")
        break
    else:
        print("Número ingresado incorrecto")
        print()