// 1. Crear un array con las notas
let notas = [8, 7, 9, 10, 6];

// 2. Calcular el promedio
let promedio = notas.reduce((acumulador, nota) => acumulador + nota, 0) / notas.length;

// 3. Determinar si pasó
let estado = promedio >= 7 ? "Aprobado" : "Reprobado";

// 4. Mostrar los resultados
console.log("Notas:", notas);
console.log("Promedio:", promedio.toFixed(2));
console.log("Estado del estudiante:", estado);
