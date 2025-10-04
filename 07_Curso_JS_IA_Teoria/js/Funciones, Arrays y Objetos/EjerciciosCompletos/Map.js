// Crea una función que reciba un array de números y devuelva un nuevo array con 
// cada número elevado al cuadrado.

let numeros = [1, 2, 3, 4, 5];

// Elevar al cuadrado cada número del array
let cuadrados = numeros.map((num) => num**2);
console.log(cuadrados);

// Elevar al cuadrado cada número del array con Math.pow
let cuadrados2 = numeros.map(num => Math.pow(num, 2));
console.log(cuadrados2);

// metodo tradicional de hacerlo
let cuadrados5 = [];
for (let i = 0; i < numeros.length; i++) {
    cuadrados5.push(numeros[i] ** 2);
}
console.log(cuadrados5);

// Funcion metodo .map con return
let cuadrados4 = numeros.map((num) => {
    return Math.pow(num, 2);
});
console.log(cuadrados4);

// funcion .map con return
function numCuadrados(numeros) {
    return numeros.map((num) => Math.pow(num, 2));
}
console.log(numCuadrados(numeros));

