class Vehiculo:
    """
    Definir una clase padre llamada Vehículo y dos clases hijas llamadas Auto y Bicicleta, las cuales heredan
    de la clase padre Vehículo. La clase padre debe tener los siguientes atributos y métodos:

    Vehiculo(clase padre)
    -Atributos(color, ruedas)
    -Métodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de Vehiculo)
    -Atributos(Velocidad(km/hr))
    -Métodos(__init__(color,ruedas,velocidad) y __str__())

    Bicicleta(clase hija de Vehiculo)
    -Atributos(tipo(urbana,montaña,etc.)
    -Métodos (__init__(color,ruedas, tipo) y __str__())

    Crear un objeto de cada clase.
    """

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "Color: " + self.color + "| Ruedas: " + str(self.ruedas)

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + "| Velocidad(km/hr): " + str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + "| Tipo: " + self.tipo


# Primer objeto de la clase padre Vehiculo.
Vehiculo = Vehiculo("Azul", 4)
print(Vehiculo)

# Segundo objeto. Esta vez de la clase Auto.
Auto = Auto("Blanco", 4, 110)
print(Auto)

# Tercer objeto. Esta vez de la clase Bicicleta.
Bicicleta = Bicicleta ("Roja", 2, "Montaña")
print(Bicicleta)

