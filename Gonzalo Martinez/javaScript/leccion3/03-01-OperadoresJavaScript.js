// Ejercicio para encontrar numeros pares
let parInpar = 10;
if (parInpar % 2 == 0) {
    console.log('El numero es par');
} else {
    console.log('El numero es impar');
}

//Ejercicio: es mayor de edad
let edad = 20, adulto = 18;
if (edad >= adulto) {
    console.log('Usted es una persona adulta');
} else {
    console.log('Usted es una persona menor de edad');
}

//Ejercicio: dentro de un rango
let dentroRango = 10;
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log('El numero esta dentro del rango establecido');
} else {
    console.log('El numero esta fuera del rango establecido');
}

// Ejercicio: si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso=false;
if(vaciones || diaDescanso){
    console.log("El padre puede aistir al juegod e su hijo")
}else{
    console.log("El padre NO puede aistir al juegod e su hijo")
}
//operador ternario
let resultado2= 3>2?"verdadero": "falso";
console.log(resultado2)
let numnero =7;
resultado2 = numero%2 ==0 ?"es numero par" : "es un numero impar";
console.log(resultado2)

//converit  String a numero
let minumero  = "10"
console.log(typeof minumero)
let edad2 = Number(minumero)
console.log(typeof edad2)

if(edad2>=18){
    console.log("puede votar")
}else{
    console.log("Muy joven para votar")
}

let resultado3 = edad2 >= 18?"Puede votar" : "Muy joven para votar"
console.log(resultado3)
