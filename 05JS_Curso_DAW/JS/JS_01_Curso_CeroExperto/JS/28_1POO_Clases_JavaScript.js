// Clases en JS
// El constructor es una funicion que se ejecuta cuando creamos un objeto

class Producto {
    constructor(nombre, precio,disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }
    // Retorna el producto si esta disponible
    formatearProducto(){
    if(this.disponible === true){
            return `Producto: ${this.nombre}\nPrecio: ${this.precio}€ \nDisponible: Disponible`;
        }else{
            return `Producto: ${this.nombre}\nPrecio: ${this.precio}€ \nDisponible: No Disponible`;
            }
    }
    // Retorna el precio
    retornarPrecio(){
        return console.log(`Precio: ${this.precio}€`);
    }
    
}

const producto1 = new Producto('Monitor 24 Pulgadas', 300,true);
const producto2 = new Producto('Laptop 17 Pulgadas', 1350,false);

console.log(producto1.formatearProducto());
console.log(producto2.formatearProducto());
console.log(producto2.retornarPrecio());


// Herencia 
class Libro extends Producto{
    constructor(nombre, precio,disponible,isbn){
        // Super se utiliza para acceder a las propiedades del constructor padre para heredar
        super(nombre, precio, disponible);
        this.isbn = isbn;
    }
    retornarIsbn(){
        return `ISBN: ${this.isbn}`;
    }
    formatearProductoLibro(){
        return `${super.formatearProducto()} \nISBN: ${this.isbn}`;
    }
}
const libro1 = new Libro('El Principito', 10, true,'123456789');
const libro2 = new Libro('JavaScript la Revolución', 120, true ,'123456781');
const libro3 = new Libro('El Codigo Davinci', 10, true, '123456789');
console.log(libro1.retornarIsbn());
console.log(libro3.formatearProductoLibro());