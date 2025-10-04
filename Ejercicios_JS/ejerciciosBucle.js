// ejercicio 1 y 2

let contador = 5;
let suma = 0;

while (contador <= 1000) {
    suma += contador;
    contador += 5;
}

console.log("La suma de todos los múltiplos de 5 entre 1 y 1000 es:", suma);

// ejercicio 3

let exponente = 0;
let potencias = [];

do {
    let potencia = Math.pow(3, exponente);
    
    if (potencia < 12000) {
        potencias.push(potencia);
        console.log(`3^${exponente} = ${potencia}`);
    }
    
    exponente++;
} while (Math.pow(3, exponente) < 12000);

console.log("Potencias de 3 menores que 12000:", potencias);

// ejercicio 4

for (let i = 0; i < 5; i++) {
    const numero = parseInt(prompt("Introduce un número entero:"));
}

console.log("Has fallado");
alert("Has fallado");

// ejercicio 5

const numeroAleatorio = Math.floor(Math.random() * 10 + 1);
let intentos = 0;
let adivinado = false;

do {
    const adivinanza = parseInt(prompt("Adivina el número entre 1 y 10:"));

    intentos++;

    if (adivinanza === numeroAleatorio) {
        adivinado = true;
        alert("¡Felicidades! Has adivinado el número.");
    } else {
        alert("Incorrecto. Intenta de nuevo.");
    }

} while (!adivinado && intentos < 3);

if (!adivinado) {
    alert(`Lo siento, no has adivinado el número. Era ${numeroAleatorio}.`);
}