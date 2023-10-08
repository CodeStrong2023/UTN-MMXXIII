conjunto2 = set()
conjunto1 = {'bye',}
conjunto.add(7)
conjunto.add("hola")
print(conjunto)

conjunto1.add('bye')
print(conjunto1)
#si esta
print (3 not in conjunto)
#igualdad
print(conjunto == conjunto1)

## operaciones
#union
conjunto3 =conjunto2 | conjunto1 #la linea los une
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #elemntos en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 #elementos que no estan en el otro
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 #elementos que no estan en el otro
print(conjunto3)
print(conjunto2.issuperset(conjunto3))
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issuperset(conjunto2))

print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issubset(conjunto3))

#como saber si ambos conjutnos son disconexos
print(conjunto1.isdisjoint(conjunto2)) #no en comun

#hacer inmutabnle un conjunto
conjunto1 = frozenset(conjunto1) 
