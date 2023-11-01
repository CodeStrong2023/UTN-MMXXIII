//Ejercicio para encontrar números pares e impares.
let N = 15;
if (N % 2 == 0){
    console.log("Es un número par.")
}
else{
    console.log("Es un número impar.")
}

//Ejercicio para determinar si es mayor de edad.
let Edad = 12, May = 18;
if(Edad >= 18){
    console.log("Es mayor de edad.")
}
else{
    console.log("Es menor de edad.")
}

//Ejercicio para determinar un número dentro de un rango.
let R = 6;
let NMin = 0; NMax = 10;
if(R >= NMin && R <= NMax){
    console.log("El número está dentro del rango establecido.")
} 
else{
    console.log("El número está fuera del rango establecido.")
}

//Ejercicio para ver si un padre puede asistir al juego de su hijo.
let Vacaciones = false, Descanso = false;
if (Vacaciones || Descanso){
    console.log("El padre puede asistir al juego de su hijo.")
}
else{
    console.log("El padre no puede asistir al juego de su hijo.")
}

//Operador Ternario.
let Resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(Resultado2);
let Numero = 12;
Resultado2 = Numero % 2 == 0 ? "Es un número par." : "Es un número impar.";
console.log(Resultado2);

//Convertir String a Number.
let MiNumero = "18"; //Cadena.
console.log(typeof MiNumero);
let Edad2 = Number(MiNumero); //Función.
console.log(typeof Edad2);

//Función isNaN.
if(isNaN(Edad2)){ //No es un número = Is Not a Number (Devuelve un resultado booleano)
    console.log("Esta variable no contiene solo números")
}
else{
    if(Edad2 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Es muy joven para poder votar");
    }
}

//Operador Ternario.
let Resultado3 = Edad2 >= 18 ? "Puede votar" : "Es muy joven para poder votar";
console.log(Resultado3);


