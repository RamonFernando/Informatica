// Arrow function

const sumar = (num1, num2) => console.log(num1 + num2);
sumar(5, 10);

// Cuando solo hay un parametro de entrada los () son opcionales y las {} tambien
const aprendiendo = informatica => console.log(`Aprendiendo ${informatica}`);

aprendiendo('JavaScript');

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
const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio'];
// forEach
meses.forEach( meses =>{
    if (meses == 'Marzo') {
        console.log(`Mes de ${meses}`);
    }
});

// Ejemplo 1 
// Para arrays de objetos
// .some es ideal para arrays de objetos (retorna true o false)
const resultado2 = carrito.some( producto => producto.nombre === 'Celular One plus 10 pro 120Hz');
console.log(resultado2);

// Ejemplo 2
// Esta sintaxis es mas usada => indica una funcion (retorna true o false)
resultado3 = carrito.some(producto => producto.nombre === 'Celular One plus 11 pro 120Hz');
console.log(resultado3);

// .reduce 
// Reduce nos permite reducir un array a un solo valor
const resultadoReduce = carrito.reduce( function(precioTotal, producto){
    return precioTotal + producto.precio;
}, 0); // Inicializa el valor en cero
console.log('Resultado reduce: ' + resultadoReduce);
// Ejemplo con function
const resultadoReduce1 = carrito.reduce((precioTotal,producto) => precioTotal + producto.precio, 0);
console.log(`Resultado reduce 1: ${resultadoReduce1}`);

// .filter 
// Filter nos permite filtrar un array por un criterio o condicion asignado
resultadoCarrito = carrito.filter( producto => producto.precio < 400);
resultadoCarrito = carrito.filter( producto => producto.nombre !== 'Celular One plus 11 pro 120Hz');
console.log(resultadoCarrito);
