# Importamos la clase MATH para poder utilizarla
import math

# Calculamos la raiz cuadrada de un número

numero = int(input('Digite un numero positivo'))
while numero < 0:
    print('Error el numero debe ser un numero positivo.')
    numero = int(input('Digite un numero positivo'))
print(f'\nSu raíz cuadrada es: {math.sqrt(numero):.2f}') #.2f es para mostrar, solamente 2 digitos despues de la coma.
