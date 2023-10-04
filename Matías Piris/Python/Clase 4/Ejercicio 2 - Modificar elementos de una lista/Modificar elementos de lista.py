# Ejercicio 2: Modificar elementos de una lista.
# Llenar una lista con números del 1 al 10.
# Luego modificar los elementos de la lista multiplicandolos por un valor ingresado por el usuario.

Lista = list(range(1,11))
print("Lista original: ")
for I in Lista:
    print(I, end="-")

Valor = int(input("\nDigitar un valor a multiplicar: "))

# Multiplicar todos los elementos de la lista

for Indice, I in enumerate(Lista):
    Lista[Indice] *= Valor

print(f"Lista con los elementos multiplicados por {Valor}")
for I in Lista:
    print(I, end="-")
