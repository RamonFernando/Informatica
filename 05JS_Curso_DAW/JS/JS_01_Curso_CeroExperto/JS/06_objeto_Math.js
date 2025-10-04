// Objeto Math
// Para abrir la ventana global hay que poner window en la consola del navegador y saldran todas las funciones de JS
// Puedes encontrar las propiedasdes de JS en la clase global window yu acceder a ella como un metodo ejemplo window.alert('hola mundo');
// tambien puedes acceder a las propiedades de la clase poniendo window.Math.random();

// Ejemplo:
console.log("Funciones de Math");
console.log("Número aleatorio: " + window.Math.random());
// Tambien puedes quitar wuindow y poner solo Math.random();
console.log("Número aleatorio: " + Math.random());

let resultado;
resultado = Math.PI;
resultado = Math.sqrt(144); //Raiz cuadrada
resultado = Math.pow(2, 3); //Potencia
resultado = Math.abs(-5); //Lo convierte en positivo
resultado = Math.min(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //Devuelve el numero mas pequeño
resultado = Math.max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //Devuelve el numero mas grande
resultado = Math.floor(Math.random() * 100 + 1); // Numero random hasta 100
resultado = Math.floor(Math.random() * 30);// hasta 30



console.log("Número PI: " + resultado);
console.log("Número redondeado: " + Math.round(2.7)); // Redondea hacia abajo Ej: 2.5 hacia arriba, 2.4 hacia abajo
console.log("Número redondeado: " + Math.ceil(2.1)); // Redondea hacia arriba
console.log("Número redondeado: " + Math.floor(2.9)); // Redondea hacia abajo

console.log(resultado);