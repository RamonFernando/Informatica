// ejercicio 1

let edades = [20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19, 2];
let edadEncontrada = false;

for (let i = 0; i < edades.length; i++) {
    if (edades[i] === 35) {
        edadEncontrada = true;
        break;
    }
}

if (edadEncontrada) {
    console.log("Localizada persona de 35 años.");
} else {
    console.log("No se ha encontrado ninguna persona de 35 años.");
}

// ejercicio 2

let estaturas = [];

for (let i = 0; i < 10; i++) {
    let estatura = parseFloat(prompt("Introduce la estatura de la persona " + (i + 1) + " en metros:"));
    estaturas.push(estatura);
}

let estaturaMayor = false;

for (let i = 0; i < estaturas.length; i++) {
    if (estaturas[i] > 1.90) {
        estaturaMayor = true;
        break;
    }
}

if (estaturaMayor) {
    console.log("Hay al menos una persona con estatura mayor de 1.90 m.");
} else {
    console.log("No hay ninguna persona con estatura mayor de 1.90 m.");
}

// ejercicio 3

let nombres = [];
let nombreEncontrado = false;

for (let i = 0; i < 10; i++) {
    let nombre = prompt("Introduce un nombre (escribe 'nadie' para terminar):");
    
    if (nombre.toLowerCase() === "nadie") {
        break;
    }
    
    nombres.push(nombre);
}

for (let i = 0; i < nombres.length; i++) {
    if (nombres[i] === "Calderón") {
        nombreEncontrado = true;
        break;
    }
}

if (nombreEncontrado) {
    console.log("Calderón de la Barca");
} else {
    console.log("Nombre no encontrado");
}

// ejercicio 4

let productos = [];
let preciosCorrectos = true;
let sumaTotal = 0;

for (let i = 0; i < 10; i++) {
    let precio = parseFloat(prompt("Introduce el precio del producto " + (i + 1) + ":"));
    productos[i] = precio;
    
    if (precio < 0) {
        preciosCorrectos = false;
        console.log("Se ha encontrado un valor no válido en la posición " + i + ". El programa terminará.");
        break;
    }
}

if (preciosCorrectos) {
    for (let i = 0; i < productos.length; i++) {
        sumaTotal += productos[i];
    }
    console.log("La suma total de los precios es: " + sumaTotal + " euros.");
}

// ejercicio 5

let temperaturas = [
    15, 16.1, 16, 15.4, 15,
    14, 10.2, 11, 11.5, 10,
    10.1, 9.8, 9, 6
];

let maximo = temperaturas[0];
let minimo = temperaturas[0];
let posicionMaximo = 0;
let posicionMinimo = 0;

for (let i = 1; i < temperaturas.length; i++) {
    if (temperaturas[i] > maximo) {
        maximo = temperaturas[i];
        posicionMaximo = i;
    }
    if (temperaturas[i] < minimo) {
        minimo = temperaturas[i];
        posicionMinimo = i;
    }
}

console.log("La temperatura máxima es: " + maximo + " ºC, en la posición " + posicionMaximo);
console.log("La temperatura mínima es: " + minimo + " ºC, en la posición " + posicionMinimo);

// ejercicio 6

let votos = new Array(6);

for (let i = 0; i < votos.length; i++) {
    votos[i] = parseInt(prompt("Introduce los votos del partido " + (i + 1) + ":"));
}

let maximo2 = votos[0];
let minimo2 = votos[0];
let posicionMaximo2 = 0;
let posicionMinimo2 = 0;

for (let i = 1; i < votos.length; i++) {
    if (votos[i] > maximo2) {
        maximo2 = votos[i];
        posicionMaximo2 = i;
    }
    if (votos[i] < minimo) {
        minimo2 = votos[i];
        posicionMinimo2 = i;
    }
}

console.log("El partido con más votos tiene: " + maximo2 + " votos, en la posición " + posicionMaximo2);
console.log("El partido con menos votos tiene: " + minimo2 + " votos, en la posición " + posicionMinimo2);

// ejercicio 7

let espectadores = [
    2000000,
    2500000,
    3100000,
    3000000,
    1200000,
    1800000,
    2050000 
];

let maximo3 = espectadores[0];
let minimo3 = espectadores[0];
let diaMaximo = 0;
let diaMinimo = 0;

for (let i = 1; i < espectadores.length; i++) {
    if (espectadores[i] > maximo3) {
        maximo3 = espectadores[i];
        diaMaximo = i;
    }
    if (espectadores[i] < minimo3) {
        minimo3 = espectadores[i];
        diaMinimo = i;
    }
}

let dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];

console.log("Máximo de audiencia: " + maximo + " espectadores el " + dias[diaMaximo]);
console.log("Mínimo de audiencia: " + minimo + " espectadores el " + dias[diaMinimo]);

// ejercicio 8

