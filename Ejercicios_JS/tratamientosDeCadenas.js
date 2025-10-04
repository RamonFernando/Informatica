// Ejemplo 1: length()
let texto1 = "Hola, mundo!";
let longitud = texto1.length;
console.log("1. Longitud de la cadena: " + longitud);

// Ejemplo 2: charAt(numPosicion)
let caracter = texto1.charAt(5);
console.log("2. Carácter en la posición 5: " + caracter);

// Ejemplo 3: replace('caracter_antiguo','caracter_nuevo')
let textoReemplazado = texto1.replace('o', 'a');
console.log("3. Cadena después de reemplazar 'o' por 'a': " + textoReemplazado);

// Ejemplo 4: indexOf(textoABuscar)
let posicion = texto1.indexOf("mundo");
console.log("4. Posición de 'mundo': " + posicion);

// Ejemplo 5: lastIndexOf(textoABuscar)
let texto2 = "Hola, mundo! ¿Mundo?";
let ultimaPosicion = texto2.lastIndexOf("mundo");
console.log("5. Última posición de 'mundo': " + ultimaPosicion);

// Ejemplo 6: localeCompare(textoPorComparar)
let texto3 = "Hola";
let texto4 = "Hola";
let comparacion = texto3.localeCompare(texto4);
console.log("6. Comparación de 'Hola' con 'Hola': " + comparacion);

// Ejemplo 7: substring(posiciónInicial, posiciónFinal)
let subcadena = texto1.substring(0, 5);
console.log("7. Subcadena de 'Hola, mundo!': " + subcadena);

// Ejemplo 8: split(textoSeparador)
let texto5 = "Uno,Dos,Tres";
let partes = texto5.split(",");
console.log("8. Cadena separada: ");
partes.forEach(parte => {
    console.log(parte);
});

// Ejemplo 9: String(valor)
let numero = 123;
let textoNumero = String(numero);
console.log("9. Número como cadena: " + textoNumero);

// Ejemplo 10: parseInt(texto)
let textoNumero2 = "456";
let numeroConvertido = parseInt(textoNumero2);
console.log("10. Cadena convertida a número: " + numeroConvertido);