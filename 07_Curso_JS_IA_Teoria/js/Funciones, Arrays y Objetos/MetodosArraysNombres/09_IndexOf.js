let colores = ["rojo", "azul", "verde", "azul"];
let numeros = [1, 2, 3, 4, 5];

// Buscar el índice de "azul"
let indice = colores.indexOf("azul");
console.log(indice); // 1

// Buscar un elemento inexistente
let noExiste = colores.indexOf("amarillo");
console.log(noExiste); // -1

// Buscar el índice de 3
indice = numeros.indexOf(3);
console.log(indice); // 2

// indexOf busca desde el inicio del array y devuelve el índice de la primera coincidencia.