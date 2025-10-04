/*
15.- Crea un programa que declare un array con las siguientes temperaturas de las últimas dos
semanas y devuelva la temperatura media:
15 ºC 16'1 ºC 16 ºC 15'4 ºC 15 ºC 11 ºC 14 ºC 11'5 ºC 10 ºC 10'2 ºC 10'1 ºC 9'8 ºC 9 ºC 6 ºC
Hacer este ejemplo con el metodo reduce
*/

let temperaturas = [15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6];
let temperaturaMedia1 = temperaturas.reduce((total, temperatura) => total + temperatura, 0) / temperaturas.length;
console.log("La temperatura media es: " + temperaturaMedia1.toFixed(2) + " ºC");

let temperaturaMayor12 = temperaturas.reduce((temperatura, temperaturas) => temperatura + (temperaturas > 12 ? 1 : 0), 0);
console.log("Numero de temperaturas por encima de 12 ºC: " + temperaturaMayor12);

// con filter
let temperaturaMedia2 = temperaturas.filter(temperatura => temperatura > 12);
console.log("Hay " + temperaturaMayor12 + " temperaturas mayores a 12 - [" + temperaturaMedia2.join(", ") + "]");


// metodo tradicional 
let total = 0;
for (let i = 0; i < temperaturas.length; i++) {
    total += temperaturas[i];
}
let temperaturaMedia = total / temperaturas.length;
console.log("La temperatura media es: " + temperaturaMedia.toFixed(2) + " ºC");

/*
Cómo funciona reduce en este ejemplo:
Supongamos que temperaturas = [20, 22, 19, 24, 18].

Inicio:

total comienza en el valorInicial, que es 0.
Primera iteración:
total = 0 + 20 = 20
Segunda iteración:
total = 20 + 22 = 42
Tercera iteración:
total = 42 + 19 = 61
Cuarta iteración:
total = 61 + 24 = 85
Quinta iteración:
total = 85 + 18 = 103
Resultado de reduce:

El resultado final de reduce es 103, que es la suma de todas las temperaturas.
Después de obtener la suma total de las temperaturas con reduce, se divide por la cantidad de temperaturas en el array:

total / temperaturas.length
total: Es el resultado de reduce (en este caso, 103).
temperaturas.length: Devuelve el número de temperaturas en el array (en este caso, 5).
Cálculo:

temperaturaMedia1 = 103 / 5; // Resultado: 20.6
La temperatura media es: 20.60 ºC
*/