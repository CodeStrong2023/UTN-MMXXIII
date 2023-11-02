// Ejercicio para encontrar números pares e impares
let parImpar = 10;
if(parImpar % 2 == 0){
    console.log("Es un numero PAR");
}
else {
    console.log("Es un numero IMPAR");
}

//Ejercicio: es mayor de edad
let edad = 20, adulto = 18;
if( edad >= adulto ){
    console.log("Usted es una persona adulta");
}
else{
    console.log("Usted es un menor de edad");
}

//Ejercicio: Dentro de un rango
let dentroRango = 5;
let valMin = 0, valMax = 10;
if ( dentroRango >= valMin && dentroRango <= valMax){
    console.log('Esta dentro del rango establecido')
}
else{
    console.log('Esta fuera del rango permitido.')
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre NO puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2);

//Convertir String a Number
let miNumero = "21" // Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2);

//Funcion isNaN
if(isNaN(edad2)){ //No es un número = is No a Numbre(devuelve un booleano)
    console.log("Esta variable no contine solo numeros")
}
else {
    if(edad2 >= 18){
        console.log("Puede votar");
    }
    else {
        console.log("Es demasiado joven para Votar");
    }
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede Votar" : "Es demasiado Joven para Votar";
console.log(resultado3);

