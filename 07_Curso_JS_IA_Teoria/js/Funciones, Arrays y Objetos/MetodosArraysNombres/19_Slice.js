// Crear un array de letras
let letras = ["a", "b", "c", "d", "e"];

// Extraer desde el índice 1 hasta el 3 (sin incluir el 3)
let subArray = letras.slice(1, 3);
console.log(subArray); // ["b", "c"]

// Copiar todo el array
let copia = letras.slice();
console.log(copia); // ["a", "b", "c", "d", "e"]

// slice(1, 3) extrae los elementos desde el índice 1 hasta el índice 3 (no incluido).
// Si no se proporcionan argumentos, copia todo el array.