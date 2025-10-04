// Ejemplo 7: Manejo de tiempo límite con Promise.race

async function consultarConTiempoLimite() {
    const consulta = new Promise(resolve => setTimeout(() => resolve("Consulta completada"), 3000));
    const tiempoLimite = new Promise((_,reject) => setTimeout(() => reject(new Error("Tiempo límite alcanzado")), 2000));

    try {
        const resultado = await Promise.race([consulta, tiempoLimite]);
        console.log(resultado);
    }catch(error){
        console.log("Error", error.message);
    }
}

consultarConTiempoLimite();

// Promise.race devuelve el resultado de la primera promesa que se resuelve o rechaza.
// En este caso, el tiempo límite provoca un error si la consulta tarda demasiado.