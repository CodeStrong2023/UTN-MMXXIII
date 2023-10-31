from Persona2 import persona2

print("Creación de objetos".center(50, "-"))

if __name__ == "__main__":
    Persona5 = persona2("Lionel", "Messi", 35)
    Persona5.Detalles()

    print(__name__)

print("Eliminación de objetos".center(30, "-"))
del Persona5
