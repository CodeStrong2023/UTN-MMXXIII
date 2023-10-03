#sacar raiz cuadrada
import math
numero = int(input("Digite un numero positivo: "))
while numero < 0:
    print("Error, el numero debe ser positivo")
    numero = int(input("Digite un numero positivo: "))
print("La raiz cuadrada de ", numero, " es: ", math.sqrt(numero))
