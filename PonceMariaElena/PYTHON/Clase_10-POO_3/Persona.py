class Persona:

    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos son los siguientes: {
              self._nombre} {self._apellido} {self._edad}")

    @property  # decorador
    def nombre(self):  # método getter
        print("Usando el metodo getter")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # método setter
        print("Usando el metodo setter")
        self._nombre = nombre

    @property  # decorador
    def apellido(self):  # método getter
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # método setter
        self._apellido = apellido

    @property  # decorador
    def edad(self):  # método getter
        return self._edad

    @edad.setter
    def edad(self, edad):  # método setter
        self._edad = edad

    def __del__(self):  # Destructor de objetos
        print(f"Persona: {self._nombre} {self._apellido} {self._edad}")


if __name__ == "__main__":
    persona1 = Persona("Nadia", "Nuñez", 21)
    print(persona1.nombre)  # Llamamos al método getter

    persona1.nombre = "Juan Jose"  # Llamamos al método setter
    print(persona1.nombre)
    print(persona1.mostrar_detalles())

    # Atributo read-only = cuando el atributo está encapsulado y no tiene un método setter
    # persona1.edad = 40
    # print(persona1.edad)
    print(" ")
    # Tarea: Crear 3 objetos más, utilizando los métodos getter and setter para modificar
    # y mostrar los cambios

    # Objeto 1
    p1 = Persona("Pepe", "Pepito", 35)
    print(p1.mostrar_detalles())
    p1.nombre = "Juan"
    p1.apellido = "Gomez"
    p1.edad = 16
    print(p1.mostrar_detalles())

    print(" ")

    # Objeto 2
    p2 = Persona("Rosa", "Rosi", 69)
    print(p2.mostrar_detalles())
    p2.nombre = "Mariano"
    p2.apellido = "Nulis"
    p2.edad = 47
    print(p2.mostrar_detalles())

    print(" ")

    # Objeto 3
    p3 = Persona("Juana", "Siri", 30)
    print(p3.mostrar_detalles())
    p3.nombre = "Maria Elena"
    p3.apellido = "Ponce"
    p3.edad = 26
    print(p3.mostrar_detalles())

    print(__name__)