let humedades = [
    45, // 0:00
    40, // 1:00
    40, // 2:00
    40, // 3:00
    37, // 4:00
    35, // 5:00
    39, // 6:00
    39, // 7:00
    45, // 8:00
    50, // 9:00
    55, // 10:00
    60, // 11:00
    65, // 12:00
    70, // 13:00
    70, // 14:00
    75, // 15:00
    75, // 16:00
    72, // 17:00
    65, // 18:00
    60, // 19:00
    55, // 20:00
    50, // 21:00
    50, // 22:00
    45  // 23:00
];

let maximo4 = humedades[0];
let minimo4 = humedades[0];
let horaMaximo = 0;
let horaMinimo = 0;

for (let i = 1; i < humedades.length; i++) {
    if (humedades[i] > maximo4) {
        maximo4 = humedades[i];
        horaMaximo = i;
    }
    if (humedades[i] < minimo4) {
        minimo4 = humedades[i];
        horaMinimo = i;
    }
}

console.log("Máxima humedad: " + maximo4 + "% a las " + horaMaximo + ":00 horas");
console.log("Mínima humedad: " + minimo4 + "% a las " + horaMinimo + ":00 horas");

// ejercicio 9

let precios = [43, 58, 44, 62, 80, 15, 15, 10, 90, 56];

for (let i = 0; i < precios.length - 1; i++) {
    let minIndex = i;
    
    for (let j = i + 1; j < precios.length; j++) {
        if (precios[j] < precios[minIndex]) {
            minIndex = j;
        }
    }

    if (minIndex !== i) {
        let temp = precios[i];
        precios[i] = precios[minIndex];
        precios[minIndex] = temp;
    }
}

console.log("Precios ordenados de menor a mayor:");
console.log(precios);

// ejercicio 10

let temperaturas2 = [];

for (let i = 0; i < 8; i++) {
    let temp = parseFloat(prompt(`Introduce la temperatura de la hora ${i + 1}:`));
    temperaturas2.push(temp);
}

for (let i = 0; i < temperaturas2.length - 1; i++) {
    let minIndex = i;
    
    for (let j = i + 1; j < temperaturas2.length; j++) {
        if (temperaturas2[j] < temperaturas2[minIndex]) {
            minIndex = j;
        }
    }
    
    if (minIndex !== i) {
        let temp = temperaturas2[i];
        temperaturas2[i] = temperaturas2[minIndex];
        temperaturas2[minIndex] = temp;
    }
}

console.log("Temperaturas ordenadas de menor a mayor:");
console.log(temperaturas2);

let tempMin = temperaturas2[0];
let tempMax = temperaturas2[temperaturas2.length - 1];
console.log(`Temperatura mínima: ${tempMin}°C`);
console.log(`Temperatura máxima: ${tempMax}°C`);

// ejercicio 11

let edades2 = [];

for (let i = 0; i < 10; i++) {
    let edad = parseInt(prompt(`Introduce la edad del alumno ${i + 1}:`));
    edades2.push(edad);
}

for (let i = 0; i < edades2.length - 1; i++) {
    let minIndex = i;
    
    for (let j = i + 1; j < edades2.length; j++) {
        if (edades2[j] < edades2[minIndex]) {
            minIndex = j;
        }
    }
    
    if (minIndex !== i) {
        let temp = edades2[i];
        edades2[i] = edades2[minIndex];
        edades2[minIndex] = temp;
    }
}

console.log("Edades ordenadas de menor a mayor:");
console.log(edades2);

// ejercicio 12

let numerosAtomicos = [8, 2, 10, 20, 12, 71, 15, 23];

for (let i = 0; i < numerosAtomicos.length - 1; i++) {
    let minIndex = i;

    for (let j = i + 1; j < numerosAtomicos.length; j++) {
        if (numerosAtomicos[j] < numerosAtomicos[minIndex]) {
            minIndex = j;
        }
    }

    if (minIndex !== i) {
        let temp = numerosAtomicos[i];
        numerosAtomicos[i] = numerosAtomicos[minIndex];
        numerosAtomicos[minIndex] = temp;
    }
}

let minimo5 = numerosAtomicos[0];
let maximo5 = numerosAtomicos[numerosAtomicos.length - 1];

console.log("Números atómicos ordenados de menor a mayor:");
console.log(numerosAtomicos);

console.log(`Número atómico menor: ${minimo5}`);
console.log(`Número atómico mayor: ${maximo5}`);

// ejercicio 13

let medidas = [
    [8.5, 1020, 40],  // Momento 1
    [14.2, 1021, 35], // Momento 2
    [11, 1022, 45],   // Momento 3
    [7, 1023, 50]     // Momento 4
];

console.log("Mediciones meteorológicas (Temperatura, Presión, Humedad):");
for (let i = 0; i < medidas.length; i++) {
    console.log(`Momento ${i + 1}: ${medidas[i].join(" | ")}`);
}

