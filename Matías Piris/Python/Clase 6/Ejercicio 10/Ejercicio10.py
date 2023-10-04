# Ejercicio 10: No repetir caracteres.
# Hacer un programa que pida una cadena por teclado. Luego meter los caracteres en una lista sin repetir.

Cadena = input("Ingrese una cadena: ")
Lista = []

for I in Cadena:
    if I not in Lista:  # Si el carácter no está en la lista.
        Lista.append(I)  # Se agrega a la lista.

print(f"\nLista de caracteres sin repetir ninguno: \n {Lista}")