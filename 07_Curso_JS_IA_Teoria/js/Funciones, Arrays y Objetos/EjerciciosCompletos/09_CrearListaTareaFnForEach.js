// 1. Lista inicial de tareas
let tareas = [
    { nombre: "Estudiar JavaScript", completada: false },
    { nombre: "Hacer ejercicio", completada: true }
];

// 2. Función para agregar una nueva tarea
function agregarTarea(nombre) {
    tareas.push({ nombre, completada: false });
}

// 3. Función para marcar una tarea como completada
function completarTarea(indice) {
    if (tareas[indice]) {
        tareas[indice].completada = true;
    } else {
        console.log("Tarea no encontrada.");
    }
}

// 4. Agregar y completar tareas
agregarTarea("Leer un libro");
completarTarea(2);

// 5. Mostrar las tareas
console.log("Lista de tareas:");
tareas.forEach((tarea, indice) => {
    console.log(`${indice + 1}. ${tarea.nombre} - ${tarea.completada ? "Completada" : "Pendiente"}`);
});
