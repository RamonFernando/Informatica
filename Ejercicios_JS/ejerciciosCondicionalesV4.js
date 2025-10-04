// ejercicio 1

const temperatura = parseFloat(prompt("Introduce la temperatura del reactor nuclear (en °C):"));

if (temperatura > 120) {
    alert("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
} else {
    alert("La temperatura del reactor es segura.");
}

// ejercicio 2 y 3

const precioOriginal = parseFloat(prompt("Introduce el precio del producto (en €):"));

let precioFinal;

if (precioOriginal < 5) {
    precioFinal = precioOriginal + 2;
} else {
    if (precioOriginal > 80) {
        const descuento = precioOriginal * 0.10;
        precioFinal = precioOriginal - descuento;
    } else {
        precioFinal = precioOriginal;
    }
}

alert(`El precio final es: €${precioFinal.toFixed(2)}`);

// ejercicio 4

const contrasena = prompt("Introduce la contraseña:");

if (contrasena === "1234") {
    alert("Acceso permitido");
} else {
    alert("Acceso denegado");
}

// ejercicio 5

const numeroMes = parseInt(prompt("Introduce un número de mes (1-12):"));

if (numeroMes >= 1 && numeroMes <= 12) {
    alert("Mes correcto");
} else {
    alert("Mes no válido");
}

// ejercicio 6

const precioProducto = parseFloat(prompt("Introduce el precio del producto (en €):"));
const unidades = parseInt(prompt("Introduce el número de unidades compradas:"));
const costeTotal = precioProducto * unidades;

let precioFinal2;

if (costeTotal > 75) {
    const descuento = costeTotal * 0.15;
    precioFinal2 = costeTotal - descuento;
} else {
    const descuento = costeTotal * 0.05;
    precioFinal2 = costeTotal - descuento;
}

alert(`El precio final es: €${precioFinal2.toFixed(2)}`);

// ejercicio 7

const NUMERO_SECRETO = 7;
const numeroUsuario = parseInt(prompt("Adivina el número secreto (del 1 al 10):"));

if (numeroUsuario === NUMERO_SECRETO) {
    alert("¡Felicidades! Has adivinado el número secreto.");
} else {
    alert("Has fallado. Inténtalo de nuevo.");
}

// ejercicio 8

const respuestaUsuario = prompt("¿Cómo se dice 'ordenador' en inglés?");

if (respuestaUsuario.toLowerCase() === "computer") {
    alert("¡Felicidades! Has respondido correctamente.");
} else {
    alert("Lo siento, esa no es la respuesta correcta. Inténtalo de nuevo.");
}

// ejercicio 9

const precioProducto2 = parseFloat(prompt("Introduce el precio del producto (en €):"));
const unidades2 = parseInt(prompt("Introduce el número de unidades compradas:"));
const costeTotal2 = precioProducto * unidades;

let precioFinal3 = costeTotal;

if (costeTotal2 < 100) {
    alert("No tienes derecho a descuento.");
} else if (costeTotal2 > 200) {
    const descuento = costeTotal2 * 0.15;
    precioFinal3 = costeTotal2 - descuento;
} else {
    const descuento = costeTotal2 * 0.10;
    precioFinal3 = costeTotal2 - descuento;
}

alert(`El coste total de la compra es: €${costeTotal2.toFixed(2)}`);
alert(`El precio final después de aplicar el descuento es: €${precioFinal3.toFixed(2)}`);

// ejercicio 10 y 11

const nota = parseFloat(prompt("Introduce una nota entre 0 y 10:"));
let calificacion;

if (nota < 0 || nota > 10) {
    alert("Error: La nota debe estar entre 0 y 10.");
} else if (nota < 5) {
    calificacion = "Insuficiente";
} else if (nota < 7) {
    calificacion = "Suficiente";
} else if (nota < 9) {
    calificacion = "Bien";
} else if (nota < 10) {
    calificacion = "Notable";
} else {
    calificacion = "Sobresaliente";
}

if (calificacion) {
    alert(`La calificación es: ${calificacion}`);
}

// 12 y 13

const numeroMes2 = parseInt(prompt("Introduce el número del mes (1-4):"));
let nombreMes;

if (numeroMes2 >= 1 && numeroMes2 <= 4) {
    switch (numeroMes) {
        case 1:
            nombreMes2 = "Enero";
            break;
        case 2:
            nombreMes2 = "Febrero";
            break;
        case 3:
            nombreMes2 = "Marzo";
            break;
        case 4:
            nombreMes2 = "Abril";
            break;
    }
    alert(`El mes es: ${nombreMes2}`);
} else {
    alert("Mes no válido. Solo se aceptan números del 1 al 4.");
}

// ejercicio 14

const numeroMes3 = parseInt(prompt("Introduce el número del mes (1-12):"));
let nombreMes3;

switch (numeroMes3) {
    case 1:
        nombreMes3 = "Enero";
        break;
    case 2:
        nombreMes3 = "Febrero";
        break;
    case 3:
        nombreMes3 = "Marzo";
        break;
    case 4:
        nombreMes3 = "Abril";
        break;
    case 5:
        nombreMes3 = "Mayo";
        break;
    case 6:
        nombreMes3 = "Junio";
        break;
    case 7:
        nombreMes3 = "Julio";
        break;
    case 8:
        nombreMes3 = "Agosto";
        break;
    case 9:
        nombreMes3 = "Septiembre";
        break;
    case 10:
        nombreMes3 = "Octubre";
        break;
    case 11:
        nombreMes3 = "Noviembre";
        break;
    case 12:
        nombreMes3 = "Diciembre";
        break;
    default:
        nombreMes3 = "Mes no válido. Debe ser un número entre 1 y 12.";
        break;
}

alert(nombreMes3);

// ejercicio 15 y 16

const anio = parseInt(prompt("Introduce el año:"));
const numeroMes4 = parseInt(prompt("Introduce el número del mes (1-12):"));
let diasDelMes;

switch (numeroMes4) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        diasDelMes = 31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        diasDelMes = 30;
        break;
    case 2:
        if ((anio % 4 === 0 && anio % 100 !== 0) || (anio % 400 === 0)) {
            diasDelMes = 29;
        } else {
            diasDelMes = 28;
        }
        break;
    default:
        diasDelMes = "Mes no válido. Debe ser un número entre 1 y 12.";
        break;
}

