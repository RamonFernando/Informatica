// Escribe una función que reciba un array de palabras y devuelva un nuevo array
// solo con las palabras que tengan más de 4 letras.

let palabras = ["hola", "mundo", "JavaScript", "PHP", "Python"];
let palabrasFiltradas = palabras.filter((palabra) => palabra.length > 4);
console.log(palabrasFiltradas);

// hecho con funciones
function filtrarPalabras(palabras) {
    return palabras.filter(palabra => palabra.length > 4);
}
console.log(filtrarPalabras(palabras));

// Metodo tradicional de hacerlo
let palabrasFiltradas2 = [];
for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > 4) {
        palabrasFiltradas2.push(palabras[i]);
    }
}
console.log(palabrasFiltradas2);