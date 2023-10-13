#desempaquetado de listas o list unpacking
def show(name, lastçName):
    print(name, lastçName)
person = ["Ariel", "Betancud"]
show(person[0], person[1])
show(*person) #desempaquetado de listas o list unpacking
person2 = ("Osvaldo", "Giordanini")
show(*person2)
person3 = {"lastName":"Lucero", "name":"Natalia"}
show(**person3) 
#repaso ciclo for
numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
    if n == 3:
        break
else:
    print("No hay mas numeros")

#list comprehension, listas de comprension
names= ["Paolo", "Rodrigo", "Lupe","Pepe"]
alongP = [p for p in names if p[0]=="p"]#regresa una neuva lista
print(alongP)

bottlec= [{"name":"Quilmes", "Country":"arg"},
          {"name":"Corona", "Country":"mex"},
          {"name":"Stella Artois", "Country":"Belgium"}]

Arg = [b["name"] for b in bottlec if b["Country"]=="arg"]
print(Arg)
print(bottlec)

#paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves del canal de YouTube")
    print(f'Nombre: {name} Apellido: {lastName}')
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Analia", "Pedrosa")

#palabra return en funciones
def suma(a,b):
    return a+b
#print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {suma(55,43)}')

def suma2(a=0,b=0):# le damos un valor por default
    return a+b
resultado = suma2()
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {suma2(22,39)}')

#Argumentos, variables en funciones
def listarNombres(*nombres):#Normalmente se utiliza *args
    for nombre in nombres:# se va a convertir en una tupla
        print(nombre)
listarNombres("Ariel", "Jorge", "Analia", "Natalia")
listarNombres("Ariel", "Jorge", "Analia", "Natalia", "Osvaldo", "Rodrigo")