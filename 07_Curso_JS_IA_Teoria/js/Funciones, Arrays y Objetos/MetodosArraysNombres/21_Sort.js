// Crear un array de números
let numeros = [3, 1, 4, 1, 5, 9];

// Ordenar de menor a mayor
numeros.sort((a, b) => a - b);
console.log(numeros); // [1, 1, 3, 4, 5, 9]

// Ordenar de mayor a menor
numeros.sort((a, b) => b - a);
console.log(numeros); // [9, 5, 4, 3, 1, 1]

// La función de comparación (a, b) => a - b organiza los elementos en orden ascendente.
// (a, b) => b - a los organiza en orden descendente.