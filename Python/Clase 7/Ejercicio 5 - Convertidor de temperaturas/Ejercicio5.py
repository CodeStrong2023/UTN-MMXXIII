# Ejercicio 5: Convertidor de temperaturas.
# Realizar dos funciones para convertir de grados Celsius a Fahrenheit y viceversa. Investigar las formulas.

# De Celsius a Fahrenheit
def C_F(Celcius):
    return (Celcius * 9 / 5) + 32


# De Fahrenheit a Celsius
def F_C(Fahrenheit):
    return (Fahrenheit - 32) * 5 / 9


Celcius = float(input("Ingrese un valor en grados Celsius: "))
Res = C_F(Celcius)
print(f"{Celcius}ºC es igual a = {Res:.2f}ºF")

Fahrenheit = float(input("Ingrese un valor en grados Fahrenheit: "))
Res = F_C(Fahrenheit)
print(f"{Fahrenheit}ºF es igual a = {Res:.2f}ºC")