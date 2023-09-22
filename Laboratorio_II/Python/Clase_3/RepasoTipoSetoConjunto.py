#Repaso de set o conjunto
#Para definir un conjunto
conjunto = set()
conjunto1 = {'bye',}
#con las llaves solas no se puede iniciar, tiene que tener un elemento
conjunto.add(4)
conjunto.add("Hola")
print(conjunto)

#no se puede usar extend en los sets, se agrega de a un elemento.
conjunto1.add("Hola")
print(conjunto1)

print(3 not in conjunto1) #preguntar si el elemento NO esta en el conjunto. devuelve un booleano

#como hacer igualdad de dos conjuntos
print(conjunto == conjunto1)#devuelve un booleano

#operaciones en conjuntos
conjunto3 = conjunto1 | conjunto #la linea une los dos conjuntos
print(conjunto3)

#interseccion
#elementos que estan en los dos conjuntos

conjunto3 = conjunto1 & conjunto #que elementos estan en los dos conjuntos
print(conjunto3)

#diferencia
#elementos que estan en el primer conjunto pero no en el segundo
conjunto3 = conjunto1 - conjunto
print(conjunto3)

conjunto3 = conjunto - conjunto1#elementos que estan en el segundo conjunto pero no en el primero
print(conjunto3)

conjunto3 = conjunto ^ conjunto1#elementos que estan en uno de los dos conjuntos pero no en los dos
print(conjunto3)

#subconjunto
conjunto3 = conjunto1 | conjunto
print(conjunto1.issubset(conjunto3))#pregunta si el conjunto1 es subconjunto de conjunto3

#como saber si ambos conjuntos son superset
print(conjunto3.issuperset(conjunto1))#pregunta si el conjunto3 es superset de conjunto1 o sea si estan todos los elementos de conjunto1 en conjunto3

#como saber si dos conjuntos son disjuntos
print(conjunto3.isdisjoint(conjunto1))#pregunta si conjunto3 y conjunto1 son disjuntos, si no tienen elementos en comun

#como hacer que un conjunto sea inmutable
conjunto3 = frozenset



