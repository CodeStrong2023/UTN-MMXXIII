# Colas
# Estuctura de datos FIFO (First In First Out)
Cola = ['Maria', 'Jose', 'Luis', 'Karla']

# Agregar elementos a la cola por el final
Cola.append('Lorenzo')
Cola.append('Maria')

print('la cola queda de la siguiente manera: ', Cola)

# Sacar elementos de la cola por el principio

seRetira = Cola.pop(0)

print(f'Atendido el cliente: {seRetira}')
print('la cola queda de la siguiente manera: ', Cola)
