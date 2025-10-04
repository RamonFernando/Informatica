// Arrays o Arreglos

//Nota: Los objetos se crean cpn {} y los arrays se crean con []
//Nota: Cuando intentas acceder a una posicion que no existe dentro del array te devuele undefined
const numeros = [10, 20, 30, 40, 50, 60];

// table permite mostrar el array como una tabla
console.table(numeros);
console.log(numeros);

/**
Array: nombreArray = [10,20,30,40,50,60]; 
Constructor: const nombreConstructor = new Array('ejemplo1','ejemplo2',...); **/

// Constructor (Esto es un constructor llamado meses)
// const meses = new Array('Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio');
const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio'];

console.table(meses);
console.log(meses);

// Ejemplos de arrays 
const arreglo = ["hola mundo", 800, true, false, null,{nombre: "Ramon", edad: 35, sexo: "Masculino", activo: true}, [1,2,3,4,5], "boolean", "string", 10];

console.table(arreglo);
console.log(arreglo);

// Acceder a los elementos de un array o arreglos
console.log(arreglo[5]);
// Muestra el objeto de la posicion 5 del array
console.log(arreglo[5].nombre + " " + arreglo[5].edad + " " + arreglo[5].sexo);
console.log(`Nombre: ${arreglo[5].nombre}, Edad: ${arreglo[5].edad}, Sexo: ${arreglo[5].sexo}`);
// Muestra el objeto de la posicion 6 del array y en ese array muestra la posicion 3
console.log(arreglo[6][3]);
console.log(`Nombre: ${arreglo[6][3]}`);

// Intentando acceder a una posicion que no existe para que retorne undefined
console.log(`Posicion 10: ${arreglo[10]}`);

// Conocer la extension de un array
console.log(`Extension del Array(Arreglo): ${arreglo.length} posiciones en el array`);
console.log(`Extension del Array(Objeto): ${Object.keys(arreglo).length} posiciones en el objeto`);
// Con este metodo cuenta todas las posiciones existentes en el array incluyendo los arrays que contenga 
console.log(`Extensiones del Array(Arreglo): ${arreglo[0].length} posiciones en el array`);
console.log(meses.length);

// forEach para recorrer arrays
console.log("forEach meses");
// Se inizializa el contador en 1
contador = 1;
// El forEach recorre el array hasta que acabe
meses.forEach( function(meses){
    console.log(`${contador}º Mes: ${meses}`);
    // El contador va sumando de 1 en 1 por cada iteracion del forEach
    contador++;
} );
// Muestra los elementos del array numeros
let contador1 = 0;
console.log("forEach numeros");
numeros.forEach( function(numeros){
    console.log(`${contador1}º: ${numeros}`);
    contador1++;
})
/** AGREGAR ELEMENTOS **/
// Agregar elemento al array (anticuado)
//numeros[6] = 70;
//console.log(numeros);
//console.table(numeros);

// Agregar elemento al array (menos anticuado) con push
numeros.push(70, 80, 90); // Agrega al final del array
// Agregar elementos al array (menos anticuado) con unshift
numeros.unshift(0,1,2,3); // Agrega al principio del array

//Mostrando datos por consola despues del cambio
console.log(numeros);
console.table(numeros);

/** ELIMINAR ELEMENTOS **/
// Eliminar elemento del array
numeros.pop(); // Elimina el ultimo elemento del array
// Eliminar elemento del array
numeros.shift(); // Elimina el primer elemento del array
// Eliminar elemento del array
numeros.splice(2, 1); // Elimina el elemento en la posicion 2 del array y elimina 1 elemento

//Mostrando datos por consola despues del cambio
console.log(numeros);
console.table(numeros);

/** MODIFICAR ELEMENTOS **/
// Modificar elemento del array
// Rest Operator o Spread Operator

// Modificando el array original y agregando elemento al array usando Rest Operator (actualizado)
const nuevoArreglo = [...meses, "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"];
console.log(nuevoArreglo);

