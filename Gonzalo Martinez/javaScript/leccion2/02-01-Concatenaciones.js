var nombre ='Jose';
var apellido = ' Montes';
var nombreCompleto = nombre + " " +apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Betarcud';
console.log(nombreCompleto2);
var juntos =  nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

//tercera concatenacion
nombre += apellido;
console.log(nombre);

// ya no se usa var se usa let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Perez";
//apellido2 = "Peres";  una coonstante no puede ser modificada
console.log(apellido2);

let s, y; // se pueden crear varias  variables en una sola linea
x=17, y=21;//se pueden asignar vARIAS VARIABLES EN LA MISMA LINEA
let z = x + y;
console.log(z);

let _1num = 31;// No utilizar numeros apra inicar variables
let rompiendo = "rompe";//No utilizar palabras reservadas para variables

console.log(_1num);
console.log(rompiendo);