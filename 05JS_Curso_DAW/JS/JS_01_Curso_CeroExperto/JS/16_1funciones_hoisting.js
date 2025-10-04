// Hoisting: En JavaScript, hoisting te permite usar funciones y variables antes de que se hayan declarado
// Ejemplo: 

// Esto es hoisting
multiplicar();
function multiplicar() {
    console.log(10*10);
};


// Expresion de la funcion
// Esta funcion JS lo registra mas como una variable
// Si esta llamada se pine antes de la creacion de la funcion sumar2 dara un error por que el sistema lo toma como variable
// sumar2();
const sumar2 = function () {
    console.log(3 + 3);
}
sumar2();