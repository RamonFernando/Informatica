let elementos = ["Ramon Fernando", "Maite Danese", "Nichi", "Peach"];
function leerTexto(){
    let lista = document.getElementById("resultado");
    lista.innerHTML = "";
    
    for (const elemento of elementos) {
        let item = document.createElement("li");
        item.innerText = elemento;
        lista.appendChild(item);
    }
    
}

// Agregar un elemento a la lista ingresado en el input
function agregarElemento() {
    let entrada = document.getElementById("elementoTexto");
    let nuevoElemento = entrada.value.trim();      // Eliminamos espacios en blanco
    if(nuevoElemento){
        elementos.push(nuevoElemento);             // Agregamos el nuevo elemento al array
        entrada.value = "";                        // Limpiamos el campo de texto
        leerTexto();
    }else{
        alert("Por favor, escribe un elemento.");
    }

}
// Borrar un elemento específico por el valor ingresado en el input
function borrarElemento() {
    let entrada = document.getElementById("elementoTexto");
    let elementoABorrar = entrada.value.trim();     // Obtenemos el valor ingresado y eliminamos espacios en blanco
        
    if (elementoABorrar) {
        const index = elementos.indexOf(elementoABorrar);
        if (index !== -1) {                         // Si el elemento existe en la lista
            elementos.splice(index, 1);             // Eliminar el elemento
            entrada.value = "";                     // Limpiar el campo de texto
            leerTexto();                            // Actualizar la lista
        } else {
                alert("El elemento no existe en la lista.");
            }
        } else {
            alert("Por favor, ingresa un elemento para borrar.");
        }
    }
    // leerTexto();