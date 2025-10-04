// CRUD: Create, Read, Update, Delete
let calificaciones = [7, 4, 5.7, 9, 8.5];

// Create
function agregarNota(){
    let nota = parseFloat(prompt("Introduce una nota"));
    
    if(!isNaN(nota) && nota != null && nota != ""){
        if(nota >= 0 && nota <= 10){
            calificaciones.push(nota);
            listarNotas();
        }else{
            alert("Introduce una nota entre 0 y 10");
            // agregarNota();
        }
        
    }else{
        alert("Introduce una nota entre 0 y 10");
    }
}

// Read
function listarNotas(){
    let listaNotas = document.getElementById("listaNotas");
    listaNotas.innerHTML = "";
    
    for (const nota of calificaciones) {
        let li = document.createElement("li");
        li.textContent = "- " + nota;
        listaNotas.appendChild(li);
    }
}

// Update
function modificarNota(){
    let nota = parseFloat(prompt("Introduce la nota a modificar"));
    if(nota != null && nota != "" && !isNaN(nota) && nota >= 0 && nota <= 10){
        
        let notaNueva = parseFloat(prompt("Introduce la nueva nota"));
        if (notaNueva != null && notaNueva != "" && !isNaN(notaNueva) && notaNueva >= 0 && notaNueva <= 10){
            
            for (let i = 0; i < calificaciones.length; i++) {
                if(nota == calificaciones[i]){
                    calificaciones[i] = notaNueva;
                    break;
                }
            }
            listarNotas();
        
        }else{
            alert("Introduce una nota entre 0 y 10");
            // modificarNota();
        }

    }else{
        alert("Introduce una nota entre 0 y 10");
        // modificarNota();
    }
}

// Delete
function eliminarNota(){
    let nota = parseFloat(prompt("Introduce una nota a eliminar"));

    for (let i = 0; i < calificaciones.length; i++) {
        // Comprobamos que nota no sea null, que sea un numero (isNaN) y que no este vacio
        if(nota != null && !isNaN(nota) && nota != ""){
            if(nota == calificaciones[i]){
                calificaciones.splice(i,1);
                break;
            }
        }
    }

    listarNotas();
}


