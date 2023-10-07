# Ejercicio 3: Insertar elementos y ordenarlos
#Pedir numeros y meterlos en una lista, cuando el usuario 
#introduzca un 0 ya dejaremos de insertar.
#por ultimo, morstrar los numeros de menor a mayor


lista = []
salir = False
while not salir:
    numero = int(input('Ingrese un numero: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

lista.sort()
print(f'\n Lista ordenada: \n{lista}')
