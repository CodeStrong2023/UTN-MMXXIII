#Comprension de listas o list comprehension
#para tomar lo necesario nomas, sin tocar lo demas

names = ["Rodrigo", "Pepe", "Jose", "Ana", "Paula", "Mariano"]

alongP = [p for p in names if p[0] =="P"] #Esto regesa una nueva lista con los nombres que empiezan con P
#p es el elemento de la lista names, y se le asigna a la nueva lista alongP si cumple con la condicion

print(alongP)

#con diccionarios

bottleC = [{"name": "Quilmes", "country": "Argentina"}, {"name": "Corona", "country": "Mexico"}, {"name": "Heineken", "country": "Holanda"}]

Arg = [b for b in bottleC if b["country"] == "Argentina"] #Esto regresa una nueva lista con las cervezas que son de Argentina

print(Arg)