# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numero divisibles entre 3
# Ejemplo de ejecucion: 0,3,6,9

print("Ejercicio 1: Rango de 0 a 10 con numeros divisibles entre 3")
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos
# Ejemplo de ejecucion: 2,3,4,5,6

print("Ejercicio 2: Rango de 2 a 6")
rango = range(2, 7)
for i in rango:
    print(i)

# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
# Ejemplo de ejecicion: 3,5,7,9

print("Ejercicio 3: Rango de 3 a 10 pero con incremento de 2 en 2")

rango2 = range(3, 11, 2) #inicio en 3, hasta 11 con paso 2
for i in rango2:
    print(i)