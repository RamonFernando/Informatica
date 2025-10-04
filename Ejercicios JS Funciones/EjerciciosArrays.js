// Crea un array con llamado edades que tenga 5 enteros. 
// Crea una funcion que recorra el array y muestre por pantalla el contenido de cada una de las posiciones.
let edades = [20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19, 2];

// Metodo tradicional for
function mostrarEdades(edades){
    for (let i = 0; i < edades.length; i++) {
        console.log(edades[i]);
    }
}
// Cuando no necesitas el indice mejor for of
function mostrarEdades(edades){
    for (edad of edades) {
        console.log(edad);
    }
}

// forEach
function mostrarEdades(edades){
    edades.forEach(edad => {
        console.log(edad);
    });
}

// Tambien tenemos el map
function mostrarEdades(edades){
    edades.map(edad => {
        console.log(edad);
    });
}


mostrarEdades(edades);

// Metodos para buscar en un array
// busca la primera coincidencia y devuelve el indice
// busca la edad igual a 60

// findIndex: busca en el array y devuelve el indice
function buscarEdad(edades){
    console.log("Posicion: " + edades.findIndex(edad => {
        return edad === 39;
    }));
}
buscarEdad(edades);
// includes
console.log(edades.includes(30));

// IndexOf
console.log(edades.indexOf(30));

// Buscar las edades menores a 30
// filter
console.log(
    edades.filter(edad => {
        return edad < 30; // devuelve todos los elementos que cumplan la condicion
    })
);
// find 
console.log(
    edades.find(edad => {
        return edad < 30; // devuelve el primer elemento que cumpla la condicion
    })
);

