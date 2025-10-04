// 1. Crear un array de productos
let productos = [
    { nombre: "Camiseta", precio: 15 },
    { nombre: "Pantalón", precio: 25 },
    { nombre: "Zapatos", precio: 50 },
    { nombre: "Sombrero", precio: 10 }
];

// 2. Filtrar productos con precio mayor a $20
let productosCaros = productos.filter((producto) => producto.precio > 20);

// 3. Mostrar los productos filtrados
console.log("Productos caros:");
productosCaros.forEach((producto) => {
    console.log(`- ${producto.nombre}: $${producto.precio}`);
});
