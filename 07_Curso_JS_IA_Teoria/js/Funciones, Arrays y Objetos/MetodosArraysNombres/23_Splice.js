// Crear un array de números
let numeros = [1, 2, 3, 4, 5];

// Eliminar 2 elementos a partir del índice 1
numeros.splice(1, 2);
console.log(numeros); // [1, 4, 5]

// Agregar elementos en el índice 1
numeros.splice(1, 0, 10, 20);
console.log(numeros); // [1, 10, 20, 4, 5]

// Primer uso: splice(1, 2) elimina 2 elementos desde el índice 1.
// Segundo uso: splice(1, 0, 10, 20) agrega 10 y 20 en el índice 1 sin eliminar nada.