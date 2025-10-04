// 8. setInterval

// Ejecuta una función repetidamente en intervalos regulares.
// Mostrar un contador cada segundo
let contador = 0;

let intervalo = setInterval(() => {
    contador++;
    console.log(`Contador: ${contador}`);

    if (contador === 5) { // Detener el intervalo
        clearInterval(intervalo); // Detener el intervalo
    }
}, 1000);

// Útil para cronómetros o procesos repetitivos.
// Detén el intervalo con clearInterval.

/*
EXPLICACION DEL MÉTODO
setInterval(función, tiempo) se utiliza en JavaScript para crear un intervalo de 
tiempo que se repite continuamente.
La función se ejecutará cada vez que se complete el intervalo especificado en el 
segundo argumento.
El intervalo se detiene con clearInterval(intervalo).

setInterval es una función en JavaScript que se utiliza para ejecutar una función 
o un bloque de código de manera repetida, con un intervalo de tiempo específico 
entre cada ejecución. Esta función es útil para tareas que necesitan ser realizadas 
de forma periódica, como actualizaciones en la interfaz de usuario, animaciones, 
o para realizar comprobaciones en intervalos regulares.
*/
