// ----------------------- VALIDADOR DE NUMEROS JS ------------------------

/**
 * 1. Comprobacion de un numero entero sin parametro
 * 2. comprobar si es un numero entero por parametro con Number.isInteger()
 * 3. comprobar si es un numero entero usando Math.floor() y Math.ceil()
 * 4. comprobar si es un numero entero usando Number() y isNaN()
 * 5. comprobar si es un numero entero usando parseInt()
 * 6. Comprobacion de un numero positivo o negativo
 * 7. Pedir numero por consola y validar si esta entre 1 y 10
 * 8. Preguntar un numero por consola y validar si esta entre 1 y 10 con document.getElementById()
 * 9. Validar suma de dos numeros obteniendolos desde los INPUTS de id num1 y num2
 * 10. Validar numero entre 1 y 10 While(true) Best Case O(1) Worst Case O(n) 
 */

// 1. Comprobacion de un numero entero sin parametro
function comprobarEntero() {
    var numero = document.getElementById("numero").value;
    if (isNaN(numero)) {
        alert("No es un numero");
    } else {
        alert("Es un numero");
    }
}

// 2. comprobar si es un numero entero por parametro
function esEntero(numero){
    return Number.isInteger(numero);
}
console.log(esEntero(5));      // true
console.log(esEntero(3.14));   // false
console.log(esEntero("5"));    // false (una cadena no es un número)
console.log(esEntero(NaN));    // false (NaN no es un entero)
console.log(Number.isInteger(Infinity));   // false (Infinity no es un entero)
console.log(Number.isInteger(-10));        // true (números enteros negativos también son válidos)

// 3. También puedes usar Math.floor() o Math.ceil() para verificar si un valor es un número entero. 
// Un número es entero si Math.floor(valor) es igual al mismo valor.
function esEntero(valor) {
    return typeof valor === "number" && Math.floor(valor) === valor;
  }
  console.log(esEntero(5));      // true
console.log(esEntero(3.14));   // false
console.log(esEntero("5"));    // false

// 4. Otra opción es intentar convertir el valor a número usando Number() y verificar que no sea NaN. (vacio o NaN)
// Por ejemplo: 
function esNumero(valor) {
    return !isNaN(Number(valor));
  }
  console.log(esNumero(5));       // true
console.log(esNumero("3.14"));    // true
console.log(esNumero("5"));       // true
console.log(esNumero("texto"));   // false
console.log(esNumero(NaN));       // false

// 5. Otro método es comprobar si un valor es un número entero usando parseInt().
function esEntero(valor) {
    return parseInt(valor) === valor;
  }
  
  console.log(esEntero(5));       // true
  console.log(esEntero("5"));     // false (es una cadena)
  console.log(esEntero(3.14));    // false (es decimal)
  console.log(esEntero("3.14"));  // false (es una cadena decimal)
  console.log(esEntero(NaN));

// 6. Comprobacion de un numero positivo o negativo
// Primero, la función verifica si el valor es un número usando typeof numero !== "number" y que no es NaN
// Luego, evalúa:
// Si numero > 0, el número es positivo.
// Si numero < 0, el número es negativo.
// Si ninguna de las anteriores es verdadera, entonces el número debe ser cero.
function verificarPositivoNegativo(numero) {
    if (typeof numero !== "number" || isNaN(numero)) {
      return "El valor no es un número válido";
    }
    
    if (numero > 0) {
      return "El número es positivo";
    } else if (numero < 0) {
      return "El número es negativo";
    } else {
      return "El número es cero";
    }
  }
  
  console.log(verificarPositivoNegativo(10));    // "El número es positivo"
  console.log(verificarPositivoNegativo(-5));    // "El número es negativo"
  console.log(verificarPositivoNegativo(0));     // "El número es cero"
  console.log(verificarPositivoNegativo("10"));  // "El valor no es un número válido"
  console.log(verificarPositivoNegativo(NaN));   // "El valor no es un número válido"

  // 7. Pedir numero por consola y validar si esta entre 1 y 10
  /**
   * prompt: Muestra un cuadro de entrada en el navegador donde el usuario puede escribir un número.
parseFloat: Convierte la entrada de texto a un número decimal (en caso de que el usuario ingrese un número con decimales).
Bucle: do...while: El bucle seguirá ejecutándose hasta que el número esté entre 1 y 10. Si el número no es válido, 
el código muestra un alert pidiendo al usuario que ingrese un número correcto.
isNaN(): Verifica si la entrada no es un número, para asegurarse de que el valor es numérico.
alert: Muestra un mensaje indicando que el número es válido una vez que se encuentra dentro del rango.
   */

  function pedirNumero() {
    let numero;
  
    // Bucle que seguirá pidiendo el número hasta que esté entre 1 y 10
    do {
      // Pedir el número al usuario (esto es solo válido en el navegador)
      numero = parseFloat(prompt("Introduce un número entre 1 y 10:"));
  
      // Verificar si el número está entre 1 y 10
      if (isNaN(numero) || numero < 1 || numero > 10) {
        alert("Por favor, introduce un número válido entre 1 y 10.");
      }
    } while (isNaN(numero) || numero < 1 || numero > 10);
  
    alert("¡Número válido! El número es: " + numero);
  }
  
  pedirNumero(); // Llamar a la función para empezar

  // 8. Pedir numero por consola y validar si esta entre 1 y 10 con document.getElementById()

  /**
   * <!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Validación de número entre 1 y 10</title>
</head>
<body>

  <h1>Introduce un número entre 1 y 10</h1>

  <!-- Campo de entrada para el número -->
  <input type="number" id="numeroInput" placeholder="Introduce un número">

  <!-- Botón para validar -->
  <button onclick="validarNumero()">Validar</button>

  <!-- Área de texto para mostrar el resultado -->
  <p id="resultado"></p>

  <script src="script.js"></script>
</body>
</html>
   */

