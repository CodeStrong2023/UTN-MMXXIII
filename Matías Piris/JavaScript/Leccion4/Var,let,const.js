/*
Ampliando el uso de var, let y const.
Con var se puede reasignar en cualquier momento. Este forma parte del ámbito global.
Un erro es que se sobreescriba.
*/

var Nombre = "Matias";
Nombre = "Lucas";
console.log(Nombre);

function Saludar(){
    var Nombre3 = "Valentina";
    console.log(Nombre3);
}

// console.log(Nombre); - Aquí no se lee el dato en la función.

if (true){
    var Edad = 23
    console.log(Edad);
}

console.log(Edad); //En la función funciona correctamente. En la estructura if falló.

/*
let: ésta puede ser reasignada en cualquier momento.
La diferencia es que su ámbito es de bloque, solo disponible de un bloque.
Solo disponible dentro de un bloque de llaves o dentro de una función.
*/

function Saludar2(){
    let Nombre2 = "Stella";
    console.log(Nombre2);
}

//console.log(Nombre2);

if (true){
    var Edad2 = 51
    console.log(Edad2);
}

//console.log(Edad2);

/*
const = se utiliza para valores constantes que no pueden ser reasignados.
*/

const FechaNacimiento = 2002;
console.log(FechaNacimiento);
//FechaNacimiento = 1972;
//console.log(FechaNacimiento); //Solo se ejectua el console anterior.
