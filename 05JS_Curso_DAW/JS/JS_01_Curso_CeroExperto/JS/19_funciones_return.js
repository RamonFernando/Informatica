// Funciones con return

function sumar (num1, num2){
    return num1 + num2;
};

const resultado = sumar(2, 3);
console.log(resultado);

let total = 0;
function agregarCarrito(precio){
    return total += precio;
}
function calcularIVA(){
    return total * 1.21;
}

total = agregarCarrito(200);
total = agregarCarrito(400);
console.log(`Precio: ${total} €`);

const precioTotal = calcularIVA(total);
console.log(`Precio total (IVA): ${precioTotal} €`);