
// Array de Notas
let calificaciones = [7, 4, 5.7, 9, 8.5];

// Funciones
function listarNotas(){
    let listaNotas = document.getElementById("listaNotas"); // Obtengo el id de la lista
    listaNotas.innerHTML = ""; // Vacio la lista para que al agregar una nueva nota no se repitan

    // Recorro el array de notas y agrego un elemento (li) a la lista (ul)listarNotas
    /*for (let i = 0; i < calificaciones.length; i++) {
        item = document.createElement("li"); // Creo un elemento li
        item.textContent = "- " + calificaciones[i]; // Agrego el contenido al elemento li
        listaNotas.appendChild(item); // Agrego el elemento li al final de la lista
    }*/

    // Con For Of
    for (const nota of calificaciones) {
        let item = document.createElement("li"); // Creo un elemento li
        item.textContent = "- " + nota; // Agrego el contenido al elemento li
        listaNotas.appendChild(item); // Agrego el elemento li al final de la lista
    }
}
// Función para agregar una nota
function agregarNota(){
    let nota = parseFloat(prompt("Introduce una nota entre 0 y 10")); // Pido una nota y la convierto en un float
    if((nota >= 0 && nota <= 10) && (!isNaN(nota) && nota != "")){ // Si la nota es un numero entre 0 y 10 y no es NaN y no esta vacia
        calificaciones.push(parseFloat(nota)); // Agrego la nota al array al final del array
        listarNotas();
    }else{
        alert("Introduce una nota entre 0 y 10");
        agregarNota();
    }
    
}
// Función para eliminar una nota
function eliminarNota(){
    let nota = parseFloat(prompt("Introduce una nota a eliminar"));
    if(!isNaN(nota) && nota != ""){ // Si la nota no es NaN y no esta vacia
        for (let i = 0; i < calificaciones.length; i++) {
            if(nota == calificaciones[i]){ // Comprobamos si la nota a eliminar es igual a la nota del array
                calificaciones.splice(i, 1); // Elimino la nota del array, en la posición i, 1 elemento
                break;
            }
        }
        listarNotas();
    }
}
// Funcion para modificar una nota
function modificarNota(){
    let nota = parseFloat(prompt("Introduce la nota a modificar (Si hay 2 notas con el mismo valor se modificara la primera)"));
    if(!isNaN(nota) && nota != ""){ // Si la nota no es NaN y no esta vacia
        let nuevaNota = parseFloat(prompt("Introduce la nueva nota"));
        if(!isNaN(nuevaNota) && nuevaNota != ""){ // Si la nueva nota no es NaN y no esta vacia
            for (let i = 0; i < calificaciones.length; i++) {
                if(nota == calificaciones[i]){ // Comprobamos si la nota a modificar es igual a la nota del array
                    calificaciones[i] = nuevaNota; // Modificamos la nota del array, en la posicion i, por la nueva nota
                    break;
                }
            }
            listarNotas();
        }
    }
}


// Función para calcular el promedio
function calcularPromedio(){
    let promedio = 0;
    for (let i = 0; i < calificaciones.length; i++) {
        promedio += calificaciones[i]; // Sumo todas las notas
    }
    promedio = promedio / calificaciones.length; // Divido la suma de todas las notas por el numero de notas
    elementoPromedio = document.getElementById("promedio");
    elementoPromedio.textContent = promedio.toFixed(2); // Redondeo el promedio a 2 decimales
}

// Función para mostrar la nota mas alta
function notaMasAlta(){
    let notaMasAlta = 0;
    for (let i = 0; i < calificaciones.length; i++) {
        
        if(calificaciones[i] > notaMasAlta){
            notaMasAlta = calificaciones[i]; // Guardo la nota mas alta
        }
        document.getElementById("nota").textContent = notaMasAlta; // Muestro la nota mas alta
    }

}

// Función para mostrar si hay asignaturas suspensas
function haySuspenso(){
    let contador = 0;
    let mensaje = document.getElementById("aplazo"); // Obtengo el id del mensaje
    for (let i = 0; i < calificaciones.length; i++) {
        if (calificaciones[i] < 5) { // Comprobamos nota minima
            contador++;
            return mensaje.textContent = "Tienes " + contador + " nota/as suspensas.";
        }
    }
    return mensaje.textContent = "No hay nota suspensa.";
}
