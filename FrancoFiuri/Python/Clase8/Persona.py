class Persona: # Creamos una clase
    # pass # No se procesa nada mas (No tiene contenido)
    def __init__(self, nombre, apellido, edad): # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')    #dentro del metodo se utiliza self para poder llamar  a otro metodo.


persona1 = Persona('Franco', 'Fiuri', 29) # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}')
persona2 = Persona('Tomas', 'Godoy', 25)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}')

persona1.nombre = 'Barbara'
persona1.apellido = 'Acuña'
persona1.edad = 25
print(f'El objeto1 de la clase persona modificado: {persona1.nombre} {persona1.apellido} {persona1.edad}')

# Los atributos son: caracteristicas
# los métodos son: el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()