#Ejercicio 9: Mostrar frase sin espacios y contar longitud
#Hacer un programa donde el usuario ingrese una frase, se le 
#devolvera la misma sin espacios en blanco y
# se contara cuantos caracteres tiene sin esos espacios.
#Ejemplo: frase = vivir por siempre en paz
#         frase final=  vivirporsiempreenpaz
#        Num Caracteres = 21 caracteres

frase1 = input("Ingrese una frase: ")
frase2 = " "

for i in frase1:
    if i != " ":
        frase2 += i
frase1 = frase2
print(f"La frase sin espacios es: {frase1}")
print(f"La frase tiene {len(frase1)} caracteres")