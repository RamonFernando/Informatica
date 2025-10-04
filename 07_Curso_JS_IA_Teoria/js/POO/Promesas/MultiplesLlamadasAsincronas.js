// Ejemplo 4: Encadenamiento de múltiples llamadas asincrónicas

async function procesoSecuencial() {
    console.log('Inicio del proceso');
    
    const paso1 = await new Promise(resolve => setTimeout(resolve("Paso 1 completado"), 1000));
    console.log(paso1);

    const paso2 = await new Promise(resolve => setTimeout(resolve("Paso 2 completado"), 2000));
    console.log(paso2);

    const paso3 = await new Promise(resolve => setTimeout(resolve("Paso 3 completado"), 1000));
    console.log(paso3);
}

procesoSecuencial();

// Cada paso se ejecuta después de que el anterior se completa.
// await asegura que el código sea más legible, sin necesidad de anidar promesas.