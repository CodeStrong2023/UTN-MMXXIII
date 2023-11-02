class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property #decorador
    def nombre(self):   #Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):   #Metodo Setter
        print('Estamos utilizando el metodo set')
        self._nombre = nombre
    
    @property #decorador
    def apellido(self):   #Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):   #Metodo Setter
        print('Estamos utilizando el metodo set')
        self._apellido = apellido
    
    @property #decorador
    def edad(self):   #Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._edad
    
    @edad.setter
    def edad(self, edad):   #Metodo Setter
        print('Estamos utilizando el metodo set')
        self._edad = edad
    
    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == '__main__':
    persona1 = Persona2('Franco', 'Fiuri', 29)
    print(persona1.nombre)   #Llamamos al metodo getter
    persona1.nombre = 'Maximo' #Aqui estamos utilizando el metodo set para cambiar el valor del atributo.
    print(persona1.nombre) # Otra vez con el metodo getter
    print(persona1.mostrar_detalles())  # Llamamos el metodo mostrar_detalles
    # Atributo read-only seria la edad porque no tiene el metodo set
    # print(persona1.edad)

    # Tarea crear tres objetos mas utilizando los metodos getter and setter
    # Para modificar, y mostrar los cambios.

    #Objeto 1 de la tarea
    persona2 = Persona2('Barbara', 'Acuña', 25)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Barbi'
    persona2.apellido = 'Acuna'
    persona2.edad = 26
    print(persona2.mostrar_detalles())

    #Objeto 2 de la tarea
    persona3 = Persona2('Tomas', 'Godoy', 27)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Tomi'
    persona3.apellido = 'Godoi'
    persona3.edad = 24
    print(persona3.mostrar_detalles())

    print(__name__)