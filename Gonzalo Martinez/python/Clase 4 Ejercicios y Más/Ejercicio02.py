#Ejercicio 2 Modificar los Elemento de una Lista
#llenar  una lista con los numeros del 1 al 10, luego modificarlos
#elemtos de la lista multiplicandolos por un valor que se ingresa por teclado

lista= list(range(1,11))
print("lista original: ")

for i in lista:
    print(i, end="-")
valor = int(input('\n Ingrese el valor a multiplicar: '))
for indice, i in enumerate(lista):
    lista[indice] *= valor

print(f'Lista final con los elementos multiplicados por {valor}: ')
for i in lista:
    print(i, end='-')