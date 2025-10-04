// Async / Await

// Funcion para descargar clientes
function descargarNuevosClientes(){
    return new Promise( resolve => {
       console.log('Descargando cliente ... espere...'); 
       
       setTimeout( () => {
           resolve('Clientes descargados');
       }, 4000);
    });
}
//Llamar al metodo
descargarNuevosClientes();

function descargarUltimosPedidos(){
    return new Promise( resolve => {
       console.log('Descargando pedidos...'); 
       
       setTimeout( () => {
           resolve('Pedidos Descargados.');
       }, 2000);
    });
}
async function app(){
    // Try Catch por si hay algun error
    try {
        console.log('App Lista');
        // await: si la async se ejecuta, se ejecuta el await
        // Si no se ejecuta await, el codigo que depende del 
        // async/await dentro del try catch no se ejecuta pero el resto del codigo fuera del try/Catch si.
        // Ejemplo bloquear el pago hasta que el banco lo acepte y despues ejecutar la compra.
        // El codigo despues del await no se ejecuta hasta que no se ejecute el await
        /*const cliente = await descargarNuevosClientes();
        const pedidos = await descargarUltimosPedidos();
        console.log('Este codigo si se bloquea');
        console.log(cliente); */
        // Este promise es un array de las dos funciones clientes y pedidos
        const resultado = await Promise.all
                ([descargarNuevosClientes(), 
                descargarUltimosPedidos()]);
        console.log(resultado[0]);
        console.log(resultado[1]);
    } catch (error) {
        console.log(error);
    }

}
app();
console.log('Codigo de descarga no bloqueado');

// setTimeout
// Funcion para mostrar el tiempo en milisegundos. Tardara 3s (2000ms) en ejecutarse
/*setTimeout( function(){
    console.log('set timeout...')
}, 2000);*/

// setInterval 
// Envia peticion con intervalos de 4s (4000ms)
/*setInterval( function(){
    console.log('set timout interval...')
}, 4000);*/