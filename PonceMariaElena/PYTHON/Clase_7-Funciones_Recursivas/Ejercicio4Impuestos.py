#Ejercicio 4: Calculadora de impuestos
#Crear una funcion para calcular el total de un pago incluyendo 
#un impuesto aplicado (IVA)
#Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto *(impuesto/100)
#proporcione el pago sin impuesto : 1000
#proporcione el impuesto: 21%
#El pago total es: xxxx

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto *(impuesto/100)
    return pago_total

#ejecucion
pago_sin_impuesto = float(input("Proporcione el pago sin impuesto: "))
impuesto = float(input("Proporcione el impuesto: "))
pago_total = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"El pago total es: {pago_total}")