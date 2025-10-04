const readline = require('readline');
// ejercicio 1 
let estaciones = ["Primavera", "Verano", "Otoño", "Invierno"];

for (let i = 0; i < estaciones.length; i++) {
    console.log(estaciones[i]);
}

// ejercicio 2

let meses = [
    "Enero", 
    "Febrero", 
    "Marzo", 
    "Abril", 
    "Mayo", 
    "Junio", 
    "Julio", 
    "Agosto", 
    "Septiembre", 
    "Octubre", 
    "Noviembre", 
    "Diciembre"
];

let i = 0;

while (i < meses.length) {
    console.log(meses[i]);
    i++; //
}

// ejercicio 3

let densidades = [
    0.69, // Mercurio
    5.43, // Venus
    5.97, // Tierra
    0.69, // Marte
    24.79, // Júpiter
    14.53, // Saturno
    1.23, // Urano
    0.87, // Neptuno
    1.50  // Plutón
];

for (let i = 0; i < densidades.length; i++) {
    console.log("Densidad del planeta " + (i + 1) + ": " + densidades[i] + " g/cm³");
}

// ejercicio 4

let compañeros = ["Juan", "María", "Pedro", "Ana"];

for (let i = 0; i < compañeros.length; i++) {
    console.log("Compañero " + (i + 1) + ": " + compañeros[i]);
}

// ejercicio 5

let notas = [7.5, 8.0, 6.5, 9.0, 8.5];
let init = 0;

while (init < notas.length) {
    console.log("Nota del examen " + (init + 1) + ": " + notas[init]); // Imprimir cada nota en la consola
    init++; // Incrementar el contador
}

// ejercicio 6

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Creamos un array vacío para almacenar los precios
let precios = [];
let contador4 = 0;

// Función para pedir el precio de un producto
function pedirPrecio() {
  rl.question(`Ingresa el precio del producto ${contador4 + 1}: `, (input) => {
    let precio = parseFloat(input);
    precios.push(precio);
    contador4++;

    // Si hemos ingresado los precios de 10 productos, mostramos el resultado
    if (contador4 < 10) {
      pedirPrecio(); // Pedimos el siguiente precio
    } else {
      console.log("Precios de los productos:");
      for (let i = 0; i < precios.length; i++) {
        console.log(`Producto ${i + 1}: $${precios[i].toFixed(2)}`);
      }
      rl.close(); // Cerramos la interfaz de lectura
    }
  });
}

// Iniciamos el proceso
pedirPrecio();
// Cerramos la interfaz de lectura
rl.close();

// ejercicio 7 y 8

let notas2 = new Array(10);
let i2 = 0;

while (i2 < 10) {
    let nota = parseFloat(prompt("Introduce la nota " + (i2 + 1) + " (o un número negativo para terminar):"));

    if (nota < 0) {
        console.log("Se ha introducido un número negativo. Termina la entrada de notas.");
        break;
    }

    notas2[i2] = nota;

    i++;
}

console.log("Notas introducidas:");
for (let j = 0; j < i2; j++) {
    console.log("Nota " + (j + 1) + ": " + notas[j]);
}

// ejercicio 9

let test = new Array(5);

test[0] = prompt("Introduce la pregunta:");
test[1] = prompt("Introduce la respuesta a):");
test[2] = prompt("Introduce la respuesta b):");
test[3] = prompt("Introduce la respuesta c):");
test[4] = prompt("Introduce la respuesta d):");

console.log(test[0]);
console.log("a) " + test[1]);
console.log("b) " + test[2]);
console.log("c) " + test[3]);
console.log("d) " + test[4]);

// ejercicio 10

let compra = new Array(100);
let contador = 0;

while (contador < 100) {
    let precio = parseFloat(prompt("Introduce el precio del producto (o 0 para terminar):"));

    if (precio === 0) {
        break;
    }

    compra[contador] = precio;
    contador++;
}

console.log("Precios introducidos:");
for (let i = 0; i < contador; i++) {
    console.log("Producto " + (i + 1) + ": " + compra[i] + " €");
}

// ejercicio 11

let ordenes = new Array(1000);
let contador2 = 0;

while (contador2 < 1000) {
    let orden = prompt("Introduce una orden (izquierda, derecha, arriba, abajo, matar) o 'ejecutar' para finalizar:");

    if (orden.toLowerCase() === "ejecutar") {
        break; // Salir del bucle
    }

    ordenes[contador2] = orden;
    contador++;
}

console.log("Órdenes para el robot:");
for (let i = 0; i < contador2; i++) {
    console.log("Orden " + (i + 1) + ": " + ordenes[i]);
}

// ejercicio 12

let matriculas = new Array(100);

for (let i = 0; i < matriculas.length; i++) {
    matriculas[i] = "sinmatricula";
}

console.log("Matrículas:");
for (let i = 0; i < matriculas.length; i++) {
    console.log("Posición " + i + ": " + matriculas[i]);
}

// ejercicio 13

let potencias = new Array(20);

for (let i = 0; i < potencias.length; i++) {
    potencias[i] = Math.pow(2, i);
}

let index = 0;
console.log("Las primeras 20 potencias de 2 son:");
while (index < potencias.length) {
    console.log("2^" + index + " = " + potencias[index]);
    index++;
}

// ejercicio 14

let primos = [];
let contador3 = 0;
let numero = 2;

while (contador3 < 100) {
    let esPrimo = true;

    for (let i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i === 0) {
            esPrimo = false;
            break;
        }
    }

    if (esPrimo) {
        primos.push(numero);
        contador3++;
    }

    numero++; 
}

console.log("Los primeros 100 números primos son:");
console.log(primos);

// ejercicio 15 y 16

let temperaturas = [
    15, 16.1, 16, 15.4, 15, 14,
    10.2, 11, 11.5, 10, 10.1,
    9.8, 9, 6
];

let sumaTemperaturas = 0;
let numeroDeTemperaturas = temperaturas.length;
let contadorTemperaturasAltas = 0;

for (let i = 0; i < numeroDeTemperaturas; i++) {
    sumaTemperaturas += temperaturas[i];
    if (temperaturas[i] > 12) {
        contadorTemperaturasAltas++;
    }
}

let temperaturaMedia = sumaTemperaturas / numeroDeTemperaturas;

console.log("La temperatura media es: " + temperaturaMedia.toFixed(2) + " ºC");
console.log("Número de temperaturas por encima de 12 ºC: " + contadorTemperaturasAltas);

// ejercicio 17

let precios2 = [];
let sumaTotal = 0;
let contadorMayor10 = 0;

for (let i = 1; i <= 10; i++) {
    let precio = parseFloat(prompt("Introduce el precio del producto " + i + ":"));

    if (!isNaN(precio)) {
        precios2.push(precio);
        sumaTotal += precio;

        if (precio > 10) {
            contadorMayor10++;
        }
    } else {
        console.log("Por favor, introduce un número válido.");
        i--;
    }
}

console.log("Precio total a pagar: " + sumaTotal.toFixed(2) + " euros");
console.log("Número de productos cuyo precio es mayor de 10 euros: " + contadorMayor10);