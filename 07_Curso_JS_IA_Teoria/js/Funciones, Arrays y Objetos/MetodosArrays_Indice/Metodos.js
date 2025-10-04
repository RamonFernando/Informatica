/**
 * MÉTODOS DE ARRAYS
 *  1. indexOf:          Devuelve el índice de la primera aparición de un elemento.
 *  2. lastIndexOf:      Devuelve el índice de la última aparición de un elemento.
 *  3. includes:         Verifica si un elemento está en el array (true/false).
 *  4. find:             Devuelve el primer elemento que cumple una condición.
 *  5. findIndex:        Devuelve el índice del primer elemento que cumple una condición.
 *  6. filter:           Devuelve un nuevo array con todos los elementos que cumplen una condición.
 *  7. some:             Verifica si al menos un elemento cumple una condición.
 *  8. every:            Verifica si todos los elementos cumplen una condición.
 *  9. keys:             Devuelve un iterador con las claves (índices) del array.
 * 10. entries:          Devuelve un iterador con pares clave-valor.
 * 11. map:              Devuelve un nuevo array con los resultados de aplicar una função a cada elemento.
 * 12. reduce:           Reduce los elementos a un solo valor acumulado.
 * 13. sort:             Ordena los elementos del array.
 * 14. reverse:          Invierte el orden de los elementos del array.
 * 15. forEach:          Recorre cada elemento del array y ejecuta una función.
 * 16. join:             Convierte los elementos en una cadena, separados por el valor dado.
 * 17. slice:            Devuelve un nuevo array con una copia de una parte del array original.
 * 18. concat:           Devuelve un nuevo array con la concatenación de dos arrays.
 * 19. fill:             Llena el array con un valor especificado.
 * 20. copyWithin:       Copia un segmento del array al otro.
 */

// MÉTODOS DE ARRAYS EN JAVASCRIPT EJEMPLOS
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

// 7. some: Verifica si al menos un elemento cumple la condición.
let tieneMayor = numerosGrandes.some((num) => num > 100);
console.log(tieneMayor); // true

// 8. every: Verifica si todos los elementos cumplen la condición.
let todosPares = numerosGrandes.every((num) => num % 2 === 0);
console.log(todosPares); // false

// 9. map: Devuelve un nuevo array con los resultados de aplicar una función a cada elemento.
let cuadrados = numerosGrandes.map((num) => num ** 2);
console.log(cuadrados); // [25, 144, 64, 16900, 1936]

// 10. reduce: Reduce los elementos a un solo valor acumulado.
let suma = numerosGrandes.reduce((acumulador, num) => acumulador + num, 0);
console.log(suma); // 199

// 11. sort: Ordena los elementos del array.
let desordenados = [3, 1, 4, 1, 5];
desordenados.sort((a, b) => a - b); // Orden ascendente
console.log(desordenados); // [1, 1, 3, 4, 5]

// 12. reverse: Invierte el orden de los elementos.
let ordenInvertido = desordenados.reverse();
console.log(ordenInvertido); // [5, 4, 3, 1, 1]

// 13. forEach: Recorre cada elemento del array y ejecuta una función.
numerosGrandes.forEach((num, index) => {
    console.log(`Índice ${index}: ${num}`);
});

// 14. join: Convierte los elementos en una cadena, separados por el valor dado.
let frase = colores.join(", ");
console.log(frase); // "rojo, azul, verde, azul"

// 15. concat: Combina dos o más arrays en uno nuevo.
let combinado = colores.concat(frutas);
console.log(combinado); // ["rojo", "azul", "verde", "azul", "manzana", "naranja", "plátano"]

// 16. isArray: Verifica si un valor es un array.
console.log(Array.isArray(colores)); // true
console.log(Array.isArray("texto")); // false

// 17. slice: Extrae una porción del array (sin modificar el original).
let porcion = numerosGrandes.slice(1, 3);
console.log(porcion); // [12, 8]

// 18. splice: Elimina, reemplaza o agrega elementos en el array.
let eliminados = colores.splice(1, 2, "morado", "amarillo");
console.log(colores); // ["rojo", "morado", "amarillo", "azul"]
console.log(eliminados); // ["azul", "verde"]

// 19. Array.from: Convierte un iterable o cadena en un array.
let caracteres = Array.from("JavaScript");
console.log(caracteres); // ["J", "a", "v", "a", "S", "c", "r", "i", "p", "t"]

// 20. keys, values, entries: Iteradores para claves, valores y pares clave-valor.
let iteradorClaves = colores.keys();
let iteradorValores = colores.values();
let iteradorEntradas = colores.entries();

for (let clave of iteradorClaves) console.log(clave); // 0, 1, 2, 3
for (let valor of iteradorValores) console.log(valor); // "rojo", "morado", "amarillo", "azul"
for (let entrada of iteradorEntradas) console.log(entrada); // [0, "rojo"], [1, "morado"], ...
