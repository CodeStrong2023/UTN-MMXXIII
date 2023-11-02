# Colas
# Estuctura de datos FIFO (First In First Out)
cola = ['Maria', 'Jose', 'Luis', 'Karla']

# Agregar elementos a la cola por el final
cola.append('Lorenzo')
cola.append('Maria')

print('la cola queda asi: ', cola)

# sacar elementos de la cola por el principio
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print('la cola queda asi: ', cola)
