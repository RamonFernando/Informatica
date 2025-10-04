/*
array.splice(índiceInicio, cantidadEliminar, elemento1, elemento2, ...);
índiceInicio: El índice donde comienzas a hacer cambios.
cantidadEliminar: El número de elementos que deseas eliminar a partir de índiceInicio.
elemento1, elemento2, ...: Los nuevos elementos que quieres insertar (opcional).
*/

// CRUD (Create, Read, Update, Delete)

// 1. Actualizar un elemento existente (Reemplazo)

// Actualizar el segundo elemento de un array de frutas:
let frutas = ["manzana", "banana", "naranja"];

// Actualizar "banana" a "pera"
frutas.splice(1, 1, "pera");

console.log(frutas);
// Salida: ["manzana", "pera", "naranja"]

/*
1: El índice donde comienza el cambio (posición de "banana").
1: Indica que se elimina un elemento ("banana").
"pera": Es el nuevo elemento que reemplaza a "banana".
*/

/*----------------------------------------------------------------------------*/

// 2. Insertar un elemento sin eliminar

// Insertar "uva" en la posición 2 sin eliminar nada:
let frutas1 = ["manzana", "banana", "naranja"];

// Insertar "uva" en el índice 2
frutas1.splice(2, 0, "uva");

console.log(frutas1);
// Salida: ["manzana", "banana", "uva", "naranja"]

// Para que se inserte "uva" al principio del array de frutas debería ser
// frutas.splice(0, 0, "uva");

/*
2: El índice donde se inserta "uva".
0: No se elimina ningún elemento.
"uva": El elemento que se inserta.
*/

/*----------------------------------------------------------------------------*/

// 3. Eliminar y agregar múltiples elementos

// Reemplazar "banana" y "naranja" por "fresa" y "sandía":
let frutas2 = ["manzana", "banana", "naranja", "pera"];

// Reemplazar "banana" y "naranja" por "fresa" y "sandía"
frutas2.splice(1, 2, "fresa", "sandía");

console.log(frutas2); 
// Salida: ["manzana", "fresa", "sandía", "pera"]

/*
1: El índice donde comienzan los cambios.
2: Se eliminan "banana" y "naranja".
"fresa", "sandía": Los nuevos elementos que se insertan en lugar de los eliminados.
*/

/*----------------------------------------------------------------------------*/

// 4. Eliminar un elemento específico

// Eliminar "naranja" del array:
let frutas3 = ["manzana", "banana", "naranja", "pera"];

// Eliminar "naranja" (índice 2)
frutas3.splice(2, 1);

console.log(frutas3);
// Salida: ["manzana", "banana", "pera"]

/*
2: El índice donde comienza el cambio.
1: Elimina un solo elemento ("naranja").
*/

/*----------------------------------------------------------------------------*/

// 5. Agregar un elemento al final del array

// Agregar "uva" al final del array:
let frutas4 = ["manzana", "banana", "naranja", "pera"];

// Agregar "uva" al final del array
frutas4.splice(frutas4.length, 0, "uva");

console.log(frutas4);
// Salida: ["manzana", "banana", "naranja", "pera", "uva"]

/*
frutas4.length: La longitud del array.
0: No se elimina ningúno elemento.
"uva": El elemento que se inserta.
*/

/*----------------------------------------------------------------------------*/

// 6. Vaciar y agregar nuevos elementos

// Reemplazar todo el contenido del array con nuevos elementos:

let frutas5 = ["manzana", "banana", "naranja"];

// Vaciar el array y agregar nuevos elementos
frutas5.splice(0, frutas.length, "kiwi", "mango", "papaya");

console.log(frutas5);
// Salida: ["kiwi", "mango", "papaya"]
