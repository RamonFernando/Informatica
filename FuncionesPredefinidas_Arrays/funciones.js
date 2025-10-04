// Funciones para manipulación de cadenas (Strings)
string.length; // Devuelve la longitud de la cadena.
string.charAt(index); // Devuelve el carácter en la posición 'index'.
string.substring(start, end); // Devuelve una parte de la cadena entre 'start' y 'end'.
string.slice(start, end); // Similar a substring, pero permite índices negativos.
string.toUpperCase(); // Convierte la cadena a mayúsculas.
string.toLowerCase(); // Convierte la cadena a minúsculas.
string.trim(); // Elimina espacios en blanco al inicio y al final.
string.includes(substring); // Comprueba si una subcadena está presente en la cadena.
string.indexOf(substring); // Devuelve la posición de la primera aparición de 'substring'.
string.replace(search, replace); // Reemplaza una subcadena por otra.
string.split(separator); // Divide la cadena en un array usando un separador.

// Funciones para manipulación de arrays
array.length; // Devuelve el número de elementos en el array.
array.push(element); // Agrega un elemento al final del array.
array.pop(); // Elimina el último elemento del array y lo devuelve.
array.shift(); // Elimina el primer elemento del array y lo devuelve.
array.unshift(element); // Agrega un elemento al inicio del array.
array.slice(start, end); // Devuelve una porción del array (sin modificar el original).
array.splice(start, deleteCount, items); // Agrega o elimina elementos en el array.
array.indexOf(element); // Devuelve la posición de un elemento (o -1 si no existe).
array.includes(element); // Comprueba si un elemento está presente en el array.
array.join(separator); // Combina todos los elementos del array en una cadena.
array.map(callback); // Aplica una función a cada elemento y devuelve un nuevo array.
array.filter(callback); // Devuelve un nuevo array con elementos que cumplen una condición.
array.reduce(callback, initialValue); // Reduce el array a un solo valor mediante una función.

// Funciones matemáticas (Math)
Math.abs(number); // Devuelve el valor absoluto de un número.
Math.round(number); // Redondea un número al entero más cercano.
Math.ceil(number); // Redondea un número hacia arriba.
Math.floor(number); // Redondea un número hacia abajo.
Math.max(...numbers); // Devuelve el número máximo de una lista.
Math.min(...numbers); // Devuelve el número mínimo de una lista.
Math.random(); // Devuelve un número aleatorio entre 0 (incluido) y 1 (excluido).
Math.pow(base, exponent); // Calcula la potencia de un número (base^exponent).
Math.sqrt(number); // Devuelve la raíz cuadrada de un número.


// Funciones de fecha y hora (Date)
const date = new Date(); // Crea un nuevo objeto de fecha con la fecha/hora actual.
date.getFullYear(); // Devuelve el año.
date.getMonth(); // Devuelve el mes (0-11).
date.getDate(); // Devuelve el día del mes (1-31).
date.getDay(); // Devuelve el día de la semana (0-6, donde 0 es domingo).
date.getHours(); // Devuelve la hora (0-23).
date.getMinutes(); // Devuelve los minutos (0-59).
date.getSeconds(); // Devuelve los segundos (0-59).
date.getTime(); // Devuelve el timestamp en milisegundos desde 1970-01-01.
date.toISOString(); // Devuelve la fecha en formato ISO (YYYY-MM-DDTHH:mm:ss.sssZ).
date.toLocaleDateString(); // Devuelve la fecha en formato local.

// Funciones de manipulación de objetos
Object.keys(obj); // Devuelve un array con las claves del objeto.
Object.values(obj); // Devuelve un array con los valores del objeto.
Object.entries(obj); // Devuelve un array con las claves y valores del objeto como pares [clave, valor].
Object.assign(target, source); // Copia las propiedades de uno o más objetos al objeto destino.
Object.freeze(obj); // Congela un objeto para que no pueda ser modificado.
Object.seal(obj); // Sella un objeto para que no se puedan agregar/eliminar propiedades.

// Funciones de manipulación de números
Number.isInteger(value); // Comprueba si un valor es un entero.
Number.isFinite(value); // Comprueba si un valor es un número finito.
Number.isNaN(value); // Comprueba si un valor es NaN (no un número).
Number.parseInt(string); // Convierte una cadena en un número entero.
Number.parseFloat(string); // Convierte una cadena en un número decimal.
value.toFixed(decimalPlaces); // Devuelve una cadena con el número redondeado a los decimales especificados.
value.toString(); // Convierte un número en una cadena.

// Funciones relacionadas con el DOM
document.getElementById(id); // Devuelve un elemento del DOM con el ID especificado.
document.querySelector(selector); // Devuelve el primer elemento que coincide con un selector CSS.
document.querySelectorAll(selector); // Devuelve todos los elementos que coinciden con un selector CSS.
element.textContent; // Obtiene o establece el texto dentro de un elemento.
element.innerHTML; // Obtiene o establece el contenido HTML de un elemento.
element.setAttribute(name, value); // Establece un atributo en un elemento.
element.removeAttribute(name); // Elimina un atributo de un elemento.
element.addEventListener(event, callback); // Agrega un manejador para un evento.
element.removeEventListener(event, callback); // Elimina un manejador de evento.

// Funciones de manejo de errores
try {
    // Código que puede generar un error
  } catch (error) {
    console.error(error); // Maneja el error.
  } finally {
    // Código que siempre se ejecuta, haya o no error.
  }
  
  throw new Error(message); // Lanza un nuevo error con un mensaje.

// Funciones de temporizadores
setTimeout(callback, delay); // Ejecuta una función después de un retraso (en milisegundos).
setInterval(callback, delay); // Ejecuta una función repetidamente con un retraso fijo.
clearTimeout(timeoutId); // Cancela un temporizador creado con setTimeout.
clearInterval(intervalId); // Cancela un temporizador creado con setInterval.

