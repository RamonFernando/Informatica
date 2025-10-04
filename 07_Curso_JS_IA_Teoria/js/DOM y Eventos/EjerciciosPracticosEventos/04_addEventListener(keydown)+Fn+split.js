let input = document.getElementById("inputTexto");
let boton = document.getElementById("boton");
let ul = document.getElementById("listaElementos");
let contador = 1;

// Escuchamos el clic en el botón
boton.addEventListener("click", crearLista);

// Escuchamos el evento de tecla Enter
input.addEventListener("keydown", (event) => {
    if (event.key === "Enter") {
        crearLista();
    }
});



// Función para agregar elementos a la lista
function crearLista() {
    if (input.value.trim() !== "") {
        let li = document.createElement("li");
        li.textContent = `${contador}. ${input.value}`;

        // Verificar duplicados comparando solo el texto del elemento
        let duplicado = Array.from(ul.children).some(li => {
            let textoExistente = li.textContent.split('. ')[1]; // Extraer solo el texto después del número
            return textoExistente === input.value;
        });
        
        // Mostrar un mensaje de error si el elemento ya existe
        if (duplicado) {
            alert("El elemento ya existe en la lista.");
        }else{
            ul.appendChild(li);
            contador++;
        }

        input.value = ""; // Limpiar el campo de texto
        
    }
}
