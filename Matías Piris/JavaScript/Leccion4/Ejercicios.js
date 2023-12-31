//Ejercicio 1: calcular estación del año.

let Mes = 9;
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
//------------------------------------------------------------------------------------------------------------
//Estructura switch (sintaxis igual que en Java).
switch(Mes){ //Además de números, se pueden usar cadenas.
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

//------------------------------------------------------------------------------------------------------------
//Ejercicio 2: calcular la hora del día.
/*
De 6 a 11 nos saluda con: Good morning.
De 12 a 16 nos saluda con: Good afternoon.
De 17 a 19 nos saluda con: Good evening.
De 20 a 23 nos saluda con: Good night.
Se trabajará con 24 horas.
*/

let Hora = 14;
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

//const se utiliza para valores constantes que no pueden ser reasignadas

const FechaNacimiento = 2006;
console.log(FechaNacimiento);
//FechaNacimiento = 2003;
//console.log(FechaNacimiento); //Solo se ejecuta el console anterior.

//Evitar repetir tu código
//Try to don't repeat yourself

let Dias = 4;

switch(Dias){
    case 1:
        console.log("Hoy es lunes");
        break;
    case 2:
        console.log("Hoy es martes");
        break;
    case 3:
        console.log("Hoy es miércoles");
        break;  
    case 4:
        console.log("Hoy es jueves");
        break;
    case 5:
        console.log("Hoy es viernes");
        break;
    case 6:
        console.log("Hoy es sábado");
        break;  
    case 7:
        console.log("Hoy es domingo");
        break;
    default:
        console.log("Error en el ingreso del dia de la semana");
        break;
}

let Dias2 = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];

function getDay(N){
    if(N < 1 || N > 7){
        throw new Error("Fuera de rango");
    }
    return Dias2[N - 1];
}

console.log(getDay(2));
