class Persona: # Creamos una clase
    # pass # No se procesa nada mas (No tiene contenido)
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')    #dentro del metodo se utiliza self para poder llamar  a otro metodo.


persona1 = Persona('Franco', 'Fiuri', 38289863, 29) # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}')
persona2 = Persona('Tomas', 'Godoy', 41445345, 25)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}')

persona1.nombre = 'Barbara'
persona1.apellido = 'Acuña'
persona1.edad = 25
print(f'El objeto1 de la clase persona modificado: {persona1.nombre} {persona1.apellido} {persona1.edad}')

# Los atributos son: caracteristicas
# los métodos son: el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1)   # Si llamamos al metodo desde la clase, si tenemos que pasarle una referencia
persona1.telefono = '434535464' # Creamos un atributo a un objeto fuera del metodo.
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') #Hemos creado un atributo de un objeto

# print(persona2.telefono)    # No podemos utilizar el atributo telefono en persona2 porque no esta creado dentro del metodo.

persona3 = Persona('Rogelio', 'Romero', 38289863, 22, 'Telefono', '2614445557', 'Calle Lopez', 822, 'Manzana', 77, 'Casa', 18, Altura=1.83, Peso=105, CFavorito= 'Azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
# print(persona3._dni) # Esto no se debe utilizar (esta encapsulado), eso dice que desconocemos python.
# persona3.__nombre # Esta totalmente encapsulado.