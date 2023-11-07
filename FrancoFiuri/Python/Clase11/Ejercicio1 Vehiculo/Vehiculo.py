class Vehiculo:
    '''
    Definir una clase pare llamada Vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo. La clase
    padre debe tener los siguientes atributos y métodos:

    Vehiculo (clase padre)
    - Atributos(color, ruedas)
    - Métodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de Vehiculo)
    - Atributos(velocidad(km/hr))
    - Métodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(clase hija de Vehiculo)
    - Atributos(tipo(urbana/montaña, etc.))
    - Métodos(__init__(color, ruedas, tipo) y __str__())

    Crear un objeto de cada clase
    '''
    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas
    @property
    def color(self):
        return self._color
    
    @color.setter
    def color(self, color):
        self._color = color
    
    @property
    def ruedas(self):
        return self._ruedas
    
    @ruedas.setter
    def ruedas(self, ruedas):
        self._ruedas = ruedas
    
    def __str__(self):  # Override = Sobreescribir
        return  f'Vehiculo: [ Color: {self._color}, ruedas: {self._ruedas} ]'

class Auto(Vehiculo):     #Esta clase es hija de la clase Vehiculo
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velocidad = velocidad

    @property
    def velocidad(self):
        return self._velocidad
    
    @velocidad.setter
    def velocidad(self, velocidad):
        self._velocidad = velocidad
    
    def __str__(self):
        return f'{super().__str__()} Auto: [Velocidad: {self._velocidad} km/hr]'

class Bicicleta(Vehiculo):     #Esta clase es hija de la clase Vehiculo
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo

    @property
    def tipo(self):
        return self._tipo
    
    @tipo.setter
    def tipo(self, tipo):
        self._tipo = tipo
    
    def __str__(self):
        return f'{super().__str__()} Bicicleta: [Tipo: {self._tipo}]'

vehiculo1 = Vehiculo('Blanco', 4)
print(vehiculo1)
vehiculo2 = Auto('Rojo', 4, 100)
print(vehiculo2)
vehiculo3 = Bicicleta('Azul', 2, 'montaña')
print(vehiculo3)