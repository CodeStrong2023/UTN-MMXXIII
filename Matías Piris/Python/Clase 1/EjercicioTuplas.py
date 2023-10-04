# ---------- Parte 1 ----------
# Definir tupla

Cocina = ("Cuchara", "Cuchillo", "Tenedor")
print(len(Cocina))

# Acceder a un elemento

print(Cocina[0])

# Mostrar invorso

print(Cocina[-1])

# Acceder a rangos

print(Cocina[0:1])

# Se muestra paréntesis y coma. Sin coma no hay tupla verduras = ("tomate") no es tupla
# Debería ser verdura = ("tomate",)

# ---------- Parte 2 ----------
# Recorrer elementos

for Cocinar in Cocina:
    print(Cocinar, end=" ")  # Se usa end para sacar saltos de linea

CocinaLista = list(Cocina)
CocinaLista[0] = "Plato"
Cocina = tuple(CocinaLista)
print(Cocina)

# Eliminar

del Cocina