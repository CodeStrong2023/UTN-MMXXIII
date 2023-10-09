#Ejercicio 5: Convertidor de temperaturas
#realizar dos funciones para convertir de grados a celsius
#a fahrenheit y viceversa
#Investigar las formulas

def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_a_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

celsius = float(input('Ingrese la temperatura en grados celsius: '))
resultado = celsius_a_fahrenheit(celsius)
print(f'{celsius} C a F --> {resultado} F')

fahrenheit = float(input('Ingrese la temperatura en grados fahrenheit: '))
resultado = fahrenheit_a_celsius(fahrenheit)
print(f'{fahrenheit} F a C --> {resultado} C')