let numeros = [10, 15, 20, 25, 30, 35, 40];

// Filtrar números pares
let pares = numeros.filter((num) => num % 2 === 0);
console.log("Números pares:", pares); // [10, 20, 30, 40]

// Calcular el promedio
let promedio = pares.reduce((acc, num) => acc + num, 0) / pares.length;
console.log("Promedio de pares:", promedio); // 25
