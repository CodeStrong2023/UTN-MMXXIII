# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.

import random # importamos la funcion random.
print('\t.:Juego Adivina el número:.')
aleatorio = random.randint(0, 100) # Toma de 0 a 100 literal, generamos un numero aleatorio.
contador = 0
while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print('\tNo es el numero, digite un numero menor')
    elif numero < aleatorio:
        print('\tNo es el numero, digite un numero mayor')
    else:
        print(f'FELICITACIONES, ACABAS DE ADIVINAR EL NUMERO {aleatorio}')
        break # Rompe el ciclo y el bucle
print(f"\nNumero de intentos: {contador}")