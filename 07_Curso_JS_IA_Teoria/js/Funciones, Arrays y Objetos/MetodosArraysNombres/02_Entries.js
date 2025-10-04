let frutas = ["manzana", "banana", "naranja"];

let pares = frutas.entries();

for (let [indice, valor] of pares) {
    console.log(`Índice: ${indice}, Valor: ${valor}`);
}
// Salida:
// Índice: 0, Valor: manzana
// Índice: 1, Valor: banana
// Índice: 2, Valor: naranja

// El método entries devuelve un iterador con pares [índice, valor].

let numeros = [10, 20, 30, 40];

// Multiplica los valores por 2 y muestra pares índice-valor modificados
let modificados = Array.from(numeros.entries(), ([indice, valor]) => [indice, valor * 2]);

console.log(modificados);
// Salida:
// [[0, 20], [1, 40], [2, 60], [3, 80]]

