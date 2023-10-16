//Ampliando el uso de var let y const
/* 
Con var puedes reasignar en cualquier momento este forma parte del ambito global
Un erro es que se sobreescriba 
*/
var miVariable = "Hola";
nombre = "Osvaldo";
console.log(nombre)

function saludar(){
    var nombre = "Natalia";
    console.log(nombre)
}
console.log(nombre) //No lee el dato de la funcion queda Osvaldo

if(true){
    var edad = 34;
    console.log(edad)
}
console.log(edad)//aca si funciona


/*let: puede ser reasignada en cualquier momento
su ambito es de bloque  */

function saludar2(){
    let nombre2 = "Ariel";
    console.log(nombre2)
}
console.log(nombre2) 

if(true){
    let edad2 = 33;
    console.log(edad2)
}

/*const se usa para valores constantes que no pueden ser reasignados*/
const fechaNacimiento = 2000;
console.log(fechaNacimiento)
fechaNacimiento = 2001;
console.log(fechaNacimiento) //no se puede reasignar

