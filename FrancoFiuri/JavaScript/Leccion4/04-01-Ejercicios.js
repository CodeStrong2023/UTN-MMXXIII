// Ejercicio1: Calcular estación del año
let mes = 4;
let estacion; // Undefined
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion de "+estacion);
// Ejercicio2: Hora del día
let horaDia = 21;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Estoy desayunando";
}
else if(horaDia >=12 && horaDia <= 15){
    mensaje = "Estoy almorzando";
}
else if(horaDia >=16 && horaDia <= 19){
    mensaje = "Estoy merendando";
}
else if(horaDia >=20 && horaDia <= 23){
    mensaje = "Estoy cenando";
}
else{
    mensaje = "Valor incorrecto"
}
console.log(mensaje);

//Estructura switch(la sinstaxis es igual a Java)
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano"
        break;
    case 3: case 4: case 5:
        estacion = "Otoño"
        break;
    case 6: case 7: case 8:
        estacion = "Invierno"
        break;
    case 9: case 10: case 11:
        estacion = "Primavera"
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de: "+estacion);

//Evitar repetir tu código
//Dry don´t repeat yourself

let days = 6;
switch (days){
    case 1:
        console.log('Hoy es Lunes')
        break;
    case 2:
        console.log('Hoy es Martes')
        break;
    case 3:
        console.log('Hoy es Miercoles')
        break;
    case 4:
        console.log('Hoy es Jueves')
        break;
    case 5:
        console.log('Hoy es Viernes')
        break;
    case 6:
        console.log('Hoy es Sabado')
        break;
    case 7:
        console.log('Hoy es Domingo')
        break;
    default:
        console.log('Error en el ingreso del dia de la semana')
        break;
}

//Esta es la opcion mejorada

let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n-1];
}
console.log(getDay(5));