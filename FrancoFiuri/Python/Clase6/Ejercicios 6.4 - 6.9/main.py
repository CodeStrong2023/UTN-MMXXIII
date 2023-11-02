# Funciones
# Definimos una función
def mi_funcion():   # Se debe respetar la tabulacion para que este dentro de la función.
    print('Hola mundo')

mi_funcion()    # Llamamos a la función.
mi_funcion()    # Se puede llamar a una función N cantidad de veces

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ["Franco", "Fiuri"]
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion.
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto.
person2 = ("osvaldo", "Giordanini") # desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3) # En este caso debemos utilizar dos asteriscos ya que recorre dos elementos (clave y valor)

numbers = [1, 2, 3, 4, 5] # Aun con la lista vacia se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print('Esto se termino')

# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName): # Parametros para cuando se crea la funcion
    print("Saludos a todos los que ven a través del canal de Youtube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero') # Argumentos para cuando llamamos a la funcion.
mi_funcion2('Franco', 'Fiuri') # Podemos llamar a la funcion con distintos argumentos

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a,b):
    return a + b    # Utilizamos return para que nos devuelva el resultado de la operacion.
# resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55,45)}')    #Podemos llamar a la funcion desde print.

def sumar2(a = 0, b = 0): # Le damos un valor por default a los parametros para que no hayan inconvenientes.
    return a + b
resultado = sumar2()
print(f'El resultado de la suma es: {resultado}') # Al no darle argumentos a la funcion, nos va a devolver el valor por default
print(f'El resultado de la suma es: {sumar(22, 66)}') # Si le indicamos argumentos va a reemplazar los de default.

# Argumentos, variables en funciones
def listarNombres(*nombres):  # Utilizando * toma TODOS los argumentos utilizados y los agrega a la funcion. Normalmente utilizamos *args
    for nombre in nombres: # Se convierte la variable nombre en una tupla.
        print(nombre)
listarNombres('Franco','Damian','Leandro','Antonio')
listarNombres('Barbara','Tomas','Yamil','Anyi')