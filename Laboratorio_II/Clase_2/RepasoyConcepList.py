nombres = [ "Rosana", "Juana"]

nombres.append(4)
nombres.append(True)
nombre = ["José","Santiago","Maria"]
nombres.append(3.1416)

print(nombres)

#concatenar listas
lista = nombres + nombre
print(lista)
lista.extend(3,2,1)

#buscar indice elemento
print(lista.index("Rosana"))

#como saber si hay repetidos
print(lista.count("Rosana"))

#lista al reves
lista.reverse()
print(lista)

#una lista se muiltiplica repitiendo elemt
lista = lista * 3

#metodos de ordenamiento
lista.sort()
print(lista)
lista.sort(reverse=True)

#repaso tuplas
tupla =(4, "Hola", 6.76,[1,2,78],4,"Hola" )
print(tupla)

print(4 in tupla)
