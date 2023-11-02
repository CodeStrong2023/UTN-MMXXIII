class Rectangulo:
    """
    Crear una clase llamada ractangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = base* al
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura
    
base = int(input('Digite el numero para la base del rectangulo: '))
altura = int(input('Digite el numero para la altura del rectangulo: '))
rectangulo1 = Rectangulo(base, altura)

print(f'El area del rectangulo es: {  rectangulo1.calcular_area()  }')