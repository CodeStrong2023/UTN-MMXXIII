class Persona:  # Esta clase hereda de la clase Object.
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self): # Sobreescribir
        return f"Persona: (Nombre: {self._nombre}, Edad: {self._edad})"


class Empleado(Persona): # Clase hija de la clase Persona.
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: (Sueldo: {self._sueldo}) {super().__str__()}"


Empleado1 = Empleado("Matias", 20, 30000)

print(Empleado1.nombre)
print(Empleado1.edad)
print(Empleado1.sueldo)

# Tarea: encapsular los atributos y agregar los métodos getters and setters.
# Crear otro dato, pasar los datos para los atributos y mostrar esos datos. Luego modificar y mostrar nuevamente.

Empleado2 = Empleado("Ariel", 40, 75000)
print(Empleado2.nombre)
print(Empleado2.edad)
print(Empleado2.sueldo)

Empleado2.nombre = "Natalia"
Empleado2.edad = 35
Empleado2.sueldo = 75000
print(Empleado2.nombre)
print(Empleado2.edad)
print(Empleado2.sueldo)

