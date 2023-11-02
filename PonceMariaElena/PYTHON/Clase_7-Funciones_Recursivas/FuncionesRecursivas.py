#Funciones recursivas
#requieren un caso base y un caso recursivo

def factorial(numero):
    if numero == 1:
        return 1 #caso base
    else:
        return numero * factorial(numero-1) #caso recursivo
    
resultado = factorial(5) #5*4*3*2*1 = 120
print(f"El factorial del numero es: {resultado}")