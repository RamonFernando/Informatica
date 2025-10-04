// 1. Hacer un array de calificaciones
// 2. Hacer la funcion listarNotas
// 3. Hacer la funcion calcularPromedio
// 4. Hacer la funcion notaMasAlta
// 5. Hacer la funcion haySuspenso

let calificaciones = [8, 7, 6.9, 8.4, 8.5, 5.8, 9, 10];

function listarNotas() {
    let listarNotas = document.getElementById("listaNotas");
    // listarNotas.innerHTML = "";
    for (let nota of calificaciones){
        let itemNota = document.createElement("li");
        itemNota.textContent = " " + nota;
        listarNotas.appendChild(itemNota);
    }
}

function calcularPromedio() {
    let promedio = 0;
    // Agregamos las calificaciones al promedio
    for (let nota of calificaciones){
        promedio += nota;
    }
    promedio /= calificaciones.length;
    promedio = promedio.toFixed(2); // Redondea a 2 decimales
    document.getElementById("promedio").textContent = promedio; // Muestra el promedio en el id promedio
}

function notaMasAlta() {
    let notaMax = Math.max(...calificaciones); // ... convierte el array en argumentos y obtiene la nota más alta
    document.getElementById("nota").textContent = notaMax; // Muestra la nota más alta en el id nota
    notaMax = notaMax.toFixed(2);
}

function haySuspenso() {
    let nota = document.getElementById("aplazo"); // Obtenemos el id aplazo
    let notasSuspensas = calificaciones.filter( nota => nota < 5); // Devuelve un array nuevo con las notas < 5

    // SBuscamos si hay notas suspensas para mostrar las notas
    if(notasSuspensas.length == 0){
        nota.textContent = "No tienes notas suspensas";

    }else{
        if(notasSuspensas.length > 1){
            nota.textContent = `Tienes ${notasSuspensas.length} notas suspensas: ${notasSuspensas.join(" - ")}`;
        }else{
            nota.textContent = `Tienes ${notasSuspensas.length} nota suspensa: ${notasSuspensas}`;
        }
    }

}