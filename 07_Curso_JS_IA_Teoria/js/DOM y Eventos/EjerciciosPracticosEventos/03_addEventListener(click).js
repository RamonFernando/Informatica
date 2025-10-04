// Crea una página web con un campo de texto y un botón. Cada vez que el usuario
// escriba algo y presione el botón, agrega ese texto a una lista.-->

// Obtener referencias a elementos
const inputTexto = document.getElementById("inputTexto");
const botonAgregar = document.getElementById("boton");
const lista = document.getElementById("listaElementos");

// Variables globales
let contador = 1;

// Evento de clic en el botón
botonAgregar.addEventListener("click", () => {
    const texto = inputTexto.value.trim();
    if (texto !== "") {
        const li = document.createElement("li");
        li.textContent = `${contador}. ${texto}`;
        lista.appendChild(li);
        
        inputTexto.value = "";
        contador++;
    }
});