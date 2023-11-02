// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es los comentarios es muy similiar a la de Java. Es prácticamente idéntica.
*/

var Nombre = "Matias"; //Tipo Str.
console.log(Nombre);

var Numero = 3000 //Tipo Numérico.
console.log(Numero);

var Objeto = {
    Nombre: "Matias",
    Apellido: "Piris",
    Telefono: 2604016201
}

console.log(Objeto);

var Bandera = true //Tipo de dato boolean.
console.log(Bandera);

function MiFuncion(){} //Tipo de dato función.
console.log(typeof MiFuncion);

var Simbolo = Symbol("Mi simbolo"); //Tipo de dato symbol.
console.log(Simbolo)

class Persona{ //Tipo de dato clase.
    constructor(Nombre,Apellido){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
}

console.log(typeof Persona)

var X; //Tipo de dato undefined.
console.log(X);

X = undefined;
console.log(typeof X);

//null - Significa ausencia de valor.
var Y = null; //null no es un tipo de dato, pero su origen es de tipo object.
console.log(typeof Y);

//Tipo de dato array y Empty String.
var Autos = ["Citroen","Audi","BMW","Ford"];
console.log(Autos);
console.log(typeof Autos); //Tipo de dato:

var Z = "";
console.log(Z); //Esto se refiere a una cadena vacia.
console.log(typeof Z);