alert(`El mes ${numeroMes4} del año ${anio} tiene: ${diasDelMes} días`);

// ejercicio 17

const numero1 = parseFloat(prompt("Introduce el primer número:"));
const numero2 = parseFloat(prompt("Introduce el segundo número:"));
const menu = `
Seleccione una operación:
1) Suma
2) Resta
3) Multiplicación
4) División
`;

const seleccion = parseInt(prompt(menu));
let resultado;

switch (seleccion) {
    case 1:
        resultado = numero1 + numero2;
        alert(`El resultado de la suma es: ${resultado}`);
        break;
    case 2:
        resultado = numero1 - numero2;
        alert(`El resultado de la resta es: ${resultado}`);
        break;
    case 3:
        resultado = numero1 * numero2;
        alert(`El resultado de la multiplicación es: ${resultado}`);
        break;
    case 4:
        if (numero2 !== 0) {
            resultado = numero1 / numero2;
            alert(`El resultado de la división es: ${resultado}`);
        } else {
            alert("Error: No se puede dividir entre cero.");
        }
        break;
    default:
        alert("Opción no válida. Por favor, selecciona un número entre 1 y 4.");
        break;
}

// ejercicio 18 y 19

const entrada = prompt("Introduce un número entero entre 1 y 10:");
const numero = parseInt(entrada);

if (!isNaN(numero) && numero >= 1 && numero <= 10) {
    alert(`El número introducido es: ${numero}`);

    if (numero === 3) {
        alert("¡Has acertado! El número es 3.");
    }
} else {
    alert("Error: Debes introducir un número entero entre 1 y 10.");
}

// ejercicio 20

const edad = parseInt(prompt("Introduce tu edad:"));
let mayorDeEdad;

if (edad < 18) {
    mayorDeEdad = true;
} else {
    mayorDeEdad = false;
}

alert(`Mayor de edad: ${mayorDeEdad}`);

// ejercicio 21

let nombre = prompt("¿Cuál es tu nombre?");

if (nombre === "") {
    nombre = "Desconocido";
}

alert(`Tu nombre es: ${nombre}`);

// ejercicio 22

let dia = prompt("Introduce el día (escribe 'entre semana' o 'fin de semana'):");
let horaCierre;

if (dia === "entre semana") {
    horaCierre = "20:00";
} else {
    horaCierre = "14:00";
}

alert(`La hora de cierre de la tienda es: ${horaCierre}`);