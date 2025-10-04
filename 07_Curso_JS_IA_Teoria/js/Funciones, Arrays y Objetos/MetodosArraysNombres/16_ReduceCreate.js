/*
3. Convertir y actualizar datos en un objeto
Puedes usar reduce para convertir un array en un objeto y actualizar campos durante la transformación.

Ejemplo: Crear un objeto de productos con precios actualizados
*/
// Estructura básica
/*
let NombreVariable = array.metodo ((var1, var2) => {
    // Codigo aquí
});
*/

let productos = [
    { id: 1, nombre: "Manzana", precio: 100 },
    { id: 2, nombre: "Banana", precio: 200 },
    { id: 3, nombre: "Cereza", precio: 300 },
];


let productosConDescuento = productos.reduce((resultado, producto) => {
    // AActualizamos el precio
    producto.precio = producto.precio * 0.9;
    // Agregamos el producto al resultado
    resultado.push(producto);
    return resultado;
}, []);
console.log(productosConDescuento);

// ** ------------------------------------------------------------------------ ** //

let productosConDescuento2 = productos.reduce((resultado, producto) => {
    
    // Actualizamos el precio
    resultado[producto.nombre] = producto.precio * 0.9;

    return resultado;
},{});

console.log(productosConDescuento2);

/*
El acumulador (resultado) comienza como un objeto vacío ({}).
Para cada producto, se calcula el precio con descuento y se agrega como una nueva propiedad del objeto usando el nombre como clave.
El resultado es un objeto con los productos y sus precios actualizados.
*/

// ** ------------------------------------------------------------------------ ** //

/*
Aplanar y actualizar datos complejos
Puedes usar reduce para aplanar estructuras complejas y actualizar elementos durante el proceso.

Ejemplo: Aplanar un array de arrays y actualizar valores multiplicados por 2
*/
let matriz = [[1, 2], [3, 4], [5, 6]];

let matrizAplanada = matriz.reduce((resultado, fila) => {

    let matrizActualizada = fila.map((numFila) => numFila * 2);
    return resultado.concat(matrizActualizada);

}, []);

console.log(matrizAplanada);