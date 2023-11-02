class Cubo:
    """ 
    Crear la clase Cubo con los atributops, ancho, alto y profundidad, con
    un metodo calcular_volumen que tendra la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores. 
    """
    def _init_(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura *self.profundidad
    
ancho = int(input('Digite el ancho del cubo: '))
altura = int(input('Digite el ancho del cubo: '))
profundidad = int(input('Digite el ancho del cubo: '))

cubo1 = Cubo(ancho, altura, profundidad)
print(f'El volument del cubo es:  {cubo1.calcular_volumen()}')