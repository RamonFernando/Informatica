// ejercicio 1

let libros = [];

for (let i = 0; i < 5; i++) {
    let libro = {};

    libro.ISBN = prompt("Introduce el ISBN del libro " + (i + 1) + ":");
    libro.titulo = prompt("Introduce el título del libro " + (i + 1) + ":");
    libro.autor = prompt("Introduce el autor del libro " + (i + 1) + ":");
    libro.editorial = prompt("Introduce la editorial del libro " + (i + 1) + ":");

    libros.push(libro);
}

console.log("Lista de libros:");
for (let i = 0; i < libros.length; i++) {
    console.log(libros[i].ISBN + " " + libros[i].titulo + " " + libros[i].autor + " " + libros[i].editorial);
}

// ejercicio 2

let cotizaciones = [47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7];
let minimo = cotizaciones[0];
let maximo = cotizaciones[0];

for (let i = 1; i < cotizaciones.length; i++) {
    if (cotizaciones[i] < minimo) {
        minimo = cotizaciones[i];
    }
    if (cotizaciones[i] > maximo) {
        maximo = cotizaciones[i];
    }
}

console.log("Cotizaciones de Microsoft:");
console.log("Mínimo: " + minimo);
console.log("Máximo: " + maximo);

// ejercicio 3

let cotizaciones2 = [47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7];

for (let i = 0; i < cotizaciones2.length - 1; i++) {
    let indiceMinimo = i;

    for (let j = i + 1; j < cotizaciones2.length; j++) {
        if (cotizaciones2[j] < cotizaciones2[indiceMinimo]) {
            indiceMinimo = j;
        }
    }

    if (indiceMinimo !== i) {
        let temp = cotizaciones2[i];
        cotizaciones2[i] = cotizaciones2[indiceMinimo];
        cotizaciones2[indiceMinimo] = temp;
    }
}

console.log("Cotizaciones de Microsoft ordenadas de menor a mayor:");
console.log(cotizaciones2);

// ejercicio 4

let temperaturas = [3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6];
let posicionPrimeraNegativa = -1;

for (let i = 0; i < temperaturas.length; i++) {
    if (temperaturas[i] < 0) {
        posicionPrimeraNegativa = i;
        break;
    }
}

console.log("La posición de la primera temperatura menor que cero es:", posicionPrimeraNegativa);