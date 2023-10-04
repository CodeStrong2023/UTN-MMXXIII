# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud.
# Hacer un programa donde el usuario ingrese una frase y se le devuelva la misma sin espacios en blanco.
# Además de un contador de cuantos caractéres tiene la frase (sin contar espacios en blanco).
# Por ejemplo: Frase <---------- Vivir por siempre en paz
#              FraseFinal <----- Vivirporsiempreenpaz
#              Nº caractéres <-- 20

Frase1 = input("Ingrese una frase: ")
Frase2 = " "

for I in Frase1:
    if I != " ":
        Frase2 += I
Frase1 = Frase2

print(f"\nFrase final:{Frase1}")
print(f"Nº de caractéres: {len(Frase1)}")