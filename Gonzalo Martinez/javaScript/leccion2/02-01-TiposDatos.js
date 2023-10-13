// Tipos de Datos en JavaScript
/*
La sintaxis en los comentarios 
es muy similar a la de java
realmente diriamos que es identica
*/

var nombre = 'Ariel'//Tipo Str
console.log(typeof nombre)
nobre=7;
console.log(typeof nombre)
nombre =12.3
console.log(typeof nombre)
//tipo numerico
var numero = 1000 //Tipo int
console.log(numero)
//tipo objeto
var objeto = {
    nombre: 'Ariel',
    apellido: 'Betancoud',
    telefono: '2614567893'
} //Tipo Objeto
console.log(typeof objeto)

//tipo boolean
var bandera = true //Tipo boolean
console.log( bandera)
// tipo de dato function
function miFuncion(){}
console.log(typeof miFuncion)
//tipo simbolo
var simbolo = Symbol("mi simbolo")
console.log(typeof simbolo)

//tipo de dato clase
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona)
//tipo de dato undefined
var x;
console.log(typeof x)
x = undefined;
console.log(typeof x)

//null = ausencia de valor
var y = null;//null no es un tipo de dato, es un objeto
console.log(typeof y)

//Tipo de dato array y Empty String
var autos = ['BMW','Audi','Volvo'];
console.log(autos)
console.log(typeof autos)

var z;
console.log(z)
