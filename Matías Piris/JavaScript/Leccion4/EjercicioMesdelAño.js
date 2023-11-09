/*
Hacer un ejercicio similar al que esta hecho, pero ahora con los meses del año.
Hacerlo con la estructura switch y luego con la función en la opción mejorada.
*/

let Mes = 11;

switch(Mes){
    case 1:
        console.log("Mes de enero");
        break;
    case 2:
        console.log("Mes de febrero");
        break;
    case 3:
        console.log("Mes de marzo");
        break;
    case 4:
        console.log("Mes de abril");
        break;
    case 5:
        console.log("Mes de mayo");
        break;
    case 6:
        console.log("Mes de junio");
        break;
    case 7:
        console.log("Mes de julio");
        break;
    case 8:
        console.log("Mes de agosto");
        break;
    case 9:
        console.log("Mes de septiembre");
        break;
    case 10:
        console.log("Mes de octubre");
        break;
    case 11:
        console.log("Mes de noviembre");
        break;
    case 12:
        console.log("Mes de diciembre");
        break;
    default:
        console.log("Número de mes fuera de rango (1 a 12)")
        break;
}

let Mes2 = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

function getMes(N){
    if(N < 1 || N > 12){
        throw new Error("Fuera de rango");
    }
    return Mes2[N-1];
}

console.log(getMes(4));