let meses = 6;
switch(meses){
    case 1:
        console.log('Estamos en el mes de Enero');
        break;
    case 2:
        console.log('Estamos en el mes de Febrero');
        break;
    case 3:
        console.log('Estamos en el mes de Marzo');
        break;
    case 4:
        console.log('Estamos en el mes de Abril');
        break;
    case 5:
        console.log('Estamos en el mes de Mayo');
        break;
    case 6:
        console.log('Estamos en el mes de Junio');
        break;
    case 7:
        console.log('Estamos en el mes de Julio');
        break;
    case 8:
        console.log('Estamos en el mes de Agosto');
        break;
    case 9:
        console.log('Estamos en el mes de Septiembre');
        break;
    case 10:
        console.log('Estamos en el mes de Octubre');
        break;
    case 11:
        console.log('Estamos en el mes de Noviembre');
        break;
    case 12:
        console.log('Estamos en el mes de Diciembre');
        break;
    default:
        console.log('Numero de mes erroneo');
}

let meses2 = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre']
function getMeses2(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return meses2[n-1];
}
console.log(getMeses2(12));
