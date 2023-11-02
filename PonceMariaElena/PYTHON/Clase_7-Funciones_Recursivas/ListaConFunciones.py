#

def desplegar_nombres(nombres):
    for nombre in nombres:
        print(nombre)

nombres = ["Juan","Karla","Guillermo","Maria"]

desplegar_nombres(nombres) #se pasa como argumento la lista de nombres

desplegar_nombres("Carlos") #se pasa como argumento un string

#desplegar_nombres(1) #se pasa como argumento un entero y marca error porque no es iterable

desplegar_nombres((1,2,3,4,5)) #se pasa como argumento una tupla agregando parentesis y no marca error porque es iterable. si es uno solo hay que ponerlo con coma (19,)

desplegar_nombres([1,2,3,4,5]) #se pasa como argumento una lista agregando corchetes y no marca error porque es iterable





