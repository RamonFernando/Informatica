let texto = "Hola, ¿cómo estás?";
let indice = texto.search("cómo");
console.log(indice); // Salida: 6 (posición donde comienza "cómo")


let texto1 = "Hola, ¿cómo estás?";
let indice1 = texto1.search(/có/); // Busca la secuencia "có"
console.log(indice1); // Salida: 6


let texto2 = "Hola, ¿cómo estás?";
let indice2 = texto2.search("adiós");
console.log(indice2); // Salida: -1 (no encontró "adiós")

/*
EXPLICACION DE LOS MÉTODOS
search(): Busca una cadena dentro de otra cadena y devuelve la posición donde se encuentra la cadena buscada.

Diferencias entre search y otros métodos como indexOf:
Expresiones regulares:

search puede usar expresiones regulares para buscar patrones complejos.
indexOf solo busca una cadena literal.
Uso básico:

Ambos devuelven el índice de la primera coincidencia, pero search es más potente cuando necesitas patrones avanzados.
*/