let numeros = [1, 2, 3, 2, 4];
let colores = ["rojo", "azul", "verde", "azul"];

// Buscar el índice de la última aparición de "2"
let ultimoIndice = numeros.lastIndexOf(2);
console.log(ultimoIndice); // 3

// Buscar el índice de la primera aparición de "azul"
ultimoIndice = colores.indexOf("azul");
console.log(ultimoIndice); // 1

// lastIndexOf busca desde el final del array hacia el inicio y devuelve el índice de la primera coincidencia.