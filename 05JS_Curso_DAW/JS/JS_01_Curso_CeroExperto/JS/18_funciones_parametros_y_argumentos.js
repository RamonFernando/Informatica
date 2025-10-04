// Funciones: Parametros y Argumentos

const sumar = function () {
    console.log(3 + 3);
}
sumar();

function multiplicar(numero1, numero2) { // Parametros: numero1 y 2
    console.log(numero1 * numero2); 
};
// Si no pasas los dos valores numericos dara un error o NaN(Not a Number)
multiplicar(10, 10); // Argumentos o numeros reales
multiplicar(3, 3);


function dividir(numero1, numero2) { // Parametros: numero1 y 2
    console.log(`Division resultado: \n ${numero1} / ${numero2} = ${numero1 / numero2}`); 
};
dividir(10, 2); // Argumentos o numeros reales
dividir(3, 2);

function dividir(numero1 = 0, numero2 = 0) { // Parametros por default a 0
    console.log(`Division resultado: \n ${numero1} / ${numero2} = ${numero1 / numero2}`); 
};
dividir(18, 3); // Argumentos o numeros reales
dividir(4, 2);
dividir(4) // Mostrará Infinity