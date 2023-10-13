#Ejercicio 6:table de multiplicar
#Hacer un programa que pida un numero por teclado y guarde
#en una lista su tabla de multiplicar hasta el 10. Por ejemplo,
#si pide el 5 la lista tendra: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Digite un numero: "))
lista=[]
for i in range(1, 11):
    lista.append(numero*i)
print(f'La tabla de multiplicar del {numero} es: {lista}')

for indice, i in enumerate(lista):
    print(f'{numero} x {i} = {lista[indice]}')