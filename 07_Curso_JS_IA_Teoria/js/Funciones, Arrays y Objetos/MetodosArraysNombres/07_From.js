// Crear una cadena
let cadena = "12345";

// Convertir la cadena en un array de caracteres
let caracteres = Array.from(cadena);
console.log(caracteres); // ["1", "2", "3", "4", "5"]

// Crear un array con un rango
let rango = Array.from({ length: 5 }, (_, i) => i + 1);
console.log(rango); // [1, 2, 3, 4, 5]

// Array.from(cadena) convierte una cadena en un array de caracteres.
// Array.from({ length: 5 }, (_, i) => i + 1) genera un array de números del 1 al 5.