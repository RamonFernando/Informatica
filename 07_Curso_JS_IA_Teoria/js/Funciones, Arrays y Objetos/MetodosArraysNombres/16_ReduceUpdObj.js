// Ejemplo: Actualizar el precio de un producto específico

let productos = [
    { id: 1, nombre: "Manzana", precio: 100 },
    { id: 2, nombre: "Banana", precio: 200 },
    { id: 3, nombre: "Cereza", precio: 300 },
];

console.log(productos);

let idProductoActualizar = 2;
let nuevoPrecio = 500;

let productosActualizado =  productos.reduce((resultado, producto) => {

    if(idProductoActualizar === producto.id){
        resultado.push({...producto, precio: nuevoPrecio});
    }else{
        resultado.push(producto); // Mantener el producto sin cambios y agregarlo al resultado
    }
    return resultado;
},[]);

console.log(productosActualizado);
// Salida: 
// [
//   { id: 1, nombre: "Manzana", precio: 100 },
//   { id: 2, nombre: "Banana", precio: 250 },
//   { id: 3, nombre: "Cereza", precio: 300 }
// ]