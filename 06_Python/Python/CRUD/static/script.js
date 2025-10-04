// Obtener referencias a elementos
const tablaNombres = document.getElementById("tabla-nombres");
const formNombre = document.getElementById("form-nombre");
const inputNombre = document.getElementById("nombre-input");

// Cargar nombres al inicio
async function cargarNombres() {
    const response = await fetch("/api/nombres");
    const nombres = await response.json();
    actualizarTabla(nombres);
}

// Actualizar tabla de nombres
function actualizarTabla(nombres) {
    tablaNombres.innerHTML = "";
    nombres.forEach((nombre, index) => {
        const fila = document.createElement("tr");
        fila.innerHTML = `
            <td>${index + 1}</td>
            <td>${nombre}</td>
            <td>
                <button class="accion editar" onclick="editarNombre(${index})">Editar</button>
                <button class="accion eliminar" onclick="eliminarNombre(${index})">Eliminar</button>
            </td>
        `;
        tablaNombres.appendChild(fila);
    });
}

// Agregar un nuevo nombre
formNombre.addEventListener("submit", async (e) => {
    e.preventDefault();
    const nombre = inputNombre.value.trim();
    if (nombre) {
        const response = await fetch("/api/nombres", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ nombre }),
        });
        if (response.ok) {
            cargarNombres();
            inputNombre.value = "";
        } else {
            alert("Error al agregar el nombre.");
        }
    }
});

// Editar un nombre
async function editarNombre(index) {
    const nuevoNombre = prompt("Introduce el nuevo nombre:");
    if (nuevoNombre) {
        const response = await fetch(`/api/nombres/${index}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ nombre: nuevoNombre }),
        });
        if (response.ok) {
            cargarNombres();
        } else {
            alert("Error al actualizar el nombre.");
        }
    }
}

// Eliminar un nombre
async function eliminarNombre(index) {
    if (confirm("¿Estás seguro de eliminar este nombre?")) {
        const response = await fetch(`/api/nombres/${index}`, { method: "DELETE" });
        if (response.ok) {
            cargarNombres();
        } else {
            alert("Error al eliminar el nombre.");
        }
    }
}

// Inicializar
cargarNombres();
