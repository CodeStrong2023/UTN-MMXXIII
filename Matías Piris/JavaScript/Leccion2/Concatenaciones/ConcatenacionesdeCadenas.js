var Nombre = "Jose";
var Apellido = " Montes";

var NombreCompleto = Nombre + Apellido; //Primera Concatenación.
console.log(NombreCompleto);

var NombreCompleto2 = "Matias" + " " + "Piris"; //Segunda Concatenación.
console.log(NombreCompleto2);

var Juntos = Nombre + 142; //Lee de izquierda a derecha siguiendo la cadena. Lee el número como str.
console.log(Juntos);
Juntos = Nombre + 21 + 47; //Aqui se puede diferenciar a través de los paréntesis.
console.log(Juntos);
Juntos = 21 + 47 + Nombre; //Los valores números se suman y luego sigue la cadena.
console.log(Juntos);

Nombre += Apellido; //Tercera Concatenación. Esta vez, usando el operador simplificado.
console.log(Nombre);

let Nombre2 = "Pedro"; //Hoy ya no se usa el var. Se utiliza let y const.
console.log(Nombre2);

const Apellido2 = "Lopez";
//Apellido2 = "Perez"; - Una constante no puede ser modificada.
console.log(Apellido2);

let X, Y; //Se puede crear más de una variable dentro de una misma línea.
X = 17, Y = 21; //Se puede hacer asignación en más de una variable dentro de la misma línea.
let Z = X + Y; //Se asigna el valor de la operación de X + Y.
console.log(Z);

let _1num = 31; //No utilizar números para iniciar el nombre de una variable.
let rompiendo = "Rompe"; //No utilizar palabras reservadas para variables.

console.log(_1num);
console.log(rompiendo);
