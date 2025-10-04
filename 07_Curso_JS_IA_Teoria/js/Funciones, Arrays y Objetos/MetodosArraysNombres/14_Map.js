// Crear un array de números
let numeros = [1, 2, 3, 4, 5];

// Duplicar cada número
let dobles = numeros.map((num) => num * 2);
console.log(dobles); // [2, 4, 6, 8, 10]

/* ---------------------------------------------------------------------------*/

// Crear un array de números
let numerosEnteros = [1, 2, 3, 4, 5];

// Elevar cada número al cuadrado
let cuadrados = numerosEnteros.map((num) => num ** 2);
console.log(cuadrados); // [1, 4, 9, 16, 25]


/* ---------------------------------------------------------------------------*/

// Convertir números a strings
let comoTexto = numeros.map((num) => `Número: ${num}`);
console.log(comoTexto); // ["Número: 1", "Número: 2", "Número: 3", ...]

// map crea un nuevo array aplicando la función pasada como argumento a cada elemento.
// El array original no se modifica.

// Array de objetos: lista de productos
let productos = [
    { nombre: "Laptop", precio: 1000 },
    { nombre: "Teléfono", precio: 500 },
    { nombre: "Tablet", precio: 300 }
];

// Usar map para calcular el precio con un 21% de impuesto
let productosConImpuesto = productos.map(
    (producto) => {
        return {
        ...producto, // Copiar las propiedades del producto original con spread
        precioConImpuesto: (producto.precio * 1.21) // Calcular el nuevo precio
    };
});

// Mostrar los nuevos productos con sus precios e impuestos
console.log(productosConImpuesto);
/*
[
    { nombre: "Laptop", precio: 1000, precioConImpuesto: 1210 },
    { nombre: "Teléfono", precio: 500, precioConImpuesto: 605 },
    { nombre: "Tablet", precio: 300, precioConImpuesto: 363 }
]
*/

productosConImpuesto.forEach((producto) => {
    console.log(`Nombre: ${producto.nombre} Precio: ${producto.precio}€ Precio con impuesto: ${producto.precioConImpuesto}€`);
});

/* ---------------------------------------------------------------------------*/

// Array de nombres
let nombres = ["Carlos", "Ana", "Miguel", "Sofía"];

// Usar map para transformar cada nombre en un objeto
let nombresConLongitud = nombres.map(
    (nombre) => {
        return {
            nombre: nombre, // El nombre original
            longitud: nombre.length // La longitud del nombre
        };
});

// Mostrar el nuevo array de objetos
console.log(nombresConLongitud);
/*
[
    { nombre: "Carlos", longitud: 6 },
    { nombre: "Ana", longitud: 3 },
    { nombre: "Miguel", longitud: 6 },
    { nombre: "Sofía", longitud: 5 }
]
*/
