#Ejercicio 6 : Tabla de multiplicar
#Hacer un programa que pida un numero por teclado y guarde
#en la lista su tabla de multiplicar hasyael 10.Por ejemplo
#si digita el 5 la lista tendra: 5,10,15,2025,30,35,40,45,50

numero = int(input("Digite un numero: "))
lista = []

for i in range(1,11):
    lista.append(numero*i)

print(f"\nTabla de multiplicar del {numero}: \n {lista}")

#Para ver el formato como tabla de multiplicar
for indice,i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}")