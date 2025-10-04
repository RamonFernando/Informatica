/*
13.- Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2.
Resuelve el ejercicio con reduce
*/

// primero con reduce y filter
let potencias = Array(20).fill(0).reduce(
    (resultado, _, i) => {
        resultado.push(Math.pow(2, i));
        return resultado;
    },[]
);
console.log(potencias);

/*
Explicación detallada:
Array(20).fill(0)

Esto crea un array de 20 posiciones llenas con el valor 0.
Este array sirve como base para usar reduce.
`.reduce((resultado, _, indice) => { ... }, []):

Usamos reduce para construir el array potencias.

resultado:

Es el acumulador que va almacenando las potencias de 2 calculadas.
Comienza como un array vacío ([]), gracias al valor inicial proporcionado en reduce.
_:

Es el valor actual del array (0 en este caso, pero no lo usamos directamente).
Usamos _ como nombre para indicar que no nos importa este valor.
indice:

Representa el índice actual de la iteración (de 0 a 19).
resultado.push(2 ** indice)

Calculamos 2 elevado a la potencia del índice (indice) usando el operador de potencia (**).
Agregamos este valor al array resultado con push.
return resultado

Después de agregar la potencia actual, devolvemos el array actualizado.
Resultado final:

potencias contendrá las primeras 20 potencias de 2.
*/