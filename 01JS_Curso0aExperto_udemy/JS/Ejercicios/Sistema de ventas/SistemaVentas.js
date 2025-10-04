'use strict';
class Producto {
    static contadorProductos = 0;
    
    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos; // con static se puede acceder sin instanciar
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }

    toString() {
        return `id: ${this._idProducto}, nombre: ${this._nombre}, precio: ${this._precio} €`;
    }
}

class Orden{
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS(){ // funcion que retorna el numero maximo de productos
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        // this._contadorProductosAgregados = 0; // para contar los productos que se vayan agregando a la orden
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.MAX_PRODUCTOS){
            this._productos.push(producto);
            // this._productos[this._contadorProductosAgregados] = producto;
        } else {
            console.log("Se ha alcanzado el numero máxmimo de productos");
        }
    }
    /*calcularProductos(){
        let precioTotal = 0;
        this._productos.forEach(producto => {
            precioTotal += producto.precio;
        })
        return precioTotal;
    }*/
    
    calcularTotal(){
        let precioTotal = 0;
        for(let producto of this._productos){
            precioTotal += producto.precio;
        }
        return precioTotal;
    }
    mostrarOrden (){
        let productosOrden = '';
        for(let producto of this._productos){
            productosOrden += '\n{' + producto.toString() + '} ';
        }
        console.log(`Orden: ${this.idOrden} Productos: ${productosOrden}\nPrecio Total: ${this.calcularTotal()} €`);
    }
}

// Creamos los productos
let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 100);
let producto3 = new Producto('Zapatos', 150);
let producto4 = new Producto('Cinturon', 50);

// Creamos la orden y posteriormente agregamos los productos
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);

orden1.mostrarOrden();

// Orden 2 Agregamos los productos
let orden2 = new Orden();
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto4);

orden2.mostrarOrden();

// Mostramos la suma de las ordenes 1 y 2 y luego las sumamos
console.log(`Orden 1: ${orden1.calcularTotal()} Orden 2: ${orden2.calcularTotal()}`);
console.log("Precio Ordenes: " + (orden1.calcularTotal() + orden2.calcularTotal()));





