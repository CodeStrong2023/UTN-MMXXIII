class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # decorador
    def nombre(self):  #  getter
        print("Usando el metodo getter")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # setter
        print("Usando el metodo setter")
        self._nombre = nombre

    @property  # decorador
    def apellido(self):  # getter
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  #  setter
        self._apellido = apellido

    @property  # decorador
    def edad(self):  #  getter
        return self._edad

    @edad.setter
    def edad(self, edad):  # setter
        self._edad = edad

    def __del__(self):  # Destructor 
        print(f"Persona: {self._nombre} {self._apellido} {self._edad}")


if __name__ == "__main__":
    persona1 = Persona2("Ariel", "Bentarcurd", 44)
    print(persona1.nombre)  # Llamamos a getter
    persona1.nombre = "Juan Pedro"  # Llamamos al método setter
    print(persona1.nombre)
    print(persona1.mostrar_detalles())
    print(persona1.edad)

    # Atributo read-only = cuando el atributo está encapsulado y no tiene un método setter
    # persona1.edad = 40
    # print(persona1.edad)
    print(" ")
    # Tarea: Crear 3 objetos más, utilizando los métodos getter and setter para modificar
    # y mostrar los cambios

    # Objeto 1
    p1 = Persona2("Jose", "Lopez", 35)
    print(p1.mostrar_detalles())
    p1.nombre = "victor"
    p1.apellido = "perez"
    p1.edad = 34
    print(p1.mostrar_detalles())

    print(" ")

    # Objeto 2
    p2 = Persona2("lana", "rodriguez", 40)
    print(p2.mostrar_detalles())
    p2.nombre = "Maria"
    p2.apellido = "Martinez"
    p2.edad = 47
    print(p2.mostrar_detalles())

    print(" ")

    # Objeto 3
    p3 = Persona2("Martin", "sid", 30)
    print(p3.mostrar_detalles())
    p3.nombre = "enrique velasquez"
    p3.apellido = "fajian"
    p3.edad = 26
    print(p3.mostrar_detalles())

    print(__name__)