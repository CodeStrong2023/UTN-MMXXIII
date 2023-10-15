#funciones valores por default

def funcion_suma(a,b):
    return a + b

resultado = funcion_suma() #si no se pasan argumentos da error

#hay que darle un valor por default
def funcion_suma(a=0,b=0):
    return a + b
print(funcion_suma()) #ahora si funciona

#se pueden pasar argumentos y se sobreescriben los valores por default
print(funcion_suma(2,3))

