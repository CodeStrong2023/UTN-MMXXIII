# POO en Python

class Persona:  # Creamos una clase.
    # Pass. No se procesa nada más. No tiene contenido. Sale de la identación.
    # Para agregar atributos a la clase se usa el método "__init__".
    # El constructor se encuentra oculto.
    def __init__(self, Nombre, Apellido, Edad, DNI, *args, **kwargs):
        # self es un parámetro obligatorio que apunta a la inicializacion de un objeto. Es un
        # parámetro por default.

        # Los atributos son características.

        self.nombre = Nombre  # self.nombre es un atributo de la clase.
        self.apellido = Apellido
        self._DNI = DNI  # Este atributo está encapsulado de una manera sugerida.
        self.edad = Edad
        self.args = args
        self.kwargs = kwargs

    # Métodos de instancia
    # Crear UML (Unified modeling language)
    # Los métodos son el comportamiento de los objetos, acciones. Son funciones asociadas a una clase.
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: Nombre = {self.nombre} | Apellido = {self.apellido} | Edad = {self.edad} | DNI {self._DNI} | Dirección = {self.args} | Datos importantes = {self.kwargs}")


Persona1 = Persona("Matias", "Piris", 20, 44663429)  # Creamos un objeto de la clase Persona
# print(Persona1.nombre) # Hacer el print igual que con el objeto 2
# print(Persona1.apellido)
# print(Persona1.edad)

Persona2 = Persona("Lucas", "Piris", 23, 42905128)

print(f"OBJETO2: Hola, mi nombre es {Persona2.nombre} {Persona2.apellido} y tengo {Persona2.edad} años")

# Mostrar el OBJETO1

print(f"OBJETO1: Hola, mi nombre es {Persona1.nombre} {Persona1.apellido} y tengo {Persona1.edad} años")


# Referencias de memoria de objetos con el Debuger
# Modificar atributos de un objeto
Persona1.nombre = "Matias Nicolas"
Persona1.apellido = "Piris"
Persona1.edad = 21
print(f"OBJETO1_MODIFICADO: Hola, mi nombre es {Persona1.nombre} {Persona1.apellido} y tengo {Persona1.edad} años")

# Llamar metodo.
# Atributos = características.
# Métodos = son el comportamiento que tendrán los objetos (acciones).
Persona1.mostrar_detalle()  # En este caso, la referencia se pasa de manera automática.
Persona2.mostrar_detalle()

# Persona.mostrar_detalle(Persona1) - Debemos pasarle una referencia para el self o dará error.
Persona1.telefono = "2604653540"
print(f"El teléfono de {Persona1.nombre} {Persona1.apellido} es: {Persona1.telefono}")  # Se ha creado un atributo a un objeto.

# print.(Persona2.telefono) - Como el objeto no tiene el atributo "telefono" salta error.

Persona3 = Persona("Juan", "Palacios", 34, 38425716, "Calle Sarmiento", 726, "Manzana", 82, "Casa", 6, Altura = 1.90, Peso = 71, ColorFavorito = "Rosa", Auto = "Peugot", Modelo = 2019)
Persona3.mostrar_detalle()
# print(Persona3._DNI) - Esto no debe utilizarse en Python (se encuentra encapsulado).

# Persona3.__nombre - Está completamente encapsulado