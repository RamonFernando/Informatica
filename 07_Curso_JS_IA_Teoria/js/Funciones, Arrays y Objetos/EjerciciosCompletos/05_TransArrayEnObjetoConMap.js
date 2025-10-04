let productos = [
    { nombre: "Laptop", precio: 1000 },
    { nombre: "Teléfono", precio: 500 },
    { nombre: "Tablet", precio: 300 },
];

// Agregar el precio con impuesto
let productosConImpuesto = productos.map((producto) => {
    return { ...producto, precioConImpuesto: producto.precio * 1.21 };
});

console.log(productosConImpuesto);
/*
[
    { nombre: 'Laptop', precio: 1000, precioConImpuesto: 1210 },
    { nombre: 'Teléfono', precio: 500, precioConImpuesto: 605 },
    { nombre: 'Tablet', precio: 300, precioConImpuesto: 363 }
]
*/
