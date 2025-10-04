// Ejemplo 2: Manejo de errores con try...catch

async function manejarErrores() {
    try {
        // Simular un error 
        throw new Error('Ocurrio un error');
    } catch (error) {
        console.error("Error capturado:", error.message);
    }
}

manejarErrores();

// try...catch permite capturar errores que ocurren dentro de una función async.
// Esto es útil cuando trabajas con operaciones que pueden fallar, como solicitudes a una API.