let animales = ["gato", "perro", "conejo"];
let numeros = [1, 2, 3, 0, 7];

// Imprimir cada elemento
animales.forEach((animal, i) => {
    console.log(`${i + 1}. ${animal}`);
});
// 1. gato
// 2. perro
// 3. conejo

// Imprimir cada elemento y su índice
numeros.forEach((num, i) => {
    console.log(`${i + 1}º:  ${num}`);
});
// 1º: 1
// 2º: 2
// 3º: 3 ...

// forEach recorre el array y ejecuta la función pasada como argumento para cada elemento.