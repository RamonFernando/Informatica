// Map vs forEach

// Arrays 
const carrito = [
    { nombre: "Monitor MSI Predator 27 Pulgadas 240Hz", precio: 500 },
    { nombre: "Televisión LG 50 Pulgadas 120Hz", precio: 700 },
    { nombre: "Tablet Samsung A5 10 Pulgadas 120Hz", precio: 300 },
    { nombre: "Audifonos Asus 7.1", precio: 200 },
    { nombre: "Teclado Gaming Asus K90", precio: 50 },
    { nombre: "Celular One plus 10 pro 120Hz", precio: 500 },
    { nombre: "Celular One plus 11 pro 120Hz", precio: 700 },
    { nombre: "Mouse Logitech G502", precio: 50 },
    { nombre: "PC Asus ROG", precio: 1000 },
    { nombre: "Grafica Nvidia RTX 4080", precio: 1500 },
    { nombre: "Laptop MSI Vector GP77", precio: 1600 },
  ];

// Map Ejemplo: Diferencia entre forEach y Map
/* Cuando se utiliza Map o forEach: 
 * forEach: Para mostrar un array para iterar y mostrarlo por consola 
 * Map: Para crear un array nuevo apartir de uno existente, mejor el map
 */
/** Sintaxis de ejemplo (no correcta) **/
// Ejemplo de cuando usar un forEach o un Map (se modifica el array carrito para obtener solamente el nombre de los productos)
console.log("Arreglo 1");
const arreglo1 = carrito.forEach( producto => producto.nombre); // Muestra indefined
console.log(arreglo1);

console.log("arreglo2");
const arreglo2 = carrito.map( producto => producto.nombre); // Muestra el array 
console.log(arreglo2);

console.log("Arreglo 3"); // Modificando el array para mnostrar las variables de nombres y precios sin las etiquetas "nombre" y "precio" delante
const arreglo3 = carrito.map( producto => console.log(`${producto.nombre} - ${producto.precio}`));
console.log("Mostrando el array indefinido"); 
console.log(arreglo3);

/** Sintaxis de ejemplo (correcta) **/
console.log("Arreglo 4");
const arreglo4 = carrito.forEach( producto => console.log(producto.nombre)); 

console.log("Arreglo 5");
const arreglo5 = carrito.map( producto => console.log(producto.nombre)); 


// Arrow function
console.log("Map");
console.log("Map - Arrow function");
carrito.map( producto => console.log(`Nombre: ${producto.nombre} \nPrecio: ${producto.precio}€`));

// forEach
console.log("Map - forEach");
let contador = 1;
carrito.map( function(producto){
    console.log(`${contador}º Nombre: ${producto.nombre} \nPrecio: ${producto.precio}€`);
    contador++;
});