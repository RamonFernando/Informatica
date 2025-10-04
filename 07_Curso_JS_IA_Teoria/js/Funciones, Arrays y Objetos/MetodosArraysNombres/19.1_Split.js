// Ejemplo 1
const texto = "Aprender JavaScript es divertido";
const palabras = texto.split(" "); // Divide por los espacios
console.log(palabras);
// Salida: ["Aprender", "JavaScript", "es", "divertido"]

// Cada palabra se almacena en un elemento del array y se separan por espacios.

// Ejemplo 2
const datos = "manzana,pera.uva,naranja.mango";
const frutas = datos.split(/[.,]/); // Usa una expresión regular para dividir por ',' o '.'
console.log(frutas);
// Salida: ["manzana", "pera", "uva", "naranja", "mango"]

/*
split(delimitador): Divide una cadena según el delimitador especificado.
Uso de expresiones regulares: En el ejemplo avanzado, [.,] indica que se divida por punto (.) o coma (,). 
*/