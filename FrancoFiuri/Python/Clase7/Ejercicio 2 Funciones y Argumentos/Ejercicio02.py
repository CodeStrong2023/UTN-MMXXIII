# Ejercicio 02: Funcion con *args para multiplicar
# Crear una función para multiplicar argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicar(*args):    # Recibimos una cantidad de parametros indefinidos
    resultado = 1 # Utilizamos el 1 ya que el 0 nos daria valor nulo.
    # iteramos cada elemento
    for valor in args:
        resultado *= valor
    return resultado
# Llamamos a la funcion
print(multiplicar(5,6))