function validarNumero() {
    // Obtener el valor ingresado en el campo de texto
    let numero = document.getElementById("numeroInput").value;
  
    // Convertir a número
    numero = parseFloat(numero);
  
    // Obtener el área de texto para mostrar el resultado
    let resultado = document.getElementById("resultado");
  
    // Verificar si el número está entre 1 y 10
    if (isNaN(numero) || numero < 1 || numero > 10) {
        // Mostrar el mensaje en el html en un parrafo
      resultado.textContent = "<p>Por favor, introduce un número válido entre 1 y 10.</p>";
      resultado.style.color = "<p>red</p>";  // Mostrar el mensaje en rojo
    } else {
      resultado.textContent = "<p>¡Número válido! El número es: " + numero + "</p>";
      resultado.style.color = "<p>green</p>";// Mostrar el mensaje en verde
    }
  }

  /**
   * Explicacion: 
   * 
HTML:
Se incluye un campo de entrada (<input>) con id="numeroInput", que es donde el usuario ingresará el número.
Un botón (<button>) llama a la función validarNumero() cuando es presionado.
Un párrafo (<p>) con id="resultado" donde se mostrará el mensaje de validación.

JavaScript:
document.getElementById("numeroInput").value obtiene el valor ingresado por el usuario en el campo de texto.
parseFloat(numero) convierte el valor a un número decimal. Si el usuario ingresa algo que no sea un número, será NaN.
isNaN(numero) verifica si el valor no es un número, y las condiciones numero < 1 || numero > 10 aseguran que el 
número esté en el rango correcto.
El resultado se muestra en el elemento con id="resultado". Dependiendo de si el número es válido o no, 
el mensaje se muestra en rojo o verde.
*/

// 9. Validar suma de dos numeros obtenidos desde los inputs de id num1 y num2

// Funcion para validar la suma de dos numeros
function validarSuma() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let suma = num1 + num2;
    alert("La suma de los dos números es: " + suma);
  }

  // Validamos la suma de dos numeros obteniendolos desde los inputs de id num1 y num2
  function sumar() {
    // Obtener el valor de los inputs (id)
    let num1 = document.getElementById("inputSuma").value;
    let num2 = document.getElementById("inputSuma2").value;
    
    // Resultado de la suma
    let elementoResultado = document.getElementById("inputResultado");
    let resultado = Number(num1) + Number(num2);
    elementoResultado.value = resultado;
    
    // Resultado de la suma de ejemplo
    let elementoSalida = document.getElementById("EjSalida");
    let Ejresultado = Number(15) + Number(19);
    elementoSalida.textContent = Ejresultado;
}

// 10. Validar numero entre 1 y 10 While(true) Best Case O(1) Worst Case O(n)
while(true){
  var nota = prompt("Introduce una nota");
  if(nota > 1 && nota <= 10){
      var color = (nota < 4) ? "rojo" : (nota < 5) ? "verde" : "azul";
      alert(`La nota es ${nota} y el color es ${color}`);
      break;
  }else{
          alert("Error: La nota debe estar entre 1 y 10");
  }
}