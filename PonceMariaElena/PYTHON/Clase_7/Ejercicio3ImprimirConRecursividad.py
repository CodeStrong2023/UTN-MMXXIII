#Ejercicio 3: Funcion recursiva
#Imprimir numeros de 5 a 1 de manera descendente usando recursividad
#Puede ser cualquier valor positivo, por ejemplo si pasamos el 5 debe imprimir:
#5
#4
#3
#2
#1
#Si se ingresa negativo no hace nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1: #caso base
        print(numero)
        imprimir_numeros_recursivos(numero-1) #caso recursivo
    elif numero == 0:
        return
    elif numero <=0:
        print("Valor no valido")
        
imprimir_numeros_recursivos(5) #hardcodeado

#Tarea: que el numero lo ingrese el usuario

numero = int(input("Ingrese el numero a imprimir: "))
imprimir_numeros_recursivos(numero)