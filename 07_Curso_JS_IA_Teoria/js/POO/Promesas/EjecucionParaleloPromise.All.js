async function procesoParalelo() {
    console.log('Inicio del proceso');

    const promesas = [
    new Promise(resolve => setTimeout(resolve("Tarea 1 completada"),2000)),
    new Promise(resolve => setTimeout(resolve("Tarea 2 completada"),1000)),
    new Promise(resolve => setTimeout(resolve("Tarea 3 completada"),1500)),
    ];

    // Espera que todas las promesas se resuelvan
    const resultado = await Promise.all(promesas);
    console.log("Promesas: ", resultado);
    console.log("Fin del proceso en paralelo");
}

procesoParalelo();

// Promise.all permite ejecutar varias promesas en paralelo.
// await espera a que todas las promesas se resuelvan antes de continuar.