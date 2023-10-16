#Realizar la obtencin de un factorial de manera recursiva solicitando al usuario que ingrese el numero a calcular
numero = int(input("Ingrese el numero a calcular el factorial: "))

def factorial(numero):
    if numero == 1:
        return 1 #caso base
    else:
        return numero * factorial(numero-1) #caso recursivo
    
resultado = factorial(numero) 
print(f"El factorial del numero {numero} es: {resultado}")