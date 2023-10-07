pila = [1, 2, 3, 4, 5]
# Agregar elementos a la pila po rel final
# El ultimo elemento en entrar es el primero en salir

pila.append(6)
pila.append(7)
print(pila)

# Sacar elementos de la pila por el final
elementoBorrado = pila.pop()
print('sacamos el ultimo elemento {elementoBorrado}')
print('La pila queda asi: {pila}')
