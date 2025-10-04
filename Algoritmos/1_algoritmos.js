let alumno1 = [6, 9, 7, 5, 1, 5, 4, 3, 1];
let alumno2 = [6, 9, 7, 5];
let alumno3 = [6, 9, 7, 10, 4];

// Se pide el promedio de las notas
function promedio(parm) {
    let acumulado = 0;
    let resultado = 0;
    for (var i = 0; i < parm.length; i++) {
        acumulado += parm[i];
    }
    resultado = acumulado / parm.length;
    aprobado(resultado);
    return resultado;
}

function aprobado(x) {
    if (x >= 6) {
        console.log("Aprobado");
    } else {
        console.log("Suspendido");
    }
};
// LLamada por consola
console.log(promedio(alumno1));

let notas = [6, 9, 7, 5, 1, 5, 4, 3];
// For of: Loop para recorrer arrays, Muestra el resultado del promedio de todas las notas. (no retorna nada) 
function promedio() {
    let total = 0;
    let resultado = 0;
    for(let i of notas){
        total = total + i;
    }
    resultado = total / notas.length;
    console.log(resultado); // devuelve 5 (promedio)
}
// Se pide el menor valor del array 
function menorNota() {
    let notaMin = notas[0];
    for(let i of notas){
        if( i < notaMin){
           notaMin = i;
        }
    }
    console.log(notaMin); // devuelve 1 como la menor nota
}
console.log(menorNota());
// Se pide el mayor valor del array
function mayorNota() {
    let notaMax = notas[0];
    for(let i of notas){
        if(i > notaMax){
            notaMax = i;
        }
    }
    console.log(notaMax); // devuelve nota maxima
}
console.log(mayorNota());
