let numeros = [1, 3, 5, 7, 10];

// Verifica si hay al menos un número par
let hayPar = numeros.some(num => num % 2 === 0);

console.log(hayPar); // Salida: true

// El método some verifica si al menos un elemento del array cumple una condición. Devuelve true o false.