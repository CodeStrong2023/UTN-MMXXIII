from Persona2 import Persona2
print('Creacion de objetos'.center(50, '-'))
if __name__ == '__main__':
    persona4 = Persona2('Franco','Fiuri', 29)
    persona4.mostrar_detalles()

    print(__name__)

print('Eliminacion de Objetos'.center(50, '-'))
del persona4
