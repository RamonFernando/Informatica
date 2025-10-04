// Ejemplos de reduce

/*
Cuando usar reduce:
Acumulación de valores:
Sumar, multiplicar, concatenar.
Transformación de estructuras:
Convertir arrays en objetos, cadenas, u otros arrays.
Aplanamiento o combinación:
Unir múltiples arrays en uno.
Filtrado y agrupamiento avanzado:
Contar ocurrencias, categorizar datos.
*/

// 1. Sumar todos los números de un array:
let numeros = [7, 1, 2, 3, 4, 9, 8, 5];

let suma = numeros.reduce((acumulador, valorActual) => acumulador + valorActual, 0);

console.log(suma); // Salida: 39
/*
Explicación:

Comienza con acumulador = 0 (el valorInicial).
Itera sobre el array:
1ª iteración: acumulador = 0 + 1 = 1.
2ª iteración: acumulador = 1 + 2 = 3.
3ª iteración: acumulador = 3 + 3 = 6.
4ª iteración: acumulador = 6 + 4 = 10.
5ª iteración: acumulador = 10 + 5 = 15.
Devuelve el resultado final: 15.
*/

// ** ---------------------------------------------------------------------------- ** //

// 2. Encontrar el valor máximo de un array: Math.max

let maximo = numeros.reduce((max, num) => Math.max(max, num));

console.log(maximo); // Salida: 9

// 2.1 Encontrar el valor mínimo de un array: Math.min
let minimo = numeros.reduce((min, num) => Math.min(min, num));
console.log(minimo); // Salida: 1

let promedio = numeros.reduce((total, num) => total + num / numeros.length, 0);

console.log(promedio); // Salida: 4,875

// 3. Encontrar el valor maximo de un array:
let numMaximo = numeros.reduce((acumulador, valorActual) => 
    acumulador > valorActual ? acumulador : valorActual
);
console.log(numMaximo);

// Compara el acumulador con el valorActual y guarda el mayor.
// El resultado final es el valor máximo.


// ** ---------------------------------------------------------------------------- ** //

// 4. Convertir un array a un objeto:
// Imagina que tienes un array de nombres y quieres contarlos:
let nombres = ["Ana", "Juan", "Ana", "Pedro", "Juan"];

let contador = nombres.reduce((acumulador, nombre) => {
    acumulador[nombre] = (acumulador[nombre] || 0) + 1;
    return acumulador;
}, {});

console.log(contador);
// Salida: { Ana: 2, Juan: 2, Pedro: 1 }

// acumulador comienza como un objeto vacío {}.
//Para cada nombre, incrementa el contador correspondiente o lo inicializa en 1.

// ** ---------------------------------------------------------------------------- ** //

// 4. Aplanar un array anidado:
let arrayAnidado = [[1, 2], [3, 4], [5, 6]];

let arrayAplanado = arrayAnidado.reduce((acumulador, i) => acumulador.concat(i), []);

console.log(arrayAplanado);
// Salida: [1, 2, 3, 4, 5, 6]

// concat combina los arrays en uno solo.
// Comienza con un array vacío como valorInicial.