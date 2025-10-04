// Ejemplo 1: Básico con una función que simula una operación asincrónica

function esperar (ms) {
    return new Promise (resolve => setTimeout(resolve, ms));
}

async function ejemploBasico(){
    console.log('Inicio');
    await esperar(2000); // Espera 2 segundos
    console.log("Han pasado 2 segundos");

}
ejemploBasico();

// esperar devuelve una promesa que se resuelve después de un tiempo (ms).
// await pausa la ejecución de ejemploBasico hasta que la promesa de esperar se resuelva.

