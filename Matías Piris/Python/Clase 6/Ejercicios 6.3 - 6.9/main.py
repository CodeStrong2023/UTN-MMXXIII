# Funciones
# mi_funcion() no se puede llamar antes de definir a una función
# Definir una función

def mi_funcion():  # Utilizar parentesis para identificar la función
    print("Hola Mundo")


mi_funcion()  # Llamando función
mi_funcion()  # Se puede llamar N cantidad de veces

# Desempaquetado de listas (o list Unpacking)
def show(name, lastName):
    print(name + " " + lastName)
Persona = ["Matias", "Piris"]
show(Persona[0], Persona[1])  # Pasa uno a uno los datos de la lista a la función
show(*Persona)  # Lo mismo que lo anterior, pero pasa todo junto
Persona2 = ("Lucas", "Piris")  # Desempaquetado a través de una tupla
show(*Persona2)
Persona3 = {"lastName": "Piris", "name": "Valentina"}
show(**Persona3)

# Repaso Ciclo For-Else

numbers = [1,2,3,4,5]  # Aún con la lista vacia, se ejecutará el else

for N in numbers:
    print(N)
    if N == 3:
        break  # Es la única manera para que no se ejecute el else
else:
    print("Esto se acabó")

# Lista de comprensión (o list comprehension)

names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"]  # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
          ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (Funciones)

def mi_funcion2(name, lastName):
    print("Hola a todos")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Matias", "Piris")
mi_funcion2("Lucas", "Piris")
mi_funcion2("Valentina", "Piris")

# Palabra return en funciones
# Crear función para sumar

def sumar(a,b):
    return a + b
# Resultado = sumar(78, 22)
# print(f"El resultado de la suma es: [resultado]")
print(f"El resultado de la suma es: {sumar(55,45)}")

# Default
def sumar2(a = 0, b = 0):  # Damos un valor por sumar
    return a + b
Resultado = sumar2()
print(f"Resultado de la suma: {Resultado}")
print(f"Resultado de la suma: {sumar2(22,66)}")

# Argumentos y variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza: *args
    for nombre in nombres:  #Se convierte en una tupla
        print(nombre)
listarNombres("Lucas", "José", "Claudia", "Rosa", "María")
listarNombres("Marcos", "Daniel", "Romina", "Pepe", "Marcelina", "Carlos")
