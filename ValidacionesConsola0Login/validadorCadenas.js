// ----------------------- VALIDADOR DE CADENAS JS ------------------------
/**
 * 1. Comprobacion de una cadena entero sin parametro
 * 2. comprobar si es una cadena entera por parametro (con typeof)
 * 3. comprobar si es una cadena no vacia (tambien con typeof y length)
 * 
 */

// 1. Comprobacion de una cadena sin parametro
// Recive el parametro de la caja de texto del html id="cadena" y comprueba si es una cadena
function comprobarCadena() {
    var cadena = document.getElementById("cadena").value;
    if (isNaN(cadena)) { // isNaN() comprueba si un valor es NaN (Not a Number)
        alert("No es una cadena");
    } else {
        alert("Es una cadena");
    }
}

// 2. Comprobar si es una cadena por parametro (con typeof)
// typeof valor === "string" comprueba si el tipo de valor es exactamente "string", 
// devolviendo true si es una cadena y false en cualquier otro caso.
function esCadena(valor) {
    return typeof valor === "string";
  }
  
  console.log(esCadena("hola"));         // true
  console.log(esCadena("123"));          // true
  console.log(esCadena(123));            // false (es un número)
  console.log(esCadena(true));           // false (es un booleano)
  console.log(esCadena({ texto: "hi" }));// false (es un objeto)
  console.log(esCadena(""));             // true

  // 3. Comprobar si es una cadena no vacia 
  // Para comprobar si una cadena no está vacía en JavaScript, puedes verificar que el
  //valor es de tipo "string" y que su longitud es mayor que cero
  /**
   * typeof valor === "string" comprueba que el valor es de tipo "string".
    valor.length > 0 comprueba que la longitud de la cadena sea mayor que cero.
    La función devolverá true solo si el valor es una cadena y no está vacía, y false en cualquier otro caso.
   */
  function esCadenaNoVacia(valor) {
    return typeof valor === "string" && valor.length > 0;
  }
  
  console.log(esCadenaNoVacia("hola"));    // true
  console.log(esCadenaNoVacia("123"));     // true
  console.log(esCadenaNoVacia(""));        // false (cadena vacía)
  console.log(esCadenaNoVacia(123));       // false (no es una cadena)
  console.log(esCadenaNoVacia(true));      // false (no es una cadena)
  console.log(esCadenaNoVacia(null));      // false (no es una cadena)
  console.log(esCadenaNoVacia(undefined)); // false (no es una cadena)

