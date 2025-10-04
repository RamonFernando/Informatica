let numeros = [5, 12, 8, 130, 44];
let colores = ["rojo", "azul", "verde", "amarillo"];

// Encontrar el primer número mayor a 10
let encontrado = numeros.find((num) => num > 10);
console.log(encontrado); // 12

// Sino existe, devuelve undefined
let noExiste = numeros.find((num) => num > 140);
console.log(noExiste); // undefined

// comprobando string en el array
let hayAzul = colores.find((azul) => azul === "azul");
console.log(hayAzul); // azul

// find devuelve el primer elemento que cumple la condición. Si ninguno cumple, devuelve undefined.