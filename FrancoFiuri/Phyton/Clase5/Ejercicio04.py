# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
#                           suma de números pares del 2 al 30
#                           suma = 240

a = int(input('Digite de donde va a comenzar la suma: '))
b = int(input('Digite hasta donde quiere llegar a sumar: '))
suma = 0
for i in range(a,b+1): # Se coloca el +1 para que itere hasta una posición mas.
    if i%2==0:  # Esto significa que el numero es par
        suma += i # Si el numero es par entonces se agrega a la variable suma.
print(f'\nLa suma de número pares dentro del rango es: {suma}')