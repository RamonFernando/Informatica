// ejercicio 1 y 2

const numeroAleatorio = Math.floor(Math.random() * 10 + 1);
let intentos = 0;
let maxIntentos = 3;
let puntuacion = 0;

while (intentos < maxIntentos) {
    const adivinanza = parseInt(prompt("Adivina el número entre 1 y 10:"));

    intentos++;

    if (adivinanza === numeroAleatorio) {
        if (intentos === 1) {
            puntuacion = 10;
        } else if (intentos === 2) {
            puntuacion = 5;
        } else if (intentos === 3) {
            puntuacion = 2;
        }
        
        alert(`¡Felicidades! Has adivinado el número ${numeroAleatorio} en ${intentos} intentos. Tu puntuación es: ${puntuacion}`);
        break;
    } else {
        alert("Incorrecto. Intenta de nuevo.");
    }
}

if (intentos === maxIntentos) {
    alert(`Lo siento, no has adivinado el número. Era ${numeroAleatorio}. Tu puntuación es: ${puntuacion}`);
}

// ejercicio 3 y 4

while (true) {
    const num1 = Math.floor(Math.random() * 100 + 1);
    const num2 = Math.floor(Math.random() * 100 + 1);
    const suma = num1 + num2;
    const respuestaUsuario = parseInt(prompt(`¿Cuál es la suma de ${num1} + ${num2}?`));

    if (respuestaUsuario === suma) {
        alert("¡Correcto! Has acertado.");
    } else {
        alert(`Incorrecto. La respuesta correcta es ${suma}.`);
    }

    const continuar = prompt("¿Quieres continuar (s/n)?").toLowerCase();

    if (continuar !== 's') {
        break;
    }
}

alert("Gracias por jugar. ¡Hasta la próxima!");

// ejercicio 5 y 6

let numero;

do {
    numero = parseInt(prompt("Introduce un número para ver su tabla de multiplicar (0 para salir):"));

    if (numero === 1) {
        alert("No seas tonto.");
        continue;
    }

    if (numero !== 0) {
        alert(`Tabla de multiplicar del ${numero}:`);
        for (let i = 1; i <= 10; i++) {
            const resultado = numero * i;
            alert(`${numero} x ${i} = ${resultado}`);
        }
    } else {
        alert("Tabla de multiplicar del 0:");
        for (let i = 1; i <= 10; i++) {
            alert(`0 x ${i} = 0`);
        }
    }
} while (numero !== 0);

alert("Gracias por usar la calculadora de tablas de multiplicar. ¡Hasta la próxima!");