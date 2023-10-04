# Ejercicio 7: Adivina un número.
# Realizar un juego para adivinar un número. Para ello, se debe generar un número aleatorio entre 1-100.
# Luego, ir pidiendo números indicando "es mayor" o " es menor" con respecto a N.
# El proceso termina cuando el usuario acierta y se debe mostrar el número de intentos.

import random
Aleatorio = random.randint(0,100)  # Del 0 al 100, genera un número aleatorio.
C = 0

print("\nJuego - Adivina el número")

while True:
    N = int(input("Ingrese un número: "))
    C += 1
    if N > Aleatorio:
        print("\nNúmero Incorrecto. Digite un número menor")
    elif N < Aleatorio:
        print("\nNúmero Incorrecto. Digite un número mayor")
    else:
        print(f"¡FELICITACIONES! HAS ACERTADO. El número a adivinar era {Aleatorio}")
        break  # Rompe el ciclo y el bucle.

print(f"\nNumero de intentos: {C}")
