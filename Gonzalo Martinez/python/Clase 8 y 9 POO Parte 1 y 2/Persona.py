class Persona:
    def __init__(self, nombre, apellido, dni, edad,*args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self._dni= dni # Este atributo esta encapsulado de manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self._dni} {self.edad}, la direccion es: {self.args}, los datos importantes son : {self.kwargs}')

persona1 = Persona('Ariel', 'Bentarcud',34543534, 40)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona('Osvaldo', 'Giordanini', 45)
print(f'El objeto2 de la clase persona : {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Bruccella'
persona1.edad = 40
print(f'El objeto1 de la clase persona : {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos
persona1.mostrar_detalle()#aqui pasa de forma automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle(persona1) #Debemos pasarle una referencia para el self o dara error
persona1.telefono = "34234234234234"
print(f'Este es el teleono: {persona1}') #hemos creado un atributo de un objeto

#print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero',342353454, 22, 'telefono', '3213123123', 'Calle Lopez',823, 'Manzana', 77,'casa', 18, Altura = 1.83, Peso=105, CFavorito='azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
#print(persona3._dni) esto no se debe utilizar