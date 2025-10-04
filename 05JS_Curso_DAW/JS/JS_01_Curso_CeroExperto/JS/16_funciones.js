// Funciones
// Funciones: son una serie de procedimientos o instrucciones que realizan una acción especificada

// Declaracion y llamada de funciones
function saludar(nombre) {
    console.log(`Hola ${nombre}`);
}
saludar();
function multiplicar() {
    console.log(10*10);
};
multiplicar();

// Expresion de la funcion
const sumar2 = function () {
    console.log(3 + 3);
}
sumar2();
function sumar(a, b) {
    return a + b;
};
console.log(sumar(10, 20));

// IIFE: Immediately Invoked Function Expression (no es necesario llamarla)
/*La funcion IIFE: permite proteger las variables de otro archivo para que no se dupliquen en tu codigo
 Ejemplo al descargar una libreria o importar un archivo este puede chocar con tu codigo, si estan dentro de una
 funcion IIFE no se duplican las variables */
(function () {
    console.log('esto es una funcion');
})();