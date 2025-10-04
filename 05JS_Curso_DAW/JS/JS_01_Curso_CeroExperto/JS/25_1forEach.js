// ForEach y Map
// ForEach: Solo se puede usar en arrays

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

// ForEach
/* let contador = 1;
carrito.forEach(function({nombre, precio}){
    console.log(`${contador}º Nombre: ${nombre} \n   Precio: ${precio}€`)
    contador++;
}); */

// forEach arrow function
console.log("for Each - Arrow function");
carrito.forEach ( producto => console.log(`Nombre: ${producto.nombre} \nPrecio: ${producto.precio}€`));
// forEach
console.log("for Each");
let contador = 1;
carrito.forEach(function(producto){
    console.log(`${contador}º Nombre: ${producto.nombre} \n   Precio: ${producto.precio}€`)
    contador++;
});
