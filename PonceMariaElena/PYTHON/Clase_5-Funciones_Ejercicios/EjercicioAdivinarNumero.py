#Ejercicio 7 : Juego adivina el numero
#Realizar un juego para adivinar un numero. Para ello se debe
#Generar un numero aleatorio entre 1-100, y luego ir pidiendo 
#numeros indicando "es mayor" o "es menor" segun sea el caso
#con respecto a N. El proceso termina cuando el usuario acierta
#y mostrar el numero de intentos.

import random

print("Juego adivina el numero")
aleatorio = random.randint(0,100) # Roma de 0 a 100 literal, generamos un numero aleatorio

contador = 0

while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    
    if numero == aleatorio:
        print(f"FELICIDADES, acertaste el numero es {numero}.\n Acertaste en: {contador} intentos")
        break
    elif numero > aleatorio:
        print("El numero es menor")
    else:
        print("El numero es mayor")
        
print("Fin del juego")

