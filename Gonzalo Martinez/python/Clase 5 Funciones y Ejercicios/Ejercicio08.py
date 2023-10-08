#Ejercicio 8: Menu interactivo - Cajero automatico
#hacer un programa que simule un cajero automatico con un saldo
#inicial de 1000$ y tendra  el siguiente menu de opciones:
#                   1. ingresar dinero en la cuenta
#                   2. Retirar dinero de la cuenta
#                   3. Mostrar dinero disponible
#                   4. Salir

while True:
    print("Menu")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion=int(input("Digite una opcion: "))
    if opcion==1:
        extra=float(input("Digite la cantidad de dinero a ingresar: "))
        saldo=1000+extra
        print("El saldo de su cuenta es: ",saldo)
    elif opcion==2:
        retirar=int(input("Digite la cantidad de dinero a retirar: "))
        if retirar>saldo:
            print("No tiene saldo suficiente")
        else:
            saldo=1000-retirar
            print("El saldo de su cuenta es: ",saldo)
    elif opcion==3:
        print("El saldo de su cuenta es: ",saldo)
    elif opcion==4:
        print("Gracias por usar el cajero automatico")
        break
    else:
        print("Opcion incorrecta, ingrese una opcion correcta del menu")