#Ejercicio 2: Modificar los elementos de una lista
#Llenar una lista con los numeros del 1 al 10 luego modificar los
#Elementos multiplicandolos porun valor ingresado por el usuario

#crear lista vacia
lista = list(range(1,11))
print("Lista original")

for i in lista:
    print(i, end="-")

valor = int(input("\nIngrese un valor para multiplicar la lista: "))
#modificar elementos de la lista
for i in range(len(lista)):
    lista[i] *= valor

print(f"Lista final con los elementos multiplicados por {valor}")
for i in lista:
    print(i, end="-")
    
    