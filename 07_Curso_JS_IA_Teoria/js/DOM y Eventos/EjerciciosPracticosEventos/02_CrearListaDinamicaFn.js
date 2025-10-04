// Crea una página web con un campo de texto y un botón. Cada vez que el usuario
// escriba algo y presione el botón, agrega ese texto a una lista.-->

// funciones
let contador = 1;
function crearLista(){
    let input = document.getElementById("inputTexto");
    let ul = document.getElementById("listaElementos");
    
    if (input.value.trim() !== ""){
        let li = document.createElement("li");
        li.textContent = contador + ". " + input.value;
        input.value = "";       // Limpiar el campo de texto
        ul.appendChild(li);
        contador++;
    }
}

