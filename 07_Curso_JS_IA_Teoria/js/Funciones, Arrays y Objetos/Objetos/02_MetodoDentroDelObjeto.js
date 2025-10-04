// Crear un objeto con métodos
let calculadora = {
    sumar: function (a, b) {
        return a + b;
    },
    restar: (a, b) => a - b, // También puedes usar funciones flecha
    multiplicar: (a, b) => a*b,
    dividir: function (a, b) {
        (b <= 0) ? console.log('No se puede dividir por 0') : console.log(a / b);
        return a / b;
    }
};

console.log(calculadora.sumar(5, 3)); // 8
console.log(calculadora.restar(10, 6)); // 4
console.log(calculadora.multiplicar(4, 6)); // 24
console.log(calculadora.dividir(20, 0)); // infinity
console.log(calculadora.dividir(20, 5)); // 4

/*
Los métodos son funciones dentro de un objeto.
Se acceden y llaman como objeto.metodo().
*/