// for Loop

//Array
const array =   ["enero", "febrero", "marzo", "abril", "mayo", 
                "junio", "julio", "agosto", "septiembre", "octubre", 
                "noviembre", "diciembre"];
// Para recorrer el array
let contador = 1;
for (let i = 0; i < array.length; i++) {
  console.log(`${contador}º Mes: ${array[i]}`);
  contador++;
}
// Para mostrar numeros
/*for (let i = 0; i < 10; i++) {
    console.log(i);
}*/
console.log("for Loop");
// Para saber si el numero es par o impar y devolverlo por consola
for (let i = 0; i <= 10; i++) {
  if (i % 2 === 0 && i != 0) {
    console.log(`El numero ${i} es par`);
  } else if (i % 2 === 1 && i != 0) {
    console.log(`El numero ${i} es impar`);
  } else {
    console.log(`El numero ${i} no cumple esta condición`);
  }
}

// Arrays Methods
const carrito = [
  { nombre: "Monitor MSI Predator 27 Pulgadas 240Hz", precio: 500 },
  { nombre: "Televisión LG 50 Pulgadas 120Hz", precio: 700 },
  { nombre: "Tablet Samsung A5 10 Pulgadas 120Hz", precio: 300 },
  { nombre: "Audifonos Asus 7.1", precio: 200 },
  { nombre: "Teclado Gaming Asus K90", precio: 50 },
  { nombre: "Celular One plus 10 pro 120Hz", precio: 500 },
  { nombre: "Celular One plus 11 pro 120Hz", precio: 700 },
  { nombre: "Mouse Logitech G502", precio: 50 },
  { nombre: "PC Asus ROG", precio: 1000 },
  { nombre: "Grafica Nvidia RTX 4080", precio: 1500 },
  { nombre: "Laptop MSI Vector GP77", precio: 1600 },
];
// Para recorrer el array (Accediendo a propiedades del Array)
for (let i = 0; i < carrito.length; i++) {
  // Accediendo a los elementos del array .nombre y .precio
  console.log(`Nombre: ${carrito[i].nombre}\nPrecio: ${carrito[i].precio}€`);
}
