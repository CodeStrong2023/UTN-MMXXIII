# Ejercicio 4: Sumar números pares dentro de un rango.
# Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
# Suma de números pares del 2 al 30 // Suma = 240.

A = int(input("Ingrese de donde comienza la suma: "))
B = int(input("Digite hasta donde quiere llegar la suma: "))

Suma = 0

for I in range(A,B+1):
    if I % 2 == 0:  #Si el resto es igual a 0, es par
        Suma += I
print(f"\nLa suma de números para dentro del rango es: {Suma}")