class Aritmetica:
   """
   el nombre de este tipo de comentario es: DocString.
   esto es documentacion de la clase en python
   vamos a hacer algunas operaciones de: suma, resta, multiplicaciopn y mas

   """
   def __init__(self, operandoA, OperandoB):
       self.operandoA = operandoA
       self.operandoB = OperandoB

   # Metodo para sumar
   def sumar(self):
       return self.operandoA + self.operandoB
   
   def resta(self):
       return self.operandoA - self.operandoB
   
   def multiplicar(self):
       return self.operandoA * self.operandoB
   
   def dividir(self):
       return self.operandoA / self.operandoB




Aritmetica1 = Aritmetica(3,4) # le pasamos los argumentos para los operandos

print(Aritmetica1.sumar())
print(f'la resta de los numeros : {Aritmetica1.resta()}')
print(f'la multiplicacion de los numeros es : {Aritmetica1.multiplicar()}')
print(f'La divicion de los numeros es: {Aritmetica1.dividir():2f}')

