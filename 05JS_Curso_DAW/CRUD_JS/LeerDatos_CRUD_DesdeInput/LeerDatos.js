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

        function agregarElemento() {
            let entrada = document.getElementById("elementoTexto");
            let nuevoElemento = entrada.value.trim();
            if(nuevoElemento){
                elementos.push(nuevoElemento);
                entrada.value = "";
                leerTexto();
            }else{
                alert("Por favor, escribe un elemento.");
            }

        }

    function actualizarElemento() {
        let valorActualInput = document.getElementById("elementoTexto").value.trim();
        if (valorActualInput !== "") {
            // Buscar si el elemento existe en la lista
            const index = elementos.indexOf(valorActualInput);
            if (index !== -1) {
                let nuevoValor = prompt("Introduce el nuevo valor del elemento:");
                if (nuevoValor != null && nuevoValor.trim() !== "") {
                    // Actualizar el valor en la lista
                    elementos[index] = nuevoValor.trim();
                    alert(`Elemento actualizado de "${valorActualInput}" a "${nuevoValor}".`);
                    document.getElementById("elementoTexto").value = ""; // Limpiar el input
                    leerTexto(); // Actualizar la lista en la interfaz
                } else {
                    alert("El nuevo valor no puede estar vacío.");
                }
            } else {
                alert(`El elemento "${valorActualInput}" no existe en la lista.`);
            }
        } else {
            alert("Por favor, introduce un valor en el campo de texto.");
        }
    }



    // Borrar un elemento específico por el valor ingresado en el input
    function borrarElemento() {
        let entrada = document.getElementById("elementoTexto");
        let elementoABorrar = entrada.value.trim(); // Obtenemos el valor ingresado y eliminamos espacios en blanco
            
        if (elementoABorrar) {
            const index = elementos.indexOf(elementoABorrar);
            if (index !== -1) { // Si el elemento existe en la lista
                elementos.splice(index, 1); // Eliminar el elemento
                entrada.value = ""; // Limpiar el campo de texto
                leerTexto(); // Actualizar la lista
            } else {
                    alert("El elemento no existe en la lista.");
                }
            } else {
                alert("Por favor, ingresa un elemento para borrar.");
            }
        }
        // leerTexto();