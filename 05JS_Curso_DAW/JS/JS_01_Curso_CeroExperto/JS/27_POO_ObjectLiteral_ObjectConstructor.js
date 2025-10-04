// POO Programación orientada a objetos
//  Object Constructor
// Una clase es una forma de almacenar objetos que contenen propiedades y métodos
// El constructor sirve para crear diferentes objetos "Producto" con diferentes propiedades o instancias
// Prototype: Nos va a permitir crear funciones que solo se utilizan a un objeto en específico

//  Object Literal
const producto = {
    nombre: "Tablet",
    precio: 500,
    disponible: true
};
//Cliente
function Cliente (nombre,apellidos){
    this.nombre = nombre;
    this.apellidos = apellidos;
};
//Producto
function Producto(nombre, precio, disponible){
    this.nombre = nombre;
    this.precio = precio;
    this.disponible = disponible;
};
// Prototype (Cliente y Producto)
Cliente.prototype.formatearCliente = function(){ // En este metodo si esta permitido usar this
    return `Cliente: ${this.nombre}\nApellido: ${this.apellidos}`;
}
Producto.prototype.formatearProducto = function(){ // En este metodo si esta permitido usar this
    return `Producto: ${this.nombre}\nPrecio: ${this.precio}\nDisponibilidad: ${this.disponible}`;
}

// Ejemplo de funcion 
// Tipo de error: si utilizas this.nombre, this.precio, this.disponible salen undefined
function formatearProducto(producto){
    return `Producto: ${producto.nombre}\nPrecio: ${producto.precio}\nDisponibilidad: ${producto.disponible}`;
}

// Creando un nuevo producto apartir del constructor Producto
const producto1 = new Producto('Monitor 24 Pulgadas', 300, true);
const producto2 = new Producto('Monitor 27 Pulgadas', 350, true);
const producto3 = new Producto('Laptop 17 Pulgadas', 1500, true);
// Creando un nuevo cliente apartir del constructor Cliente
const cliente1 = new Cliente('Ramon','Perez');
const cliente2 = new Cliente('Blas','Dias');

// Mostrar por consola
console.log("Prototype");

// cliente
console.log(cliente1, cliente2);
console.log(cliente1.formatearCliente());
console.log(cliente2.formatearCliente());

// producto
console.log(producto1, producto2);
console.log(producto1.formatearProducto());
console.log(producto2.formatearProducto());

