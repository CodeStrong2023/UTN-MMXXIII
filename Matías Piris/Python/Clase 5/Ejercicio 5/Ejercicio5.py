# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

N = int(input("Ingrese un número: "))

while N < 0:  # Mientras el número sea negativo
    print("Error. El número debe ser positivo")
    N = int(input("Ingrese un número: "))

Factorial = 1  # La variable para calcular el factorial

for I in range(1, N + 1):
    Factorial *= I
print(f"\nEl factorial del número {N} positivo ingresado es: {Factorial}")

