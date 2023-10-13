#Ejercicio 7: juego adivina el numero
#realizar un juego para adivinar un numero. Para ello se debe
#generar un numero aleatorio entre 1-100, y luego ir pidiendo
#numeros indicando "es mayor" o "es menor" segun sea el caso.
#con respecto al numero que se genero para adivinarlo.
#El proceso termina cuando el usuario acierta 
#y mostrar el numero de intentos.
import random
aleatroio=random.randint(1,100)
contador=0
numero=int(input("Digite un numero: "))
contador+=1
while True:
    if numero>aleatroio:
        print("El numero es menor")
    elif numero<aleatroio:
        print("El numero es mayor")
    else:
        print(f"Felicitaciones adivinaste el numero {aleatroio} en {contador} intentos")
        break