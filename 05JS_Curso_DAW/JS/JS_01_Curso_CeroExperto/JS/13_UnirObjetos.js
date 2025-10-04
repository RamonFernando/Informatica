//Objeto
const producto = {
    nombre: "Monitor 20\" Pulgadas",
    precio: 300,
    disponible: true
}
const medidas = {
    peso: '1kg',
    medidas: '1m'
}
// Este metodo nos permite agregar al objeto nuevoProducto el objeto producto y el objeto medidas (combinar ambos objetos en uno nuevo)
// const nuevoProducto = Object.assign(producto, medidas);
const nuevoProducto = {...producto, ...medidas};

// Muestra el objeto nuevoProducto con los objetos producto y medidas dentro
console.log(nuevoProducto);