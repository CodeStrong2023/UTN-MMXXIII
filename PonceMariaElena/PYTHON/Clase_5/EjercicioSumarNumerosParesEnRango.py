#Ejercicio 4: Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares
#dentro de un rango por ejemplo
#suma de numeros pares del 2 al 30
#suma = 240
a = int(input("Ingrese donde va a comenzar la suma: "))
b = int(input("Ingrese dhasta donde va a llegar la suma: "))

suma = 0
for i in range(a, b+1):
    if i % 2 == 0:
        suma += i
print(f"\nLa suma de los numeros pares dentro del rango es: {suma}")
