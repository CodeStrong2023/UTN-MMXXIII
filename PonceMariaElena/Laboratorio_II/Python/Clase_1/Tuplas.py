#---------- Parte 1 ------- 
#definir tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(len(cocina))

#acceder a un elemento
print(cocina[0])
#mostrar invorso
print(cocina[-1])

#acceder a rangos
print(cocina[0:1]) 
# se muestra parentesis y coma
#sin coma no hay tupla verduras =("tomate") no es tupla 
#deberia ser verdura = ("tomate",)

#----------- Parte 2 ----------
#recorrer elementos
for cocinar in cocina:
    print(cocinar, end=" ")#se usa end para sacar saltos de linea

cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print(cocina)

#eliminar
del cocina
