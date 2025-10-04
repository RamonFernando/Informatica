// Escribe una función que reciba una cadena de texto y cuente cuántas vocales tiene.

// La propiedad o método match() es una función de los strings que permite encontrar 
// coincidencias en una cadena de texto basándose en una expresión regular.
// Match: Devuelve un array con las coincidencias encontradas o null si no hay ninguna coincidencia.

// EJEMPLO MATCH
let texto = "Hola, ¿cómo estás?";

// Utilizamos la propiedad match() para encontrar todas las vocales en el texto
let vocales = texto.toLowerCase().match(/[aeiouáéíóú]/g); // g indica que se buscan todas las ocurrencias
console.log(vocales.length);

// Propiedad include: Este metodo te permitira saber si una cadena de texto se encuentra en otra cadena de texto
let contVocales = 0;
let vocal = "aeiouAEIOUáéíóú";

for(letra of texto){
    if(vocal.includes(letra)){
        contVocales++;
    }
}
console.log(contVocales);

// mostramos las vocales con la propiedad length
for(letra of texto){
    if(vocal.includes(letra)){
        console.log(letra);
    }

}
console.log(texto.length);

// Hacerlo con funciones 
function contarVocales(texto) {
    let vocales = texto.toLowerCase().match(/[aeiouáéíóú]/g); // g indica que se buscan todas las ocurrencias
    return vocales.length;
}

console.log(contarVocales(texto));

function contarVocales2(texto) {
    let contVocales = 0;
    let vocal = "aeiouáéíóú";
    for (letra of texto) {
        if(vocal.includes(letra)){
            contVocales++;
        }
    }
    return contVocales;
}
console.log(contarVocales2(texto));

function mostrarVocales(texto) {
    let vocales = "aeiouáéíóú";
    for (letra of texto){
        if(vocales.includes(letra)){
            console.log(letra);
        }
    }
}
mostrarVocales(texto);

