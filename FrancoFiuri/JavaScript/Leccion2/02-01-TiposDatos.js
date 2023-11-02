// Tipos de Datos en JavaScript
/*
La sinstaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/
var nombre = "Franco"; // Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 3000; //Tipo numerico
console.log(numero);

var objeto = {  //Tipo Object
    nombre : "Franco",
    apellido : "Fiuri",
    telefono : 2604813095
}
console.log(typeof objeto);

//Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ['Citroen', 'Renault', 'Ford', 'Chevrolet'];
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es:

var z = '';
console.log(z); //Esto se refiere a que es una cadena vacia:
console.log(typeof z);