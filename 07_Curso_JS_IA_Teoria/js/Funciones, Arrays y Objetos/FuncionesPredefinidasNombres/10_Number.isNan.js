// 10. Number.isNaN

//Verifica si un valor es NaN (No es un número).

let valor1 = NaN;
let valor2 = "123";

console.log(Number.isNaN(valor1)); // true
console.log(Number.isNaN(valor2)); // false

// Útil para validar entradas y evitar errores en cálculos.

/*
EXPLICACION DEL MÉTODO
Number.isNaN() es una función en JavaScript que se utiliza para verificar si un 
valor es NaN (Not a Number), 
que es un tipo de dato especial en JavaScript que representa un valor que no es un número.

El método Number.isNaN() toma un argumento, que puede ser cualquier tipo de dato, 
y devuelve true si el 
argumento es NaN, o false si no lo es.
La función isNaN en JavaScript se utiliza para determinar si un valor es 
NaN (Not-a-Number). NaN es un valor especial que representa un resultado que no 
es un número válido, como el resultado de una operación matemática que no tiene sentido.

NaN es un tipo de dato especial en JavaScript que se utiliza para representar 
valores que no son numeros, como cadenas o objetos. Al utilizar isNaN(), puedes 
verificar si un valor es NaN o no.
*/