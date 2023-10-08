#Ejercicio 5: Factorial de un numero positivo
#Hacer un programa para calcular el factorial de un numero

numero=int(input("Digite un numero positivo: "))
while numero<0:
    numero=int(input("Digite un numero positivo: "))
factorial=0
for i in range(1,numero+1):
    factorial=factorial*i
print("El factorial de ",numero," es: ",factorial)