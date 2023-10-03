# Ejercicio 4: Calculadora de Impuestos.
# Crear una función para calcular el total de un pago incluyendo un impuesto aplicado (IVA).
# Fórmula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100).
# Proporcione el pago sin impuesto: 1000.
# Proporcione el monto del impuesto: 21%.
# Pago con impuesto: XXXXX.

# Crear la función que calcula el pago, sin incluir el impuesto.
def CalculoPagoTotal(PagoSinImp, Impuesto):
    PagoTotal = PagoSinImp + PagoSinImp * (Impuesto/100)
    return PagoTotal


PagoSinImp = float(input("Ingresar el pago sin impuesto: "))
Impuesto = float(input("Ingresar el impuesto a aplicar: "))
PagoSinImp = CalculoPagoTotal(PagoSinImp, Impuesto)

print(f"El pago, con impuesto aplicado, es: {PagoSinImp}")