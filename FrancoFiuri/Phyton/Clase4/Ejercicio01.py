# Ejercicio 1: Llenar una lista
# LLenar una lista con los números del 1 al 50, luego mostrar
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...-50

# lista = []        este metodo es mas largo.
# i = 1
# while i <= 50:
#     lista.append(i)
#     i += 1
lista = list(range(1, 51))  #algoritmo eficaz, se utiliza 1 sola línea.
for i in lista:
    print(i, end="-")