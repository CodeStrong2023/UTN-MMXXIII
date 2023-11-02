# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaría de insertar.
# Por ultimo, mostrar los números ordenados de menor a mayor.

lista = []
salir = False

while not salir:
    numero = int(input('Digite un número: '))
    if numero == 0: #si el usuario introduce el 0 entonces el ciclo while se termina y se completa la lista.
        salir = True
    else:
        lista.append(numero)
lista.sort()   # La función sort sirve para ordenar la lista
print(f'\nLista ordenada: \n{lista}')