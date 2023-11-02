//Ejercicio 1: calcular estación del año.
let Mes = 5;
let Estacion;
if(Mes == 1 || Mes == 2 || Mes == 12){
    Estacion = "Verano";
}
else if (Mes == 3 || Mes == 4 || Mes == 5){
    Estacion = "Otoño";
}
else if (Mes == 6 || Mes == 7 || Mes == 8){
    Estacion = "Invierno";
}
else if (Mes == 9 || Mes == 10 || Mes == 11){
    Estacion = "Primavera";
}
else{
    Estacion = "El valor ingresado es incorrecto";
}
console.log("El valor " + Mes + " corresonde a la estación de: " + Estacion);

//con swicht
switch(Mes){ 
    case 1: case 2: case 12:
        Estacion = "Verano";
        break;
    case 3: case 4: case 5:
        Estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        Estacion = "Invierno";
        break;
    case 9: case 10: case 11:     
        Estacion = "Primavera";
        break
    default:
        Estacion = "El valor ingresado es incorrecto";   
}

console.log("El valor " + Mes + " corresonde a la estación de: " + Estacion);


//Ejercicio 2: 
/*
De 6 a 11 nos saluda con: Good morning.
De 12 a 16 nos saluda con: Good afternoon.
De 17 a 19 nos saluda con: Good evening.
De 20 a 23 nos saluda con: Good night.
Se trabajará con 24 horas*/
let Hora = 10;
let Mensaje;

if (Hora >= 6 && Hora <= 11){
    Mensaje = "Good morning!";
}
else if (Hora >= 12 && Hora <= 16){
    Mensaje = "Good afternoon!";
}
else if (Hora >= 17 && Hora <= 19){
    Mensaje = "Good evening!";
}
else if (Hora >= 20 && Hora <= 23){
    Mensaje = "Good night!";
}
else{
    Mensaje = "El valor ingresado es incorrecto";
}
console.log(Mensaje);

//ampliando el uso de var let y const

var miVariable = "Ariel";
nombre = "Osvaldo";
console.log(nombre)

function saludar(){
    var nombre = "Natalia";
    console.log(nombre)
}
console.log(nombre) //No lee el dato de la funcion 

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