// ejercicio 14 y 15

let productos2 = [
    ["Tablet Samsung", 120],
    ["Móvil Sony", 115],
    ["Ipad Mini", 290],
    ["Móvil HTC", 95]
];

let precioTotal = 0;
let precioMenor = Number.MAX_VALUE;
let precioMayor = Number.MIN_VALUE;

console.log("Lista de productos y precios:");

for (let i = 0; i < productos2.length; i++) {
    let producto = productos2[i][0];
    let precio = productos2[i][1];
    precioTotal += precio;

    if (precio < precioMenor) {
        precioMenor = precio;
    }
    if (precio > precioMayor) {
        precioMayor = precio;
    }

    console.log(`${producto}: ${precio} €`);
}

console.log(`\nPrecio total de los cuatro artículos: ${precioTotal} €`);
console.log(`Precio menor: ${precioMenor} €`);
console.log(`Precio mayor: ${precioMayor} €`);

// ejercicio 16

const NUM_ALUMNOS = 3;
let alumnos = [];

for (let i = 0; i < NUM_ALUMNOS; i++) {
    let nombre = prompt(`Introduce el nombre del alumno ${i + 1}:`);
    let examen = parseFloat(prompt(`Introduce la nota de examen del alumno ${nombre}:`));
    let trabajo = parseFloat(prompt(`Introduce la nota de trabajos del alumno ${nombre}:`));
    let actitud = parseFloat(prompt(`Introduce la nota de actitud del alumno ${nombre}:`));
    
    alumnos.push([nombre, examen, trabajo, actitud]);
}

console.log("Lista de alumnos y sus notas de evaluación:");

for (let i = 0; i < alumnos.length; i++) {
    let nombre = alumnos[i][0];
    let examen = alumnos[i][1];
    let trabajo = alumnos[i][2];
    let actitud = alumnos[i][3];
    let notaEvaluacion = (50 * examen + 40 * trabajo + 10 * actitud) / 100;
    
    console.log(`${nombre}: ${notaEvaluacion.toFixed(2)}`);
}

// ejercicio 17

const plantas = 3;
const filas = 3;
const columnas = 3;
let temperaturas3 = new Array(plantas);

// Inicializar el array
for (let i = 0; i < plantas; i++) {
    temperaturas3[i] = new Array(filas);
    for (let j = 0; j < filas; j++) {
        temperaturas3[i][j] = new Array(columnas).fill(0);
    }
}

const valoresTemperaturas = [22.5, 21.0, 23.8, 19.5, 20.2];
let contadorTemperaturas = 0;

while (contadorTemperaturas < valoresTemperaturas.length) {
    const planta = Math.floor(Math.random() * plantas);
    const fila = Math.floor(Math.random() * filas);
    const columna = Math.floor(Math.random() * columnas);
    
    if (temperaturas3[planta][fila][columna] === 0) {
        temperaturas3[planta][fila][columna] = valoresTemperaturas[contadorTemperaturas];
        contadorTemperaturas++;
    }
}

let sumaTemperaturas = 0;
let cantidadTemperaturas = 0;

for (let i = 0; i < plantas; i++) {
    for (let j = 0; j < filas; j++) {
        for (let k = 0; k < columnas; k++) {
            sumaTemperaturas += temperaturas3[i][j][k];
            if (temperaturas3[i][j][k] !== 0) {
                cantidadTemperaturas++;
            }
        }
    }
}

let temperaturaMedia = (cantidadTemperaturas > 0) ? (sumaTemperaturas / cantidadTemperaturas) : 0;

console.log("Suma de todas las temperaturas:", sumaTemperaturas);
console.log("Temperatura media de las oficinas ocupadas:", temperaturaMedia.toFixed(2));

// ejercicio 18

const dimensiones = 3;
let huecos = new Array(dimensiones);

for (let i = 0; i < dimensiones; i++) {
    huecos[i] = new Array(dimensiones);
    for (let j = 0; j < dimensiones; j++) {
        huecos[i][j] = new Array(dimensiones);
    }
}

for (let i = 0; i < dimensiones; i++) {
    for (let j = 0; j < dimensiones; j++) {
        for (let k = 0; k < dimensiones; k++) {
            const color = Math.floor(Math.random() * 2) + 1;
            
            if (color === 1) {
                huecos[i][j][k] = "rojo";
            } else {
                huecos[i][j][k] = "azul";
            }
        }
    }
}

let bolasRojas = 0;
let bolasAzules = 0;

for (let i = 0; i < dimensiones; i++) {
    for (let j = 0; j < dimensiones; j++) {
        for (let k = 0; k < dimensiones; k++) {
            if (huecos[i][j][k] === "rojo") {
                bolasRojas++;
            } else {
                bolasAzules++;
            }
        }
    }
}

console.log("Número de bolas rojas:", bolasRojas);
console.log("Número de bolas azules:", bolasAzules);