# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa.
# Investigar las formulas

# De Celsius a Fahrenheit
def celsius_farenheit(celsius):
    return celsius * 9 / 5 + 32 # La presedencia: multiplicacion, division y suma 

# De Fahrenheit a Celsius
def farenheit_celsius(farenheit):
    return (farenheit - 32) * 5 / 9

celsius = float(input('Digite el valor de celsius: '))
resultado = celsius_farenheit(celsius)
print(f'{celsius} C a F -> {resultado:.2f}')

farenheit = float(input('Digite el valor de farenheit: '))
resultado = farenheit_celsius(farenheit)
print(f'{farenheit} F a C -> {resultado:.2f}')