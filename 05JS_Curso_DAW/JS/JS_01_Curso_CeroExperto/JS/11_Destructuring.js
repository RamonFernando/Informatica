//Objeto
const producto = {
    nombre: "Monitor 20\" Pulgadas",
    precio: 300,
    disponible: true
}
const producto1 = {
    nombreProducto: "Monitor 30\" Pulgadas",
    precioProducto: 200,
    disponible: false
}
//Forma anterior de acceder a las propiedades del Objeto
console.log("Producto");
const precio = producto.precio;
const nombre = producto.nombre;
console.log(precio);
console.log(nombre);
console.log(producto.disponible);
console.log(producto);

console.log("---------");

console.log("Producto 1");
//Destructuring (crea la variable precio y extrae el valor del objeto)
const {precioProducto, nombreProducto} = producto1;

//Mostrar por consola
console.log(precioProducto);
console.log(nombreProducto);
console.log(producto1.disponible);
console.log(producto1);