#Ejercicio 4: Calculadora de impuestos
#Crear una funcion para calcular el total de un producto incluyendo el iva
#formula: pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
#proporcione el pago sin impuesto: 1000
#proporcione el monto del impuesto: 21%
#PAgo con impuesto: xxxx

def calcular_total_pago(pago_sin_impuestos, impuesto):
    pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
    return pago_total

pago_sin_impuestos = float(input('Proporcione el pago sin impuestos: '))
impuesto = float(input('Proporcione el monto del impuesto: '))
pago_con_impuesto = calcular_total_pago(pago_sin_impuestos, impuesto)
print(f'el pago con impuesto es: {pago_con_impuesto}')