#Argumentos variables en diccionario

def listar_terminos(**terminos): #se usa **kwargs para indicar que son argumentos variables en diccionario
    for llave, valor in terminos.items():
        print(f"{llave}: {valor}")
        
listar_terminos(IDE="Integrated Development Environment", PK="Primary Key")
listar_terminos(DBMS="Database Management System")