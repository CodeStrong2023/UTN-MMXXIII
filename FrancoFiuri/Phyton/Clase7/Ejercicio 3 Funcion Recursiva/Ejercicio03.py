# Ejercicio 03: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Pude ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada

def imprimir_num(numero):
    if numero >= 1: #Caso Base.
        print(numero)
        imprimir_num(numero-1)  #Caso recursivo.
    elif numero == 0:
        return
    elif numero <= 0:
        print('El valor es incorrecto, debe ser positivo.')
imprimir_num(0)

# Caso en que el usuario ingresa el numero.

numero_recursivo = int(input("Ingrese un numero positivo: "))
imprimir_num(numero_recursivo)