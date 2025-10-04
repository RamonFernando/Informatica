// Objetos 

//Variables
const nombreProducto = "Monitor 20\" Pulgadas";
const precio = 300;
const disponible = true;

//Objeto
const producto = {
    nombreProducto: "Monitor 20\" Pulgadas",
    precio: 300,
    disponible: true
}
//Mostrar Objeto por consola
console.log(`Datos de propducto: \nNombre: ${producto.nombreProducto} \nPrecio: ${producto.precio} \nDisponible: ${producto.disponible}`);
console.log( producto);
//Mostrar Objeto por consola otra manera de ostrar los datos del objeto
console.log("---------");
console.log(producto["precio"]);

console.log("---------");

// Agregar nuevas propiedades
producto.imagen = "imagen.jpg";
//Eliminar propiedades
delete producto.disponible;
console.log(producto);

