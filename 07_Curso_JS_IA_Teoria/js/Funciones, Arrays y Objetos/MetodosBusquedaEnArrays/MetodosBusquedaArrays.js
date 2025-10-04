/**
 * MÉTODOS DE BÚSQUEDA EN ARRAYS
 * 1. indexOf:          Devuelve el índice de la primera aparición de un elemento.
 * 2. lastIndexOf:      Devuelve el índice de la última aparición de un elemento.
 * 3. includes:         Verifica si un elemento está en el array (true/false).
 * 4. find:             Devuelve el primer elemento que cumple una condición.
 * 5. findIndex:        Devuelve el índice del primer elemento que cumple una condición.
 * 6. filter:           Devuelve un nuevo array con todos los elementos que cumplen una condición.
 * 7. some:             Verifica si al menos un elemento cumple una condición.
 * 8. every:            Verifica si todos los elementos cumplen una condición.
 */

// 1. indexOf: Devuelve el índice de la primera aparición de un elemento.
let colores = ["rojo", "azul", "verde", "azul"];
console.log(colores.indexOf("azul")); // 1
console.log(colores.indexOf("amarillo")); // -1 (no encontrado)

// 2. lastIndexOf: Devuelve el índice de la última aparición de un elemento.
let numeros = [1, 2, 3, 2, 4];
console.log(numeros.lastIndexOf(2)); // 3

// 3. includes: Verifica si un elemento está en el array (true/false).
let frutas = ["manzana", "naranja", "plátano"];
console.log(frutas.includes("naranja")); // true
console.log(frutas.includes("fresa")); // false

// 4. find: Devuelve el primer elemento que cumple una condición.
let numerosGrandes = [5, 12, 8, 130, 44];
let encontrado = numerosGrandes.find((num) => num > 10);
console.log(encontrado); // 12

// 5. findIndex: Devuelve el índice del primer elemento que cumple una condición.
let indice = numerosGrandes.findIndex((num) => num > 10);
console.log(indice); // 1

// 6. filter: Devuelve un nuevo array con todos los elementos que cumplen una condición.
let pares = numerosGrandes.filter((num) => num % 2 === 0);
console.log(pares); // [12, 8, 130, 44]

// 7. some: Verifica si al menos un elemento cumple una condición.
let tieneMayor = numerosGrandes.some((num) => num > 100);
console.log(tieneMayor); // true

// 8. every: Verifica si todos los elementos cumplen la condición.
let todosPares = numerosGrandes.every((num) => num % 2 === 0);
console.log(todosPares); // false

// 9. keys: Devuelve un iterador con las claves (índices) del array.
let claves = Array.from(numerosGrandes.keys());
console.log(claves); // [0, 1, 2, 3, 4]

// 10. entries: Devuelve un iterador con pares clave-valor.
let entradas = Array.from(numerosGrandes.entries());
console.log(entradas); // [[0, 5], [1, 12], [2, 8], [3, 130], [4, 44]]
