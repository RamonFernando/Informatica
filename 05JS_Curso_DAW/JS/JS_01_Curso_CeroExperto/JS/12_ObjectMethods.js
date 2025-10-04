// Esta propiedad hace uso de las buenas practicas de programacion en JS
// Se recomienda usar strict para el codigo en JS
// "use strict"; // Correr JS en modo estricto

//Objeto
const producto = {
    nombre: "Monitor 20\" Pulgadas",
    precio: 300,
    disponible: true
}



// freeze: Este metodo no permite agregar, eliminar o modificar las propiedades o valores de un objeto
Object.freeze(producto);

// Para saber si un objeto esta sellado o no
console.log(Object.isFrozen(producto));

// Crear una nueva propiedad
producto.imagen = "imagen.jpg";
// Eliminar un producto
delete producto.precio;

// sealed: Este metodo si permite modificar las propiedades o valores existentes de un objeto pero no eliminar o agregar nuevos
Object.seal(producto);
console.log(Object.isSealed(producto));


console.log(producto);