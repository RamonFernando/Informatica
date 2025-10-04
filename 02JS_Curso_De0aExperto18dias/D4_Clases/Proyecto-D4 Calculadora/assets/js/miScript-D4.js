/* Script Proyecto D4 Calculadora */

/* Funcion que muestra el parametro obtenido por el id resultado
y lo guarda en el parametro parResultado para mostrarlo en pantalla
en el input con el id resultado */
function mostrarResultado(parResultado) {
    let varResultado = document.getElementById("resultado");
    varResultado.value = parResultado;
}
/* Función que permite hacer la suma de dos números obtenidos por 
los parametros del input con el id numero-1 y numero-2 */
function sumar() {
    let num1 = +document.getElementById("numero-1").value;
    let num2 = +document.getElementById("numero-2").value;
    mostrarResultado(num1 + num2);

}
function restar () {
    let num1 = +document.getElementById("numero-1").value;
    let num2 = +document.getElementById("numero-2").value;
    mostrarResultado(num1 - num2);
}
function multiplicar () {
    let num1 = +document.getElementById("numero-1").value;
    let num2 = +document.getElementById("numero-2").value;
    mostrarResultado(num1 * num2);
}
function dividir () {
    let num1 = +document.getElementById("numero-1").value;
    let num2 = +document.getElementById("numero-2").value;
    mostrarResultado(num1 / num2);
}
function potencia () {
    let num1 = +document.getElementById("numero-1").value;
    let num2 = +document.getElementById("numero-2").value;
    mostrarResultado(Math.pow(num1, num2));
}
function raiz () {
    let numero = +document.getElementById("numero-1").value;
    mostrarResultado(Math.sqrt(numero));
}

/* Función que retorna el valor absoluto de un numero (numero positivo) */
function absoluto() {
    let numero = +document.getElementById("numero-1").value;
    mostrarResultado(Math.abs(numero));
   
}
/* Función de numero aleatorio */
function random() {
    let min = +document.getElementById("numero-1").value;
    let max = +document.getElementById("numero-2").value;
    max = max + 1;
    mostrarResultado(Math.floor(Math.random() * (max - min) + min));
}
/* Funcion de redondeo con el input Resultado con el id resultado */
function round () {
    let resultado = +document.getElementById("resultado").value;
    mostrarResultado(Math.round(resultado.toFixed(2)));
}
/* Funcion de redondeo hacia abajo */
function floor () {
    let resultado = +document.getElementById("resultado").value;
    mostrarResultado(Math.floor(resultado));
}
/* Funcion de redondeo hacia arriba */
function ceil () {
   let resultado = +document.getElementById("resultado").value;
    mostrarResultado(Math.ceil(resultado));
}

