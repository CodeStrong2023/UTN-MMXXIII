# Ejercicio 3: Insertar elementos y ordenarlos
# Ingresar números y meterlos en una lista. Cuando se introduzca un número 0, el programa dejara de insertar.
# Por último, mostrar los números ordenados de mayor a menor.

Lista = []
Salir = False

while not Salir:
    N = int(input("Ingrese un número: "))
    if N == 0:
        Salir = True
    else:
        Lista.append(N)
Lista.sort()  # La lista se ordena con esta función
print(f"\nLista ordenada: \n{Lista}")
