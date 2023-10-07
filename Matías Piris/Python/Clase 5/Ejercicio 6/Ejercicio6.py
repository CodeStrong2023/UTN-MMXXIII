# Ejercicio 6: Tabla de multiplicar.
# Hacer un programa que pida un número por teclado y guarde en una lista su tabla de multiplicar hasta el 10.
# Por ejemplo: si digita el 5, la lista tendrá: 5,10,15,20,25,30,35,40,45,50.

N = int(input("Digite un número: "))
Lista = []  # Crear lista vacía.

for I in range(1,11):
    Lista.append(N*I)

print(f"\nTabla de multiplicar de {N}: ")

for Indice, I in enumerate(Lista):
    print(f"{N} * {Indice + 1} = {I}")  # Ciclo para ver el formato de una tabla de multiplicar
