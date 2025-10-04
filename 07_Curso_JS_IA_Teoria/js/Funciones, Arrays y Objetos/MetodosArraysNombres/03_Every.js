let numeros = [2, 4, 6, 8];

// Verifica si todos los números son pares
let todosPares = numeros.every(num => num % 2 === 0);

console.log(todosPares); // Salida: true

// El método every verifica si todos los elementos del array cumplen una condición. Devuelve true o false.