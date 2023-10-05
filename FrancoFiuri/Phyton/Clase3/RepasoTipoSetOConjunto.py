# Repaso de set o conjunto
# Para definir un conjunto

Conjunto = set()
Conjunto1 = {'bye',}

# Con las llaves solas no se puede iniciar, tiene que tener un elemento

Conjunto.add(4)
Conjunto.add("Hola")
print(Conjunto)

# No se puede usar extend en los sets, se agrega de a un elemento.

Conjunto1.add("Hola")
print(Conjunto1)

print(3 not in Conjunto1)  # Preguntar si el elemento NO esta en el conjunto. devuelve un booleano

# Como hacer igualdad de dos conjuntos

print(Conjunto == Conjunto1)  # Devuelve un booleano

# Operaciones en conjuntos

Conjunto3 = Conjunto1 | Conjunto  # la linea une los dos conjuntos
print(Conjunto3)

# Intersección
# Elementos que están en los dos conjuntos

Conjunto3 = Conjunto1 & Conjunto  # Que elementos están en los dos conjuntos
print(Conjunto3)

# Diferencia
# Elementos que están en el primer conjunto pero no en el segundo

Conjunto3 = Conjunto1 - Conjunto
print(Conjunto3)

Conjunto3 = Conjunto - Conjunto1  # Elementos que están en el segundo conjunto pero no en el primero
print(Conjunto3)

Conjunto3 = Conjunto ^ Conjunto1  # Elementos que están en uno de los dos conjuntos pero no en los dos
print(Conjunto3)

# SubConjunto

Conjunto3 = Conjunto1 | Conjunto
print(Conjunto1.issubset(Conjunto3))  # Pregunta si el conjunto1 es subconjunto de conjunto3

# Como saber si ambos conjuntos son superset

print(Conjunto3.issuperset(Conjunto1))  # Pregunta si el conjunto3 es superset de conjunto1 o sea si estan todos los elementos de conjunto1 en conjunto3

# Como saber si dos conjuntos son disjuntos

print(Conjunto3.isdisjoint(Conjunto1))  # Pregunta si conjunto3 y conjunto1 son disjuntos, si no tienen elementos en comun

# Como hacer que un conjunto sea inmutable

Conjunto3 = frozenset