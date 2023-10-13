#Ejercicio 3: Funcion Recursiva
#imprimir numeros de 5 a 1 de manera desendente usando funciones recursivas
#puede ser cualqueir valor positivo, por ejemplo, si pasamos el
#valor de 5, debe imprimir:
#5
#4
#3
#2
#1
#en caso que el nuemro sea 3, debe imprimir:
#3
#2
#1
#si se ingresan numero negativos no imprime nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero - 1)
    elif numero == 0:
        return
    elif numero < 0:
        print('Valor ingresado incorrecto')