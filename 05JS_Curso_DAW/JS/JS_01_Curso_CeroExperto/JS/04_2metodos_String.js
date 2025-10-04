// Métodos

const producto = 'Monitor 20" pulgadas';
const producto2 = 'Monitor HD';
const email = 'correo@correo.com';

const tweet = 'Aprendiendo JavaScript con el curso de Desarrollo Web Completo';

console.log(producto);
console.log(producto2);

// Length: es para la extension del texto o array
console.log(tweet + '\nTamaño: ' + tweet.length + ' espacios.');

// IndexOf: Este metodo te permitira saber en que posicion de una cadena de texto se encuentra el caracter que busques.
// IndexOf: Retorna la posicion del primer caracter que coincida
// LastIndexOf: Este metodo te permitira saber en que posicion de una cadena de texto se encuentra el caracter que busques.
// Replace: Este metodo te permitira reemplazar un caracter por otro
console.log("Esta en la posición: " + tweet.indexOf('JavaScript'));
console.log("Esta en la posicion: " + producto2.indexOf('Tablet'));
console.log('Validación Email indexOf: ' + email.indexOf('@'));
console.log('Validación Email lastIndexOf: ' + email.lastIndexOf('@'));

// StartsWith: Este metodo te permitira saber si una cadena de texto empieza con otra cadena de texto
console.log(tweet.startsWith('JavaScript'));
// EndsWith: Este metodo te permitira saber si una cadena de texto termina con otra cadena de texto
console.log(tweet.endsWith('JavaScript'));
// Includes: Este metodo te permitira saber si una cadena de texto se encuentra en otra cadena de texto
console.log(tweet.includes('JavaScript'));