// 1. Array
let calificaciones = [7, 4, 9.97, 9, 8.5, 3.8, 9];

// 2. Funciones
function listarNotas() {
    let listaNotas = document.getElementById("listaNotas");
    listaNotas.innerHTML = "";
    for (const nota of calificaciones) {
        let item = document.createElement("li");
        item.textContent = "- " + nota;
        listaNotas.appendChild(item);
    }
}

function calcularPromedio() {
    let promedio = 0;
    for (let nota of calificaciones) {
        promedio += nota;
    }
    promedio /= calificaciones.length;
    promedio = promedio.toFixed(2); // Redondea a 2 decimales
    document.getElementById("promedio").textContent = promedio; // Muestra el promedio en el id promedio
}
/*
function notaMasAlta() {
    let notaMax = 0;
    for (let nota of calificaciones) {
        if(nota > notaMax){
            notaMax = nota;
        }
    }
    nota = notaMax.toFixed(1);
    document.getElementById("nota").textContent = notaMax;
}
*/

function notaMasAlta(){
    let notaMax = Math.max(...calificaciones);
    document.getElementById("nota").textContent = notaMax.toFixed(2);
}

function haySuspenso() {
    // usar filter
    let nota = document.getElementById("aplazo");
    let notasSuspensas = calificaciones.filter(nota => nota < 5); // devuelve un array nuevo con las notas < 5
    if(notasSuspensas.length == 0){
        nota.textContent = "No tienes notas suspensas";
    }else{
        if (notasSuspensas.length > 1)
            nota.textContent = "Tienes " + notasSuspensas.length + " notas suspensas" + " y tus notas suspensas son " + notasSuspensas.join(" - "); // join convierte un array en un string
        else
            nota.textContent = "Tienes " + notasSuspensas.length + " nota suspensa" + " y tu nota suspensa es " + notasSuspensas;
    }
    
    // Metodo tradicional
    /* let contNotasSuspensas = 0;
    let nota = document.getElementById("aplazo");
    for (const notaSuspensa of calificaciones) {
        if(notaSuspensa < 5){
            contNotasSuspensas++;
            nota.textContent = "Tu nota suspensa mas baja es " + notaSuspensa + " y tienes " + contNotasSuspensas + " nota/s suspensa/s.";
        }else{
            nota.textContent = "No tienes notas suspensas";
        }
        }*/
}