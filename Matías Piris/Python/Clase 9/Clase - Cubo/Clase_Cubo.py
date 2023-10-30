class Cubo:
    """
    Crear la clase Cubo con los atributos Ancho, Alto y Profundidad, con un método para calcular el volúmen.
    Fórmula: "Volumen = Ancho * Altura * Profundidad". El usuario debe ingresar los valores.
    """

    def __init__(self, Ancho, Altura, Profundidad):
        self.Ancho = Ancho
        self.Altura = Altura
        self.Profundidad = Profundidad

    def CalcularVolumen(self):
        return self.Ancho * self.Altura * self.Profundidad


Ancho = int(input("Ingrese el ancho del cubo: "))
Altura = int(input("Ingrese la altura del cubo: "))
Profundidad = int(input("Ingrese la profundidad del cubo: "))

Cubo1 = Cubo(Ancho, Altura, Profundidad)
print(f"El volumen del cubo es: {Cubo1.CalcularVolumen()}")
