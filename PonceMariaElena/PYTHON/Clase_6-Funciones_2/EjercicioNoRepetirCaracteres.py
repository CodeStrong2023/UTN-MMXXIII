#Ejercicio 10: No repetir Caracteres
#Hacer un programa que pida una cadena por teclado luego
#meter los caracteres en una lista sin repetirlos

cadena = input("Ingrese una cadena: ")
lista = []

for i in cadena:
    if i not in lista:
        lista.append(i)
print(f"\nLista de caracteres sin repetir: {lista}")