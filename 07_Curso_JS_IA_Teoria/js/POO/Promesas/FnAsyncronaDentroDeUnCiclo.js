// Ejemplo 6: Función asincrónica dentro de un ciclo

async function procesarDatos(datos) {
    for (const dato of datos) {
        await new Promise(resolve => setTimeout(resolve, 1000));
        console.log(`Procesando: ${dato}`);
    }
}

procesarDatos(["A", "B", "C"]);

// await en cada iteración asegura que se complete una operación antes de pasar a la siguiente.
// Esto es útil cuando procesas datos que dependen unos de otros.