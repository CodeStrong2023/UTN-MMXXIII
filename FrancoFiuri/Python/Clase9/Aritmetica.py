class Aritmetica:
    """
    El nombre de esete tipo de comentario es: DocString
    esto es documentación de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    def resta(self):
        return self.operandoA - self.operandoB
    
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7, 9)  # Le pasamos los argumentos para los operandos
print(f'la suma de los números es: {aritmetica1.sumar()}')
print(f'la resta de los números es: {aritmetica1.resta()}')
print(f'la multiplicación de los números es: {aritmetica1.multiplicar()}')
print(f'la división de los números es: {aritmetica1.dividir():.2f}')