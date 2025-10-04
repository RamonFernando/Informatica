// 1. parseInt y parseFloat

// Convierte una cadena a un número entero (parseInt) o un número decimal (parseFloat).
// Convertir cadenas a números
let entero = parseInt("123");
console.log(entero); // 123 (número entero)

let decimal = parseFloat("123.45");
console.log(decimal); // 123.45 (número decimal)

// Manejo de texto con números
let numeroInvalido = parseInt("abc123");
console.log(numeroInvalido); // NaN (No es un Número, porque comienza con letras)

let numeroInvalidoFloat = parseFloat("abc123.45");
console.log(numeroInvalidoFloat); // NaN (No es un Número, porque comienza con letras)

// Útil para procesar entradas del usuario o cadenas que representan números.
// Si la cadena no comienza con un número válido, devuelve NaN.