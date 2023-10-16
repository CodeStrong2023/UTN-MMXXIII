#POO EN PYTHON

class Persona: #creamos una clase
    #pass #no se procesa nada mas, no tiene contenido, sale de la identacion
    #para agregar atributos a la clase se usa el metodo __init__
    #el constructor esta oculto
    def __init__(self, nombre, apellido, edad): #self es un parametro obligatorio que apunta a la inicializacion de un objeto, es un parametro por default
        #Los atributos son caracteristicas
        self.nombre = nombre #self.nombre es un atributo de la clase
        self.apellido = apellido
        self.edad = edad
    #Metodos de instancia
    # #Métodos de instancia. crear UML (Unified modeling language)
    #Los metodos son el comportamiento de los objetos, acciones. Son funciones asociadas a una clase.
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")
    
persona1 = Persona("Maria", "Ponce", 20) #creamos un objeto de la clase Persona
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Elena", "Ponce", 20)
print(f"OBJETO2: Hola, mi nombre es {persona2.nombre} {persona2.apellido} y tengo {persona2.edad} años")
#TAREA MOSTRAR EL OBJETO 1
print(f"OBJETO1: Hola, mi nombre es {persona1.nombre} {persona1.apellido} y tengo {persona1.edad} años")

#Referencias de memoria de objetos con el Debuger

#Modificar atributos de un objeto
persona1.nombre = "Maria Elena"
persona1.apellido = "Rodriguez"
persona1.edad = 21
print(f"OBJETO1_MODIFICADO: Hola, mi nombre es {persona1.nombre} {persona1.apellido} y tengo {persona1.edad} años")

#Llamar metodo
persona1.mostrar_detalle()
persona2.mostrar_detalle()

