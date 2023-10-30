class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    Documentación de la clase en Python
    Se harán algunas operaciones de: suma, resta, multiplicación y más.
    """

    def __init__(self, A, B):
        self.A = A
        self.B = B

    # Método de suma.
    def Suma(self):
        return self.A + self.B

    # Método de resta.
    def Resta(self):
        return self.A - self.B

    # Método de multiplicación.
    def Multiplicacion(self):
        return self.A * self.B

    # Método de división.

    def Division(self):
        return self.A / self.B


Aritmetica1 = Aritmetica(8, 9)  # Se le asigna argumentos a los operandos A y B.
print(f"La suma de los números es: {Aritmetica1.Suma()}")
print(f"La resta de los números es: {Aritmetica1.Resta()}")
print(f"La multiplicación de los números es: {Aritmetica1.Multiplicacion()}")
print(f"La división de los números es: {Aritmetica1.Division():.2f}")

