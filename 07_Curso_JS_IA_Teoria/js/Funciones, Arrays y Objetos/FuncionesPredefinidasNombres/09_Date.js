// 9. Date

// Trabaja con fechas y horas.
// Obtener la fecha actual
let fechaActual = new Date();
console.log(fechaActual); // Ejemplo: Tue Dec 05 2024 10:30:00 GMT+0000

// Obtener partes específicas
console.log(fechaActual.getFullYear()); // Año actual
console.log(fechaActual.getMonth() + 1); // Mes (0-11, se suma 1 para el mes correcto)
console.log(fechaActual.getDate()); // Día del mes

// La clase Date es ideal para trabajar con tiempos, calcular diferencias de 
// fechas, o mostrar información de tiempo.