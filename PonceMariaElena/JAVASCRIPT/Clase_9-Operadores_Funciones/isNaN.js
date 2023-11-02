//Funcion isNaN
if(isNaN(edad)){
    console.log("La variable no es un numero");
}else{
    if(edad >= 16){
        console.log("Puedes votar");
    }else{
        console.log("Eres demasiado joven para votar");
    } 
}

let resultado2 = (edad >= 16) ? "Puedes votar" : "Eres demasiado joven para votar";
console.log(resultado2);