#Ejercicio 9: mostrar una frase sin espacios y contar su longitud
#hacer un programa que pida al usuario una frase y la muestre sin espacios
#ademas de mostrar su longitud
#Ejemplo:    frase = vivir por siempre en paz
#            frase final = vivirporsiempreenpaz
#            longitud = 20
frase1 = input("Digite una frase: ")
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i
print("Frase final: ",frase2)
print("Longitud: ",len(frase2))