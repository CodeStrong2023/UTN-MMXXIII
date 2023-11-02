#Ejercicio 5 : Convertidor de grados Celsius a Farenheit
#Realizar dos funciones para convertir de grados celsius a farenheit y viceversa


def celsius_farenheit(celsius):
    return celsius * 9 / 5 + 32 #formula

def farenheit_celsius(farenheit):
    return (farenheit - 32) * 5 / 9 #formula

celsius = float(input("Ingrese los grados Celsius: "))
resultado = celsius_farenheit(celsius)
print(f"{celsius} grados Celsius son {resultado} grados Farenheit")

farenheit = float(input("Ingrese los grados Farenheit: "))
resultado = farenheit_celsius(farenheit)
print(f"{farenheit} grados Farenheit son {resultado} grados Celsius")
