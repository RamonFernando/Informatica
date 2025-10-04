// Arrays
const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio'];

// Arrays Methods
const carrito = [
    { nombre: 'Monitor MSI Predator 27 Pulgadas 240Hz', precio: 500 },
    { nombre: 'Televisión LG 50 Pulgadas 120Hz', precio: 700 },
    { nombre: 'Tablet Samsung A5 10 Pulgadas 120Hz', precio: 300 },
    { nombre: 'Audifonos Asus 7.1', precio: 200 },
    { nombre: 'Teclado Gaming Asus K90', precio: 50 },
    { nombre: 'Celular One plus 10 pro 120Hz', precio: 500 },
    { nombre: 'Celular One plus 11 pro 120Hz', precio: 700 },
    { nombre: 'Mouse Logitech G502', precio: 50 },
    { nombre: 'PC Asus ROG', precio: 1000 },
    { nombre: 'Grafica Nvidia RTX 4080', precio: 1500 },
    { nombre: 'Laptop MSI Vector GP77', precio: 1600 },
];

// forEach
meses.forEach( function(meses){
    if (meses == 'Marzo') {
        console.log(`Mes de ${meses}`);
    }
});

// Includes
// Esto funciona para arrays planos
const resultado = meses.includes('Marzo');
const resultado1 = meses.includes('Diciembre');
console.log(resultado); // true 
console.log(resultado1); // false

// Ejemplo 1 m
// Para arrays de objetos
// .some es ideal para arrays de objetos (retorna true o false)
const resultado2 = carrito.some( function(producto){
    return producto.nombre === 'Celular One plus 10 pro 120Hz';
})
console.log(resultado2);

// Ejemplo 2
// Esta sintaxis es mas usada => indica una funcion (retorna true o false)
resultado3 = carrito.some(producto => producto.nombre === 'Celular One plus 11 pro 120Hz');
console.log(resultado3);

// .reduce 
// Reduce nos permite reducir un array a un solo valor
const resultadoReduce = carrito.reduce( function(precioTotal, producto){
    return precioTotal + producto.precio;
}, 0);
// Ejemplo con function
const resultadoReduce1 = carrito.reduce((precioTotal,producto) => precioTotal + producto.precio, 0);
console.log(resultadoReduce1);

// .filter 
// Filter nos permite filtrar un array por un criterio o condicion asignado
resultadoCarrito = carrito.filter( function(producto){
    return producto.precio < 400;
});

resultadoCarrito = carrito.filter( function(producto){
    return producto.nombre !== 'Celular One plus 11 pro 120Hz'
});
console.log(resultadoCarrito);
