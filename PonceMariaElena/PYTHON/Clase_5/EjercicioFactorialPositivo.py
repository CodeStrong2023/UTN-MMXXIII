#Ejercicio 5: Factorial de un numero positivo
#Hacer un programa para calcular el factorial de un numero positivo

numero = int(input("Ingrese un numero: "))

while numero < 0:
    numero = int(input("Error -> Ingrese un numero positivo: "))

factorial = 1
for i in range(1, numero+1):
    factorial *= i
    
print(f"\nEl factorial del numero {numero} positivo ingresado es: {factorial}")