// forEach
const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio'];
// const persona = [nombre = "Ramon", apellido = "Perez", numero = 672774786, edad = 35, sexo = "masculino", activo = true];

// forEach con contador
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
// Iteracion: Se le llama iteracion a cada pasada del forEach por cada elemento del array


const arreglo = ["hola mundo", 800, true, false, null,{nombre: "Ramon", edad: 35, sexo: "Masculino", activo: true}, [1,2,3,4,5], "boolean", "string", 10, persona = [nombre = "Ramon", apellido = "Perez", numero = 672774786, edad = 35, sexo = "masculino", activo = true]];
// Mostrando por consola un objeto (Array con otro array anidado)
arreglo.forEach( function(arreglo){
    console.log(arreglo);
});

// forEach con contador
contador = 0;
arreglo.forEach( function(arreglo){
    console.log(`${contador}º : ${arreglo}`);
    contador++;
});
// Para mostrar el objeto persona dentro del array meses.
console.log("Objeto: persona");
persona.forEach( function(persona){
    console.log(persona);
})