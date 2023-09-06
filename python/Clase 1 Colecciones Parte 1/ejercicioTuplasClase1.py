#----- Ejercicio ------

tupla = (13,1,8,3,2,5,8)
#crear lista con menores de 5
#imprimir por consola [1,3,2]

lista=[]
for elemento in tupla:
    if elemento<5:
        lista.append(elemento)
print(lista)